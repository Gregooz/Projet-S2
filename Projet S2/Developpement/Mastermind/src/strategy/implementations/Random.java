package strategy.implementations;

import simulation.Simulation;
import strategy.Answer;
import strategy.Code;
/**
 * A strategy that always guesses randomly.
 */
public class Random extends BasicStrategy {
	
	public Random(int codeLength) {
		super(codeLength);
	}
	
	public Code guess(Answer answer) {
		return Simulation.createRandomCode(this.CODE_LENGTH);
	}


	public Code reset() {
		return Simulation.createRandomCode(this.CODE_LENGTH);
	}

	public String toString() {
		return "Random";
	}

}
