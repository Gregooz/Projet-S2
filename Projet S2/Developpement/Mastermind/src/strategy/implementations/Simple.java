package strategy.implementations;
/**
 * 
 * @author Nicolas GOUREAU
 * @version 1.0
 */
import strategy.Answer;
import strategy.Code;

/**
 * Class Simple strategy. 
 */
public class Simple extends BasicStrategy {

	public Simple(int codeLength) {
		super(codeLength);
	}
/** Method to reset the field of allCOdes to return the first occur of code.
 * To begin a new game.
 */
	@Override
	public Code reset() {
		// Refill consistent codes
		this.consistentCodes.clear();
		this.consistentCodes.addAll(this.allCodes);
		
		this.lastGuess = this.consistentCodes.get(0);
		return this.lastGuess;
	}
/**
 * Method to answer the Mastermind problems
 * return a guess in the consistent Code's field.
 */
	@Override
	public Code guess(Answer answer) {		
		this.removeInconsistentCodes(this.consistentCodes, this.lastGuess,
				answer);
		this.lastGuess = this.consistentCodes.get(0);
		return this.lastGuess;
	}

	@Override
	public String toString() {
		return "Simple";
	}

}