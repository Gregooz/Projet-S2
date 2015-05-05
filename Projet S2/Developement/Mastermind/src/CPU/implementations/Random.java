package CPU.implementations;

import Jeu.Simulation;
import CPU.*;

/**
 * A strategy that always guesses randomly.
 */
public class Random implements IMastermindStrategy {
	
	private final int CODE_LENGTH;
	
	public Random(int codeLength) {
		this.CODE_LENGTH = codeLength;
	}
	
	@Override
	public Code guess(Answer answer) {
		return Simulation.createRandomCode(this.CODE_LENGTH);
	}

	@Override
	public Code reset() {
		return Simulation.createRandomCode(this.CODE_LENGTH);
	}

	@Override
	public String toString() {
		return "Random";
	}

}