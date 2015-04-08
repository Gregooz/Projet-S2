package CPU.implementations;

import java.util.ArrayList;
import java.util.List;

import Jeu.Simulation;
import CPU.*;

/**
 * This abstract class provides methods and fields that are needed for almost
 * every good mastermind strategy and thus decreases code duplication.
 */
public abstract class BasicStrategy implements IMastermindStrategy {

	/** Length of the secret sequence */
	protected final int CODE_LENGTH;
	/** Cache of all possible codes to prevent unnecessary function calls */
	protected final List<Code> allCodes;
	/** Cache of all possible answers to prevent unnecessary function calls */
	protected final List<Answer> allAnswers;
	/** Set of the remaining consistent codes */
	protected List<Code> consistentCodes;
	/** Last tried guess */
	protected Code lastGuess;
	/** Last pushed button. Needed to determine the next shortest route */
	protected T lastButton;
	
	public BasicStrategy(int codeLength) {
		this.CODE_LENGTH = codeLength;
		this.allCodes = Code.createAllCodes(this.CODE_LENGTH);
		this.consistentCodes = new ArrayList<Code>();
		this.allAnswers = Answer.createAllAnswers(this.CODE_LENGTH);
	}

	/**
	 * Reset the state of the strategy and return a good first guess.
	 * 
	 * The reset method should be the same for every good strategy simply
	 * because there is not much to it. The only intelligent thing to do is to
	 * try a code whose first button is the same as the last pushed button in
	 * order to minimize the travel distance for the robot.
	 */
	public Code reset() {
		// Refill consistent codes
		this.consistentCodes.clear();
		this.consistentCodes.addAll(this.allCodes);
		// Try a code with minimal travel distance
		if (lastButton != null) {
			this.lastGuess = this.consistentCodes.get(0);
		} else {
			this.lastGuess = consistentCodes.get(0);
		}
		this.lastButton = this.lastGuess.get(this.CODE_LENGTH - 1);
		return this.lastGuess;
	}

	/**
	 * Filter consistent codes from 'codes'. 'codes' is not changed during this
	 * method call.
	 * 
	 * A code is consistent if the answer from comparing 'lastGuess' and a code
	 * from 'codes' is the same as the answer from comparing 'lastGuess' and the
	 * secret code given by the game.
	 * 
	 * @param codes
	 *            List of codes where consistent codes are filtered
	 * @param lastGuess
	 *            Last tried guess
	 * @param answer
	 *            Answer by the game for the last tried guess
	 */
	protected List<Code> getConsistentCodes(List<Code> codes,
			Code lastGuess, Answer answer) {
		List<Code> result = new ArrayList<Code>();
		for (Code code : codes) {
			if (lastGuess.compare(code).equals(answer)) {
				result.add(code);
			}
		}
		return result;
	}

	/**
	 * Remove inconsistent codes from 'codes'. 'codes' is mutated.
	 * 
	 * A code is inconsistent if the answer from comparing 'lastGuess' and a
	 * code from 'codes' is not the same as the answer from comparing
	 * 'lastGuess' and the secret code given by the game.
	 * 
	 * @param codes
	 *            List of codes where inconsistent codes are removed from
	 * @param lastGuess
	 *            Last tried guess
	 * @param answer
	 *            Answer by the game for the last tried guess
	 */
	public void removeInconsistentCodes(List<Code> codes, Code lastGuess,
			Answer answer) {
		// Iterate the list from behind for performance reasons and in order
		// to not skip codes
		for (int i = codes.size() - 1; i >= 0; i--) {
			if (!lastGuess.compare(codes.get(i)).equals(answer)) {
				codes.remove(i);
			} 
		}
	}



}