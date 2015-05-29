package simulation;

import java.util.Random;

import strategy.Answer;
import strategy.Code;
import strategy.IMastermindStrategy;
import strategy.T;

/**
 * A simulation of the specific mastermind alteration in an enclosed area with
 * robots trying to guess a secret code by pushing buttons without repetitions
 * in the correct order.
 */
public class Simulation {

	/** Code length for all codes**/
	private int codeLength;


	/**
	 * Create a simulation with the specified configuration.
	 * 
	 * @param timeLimit
	 *            Time limit in seconds
	 * @param CPUSlowness
	 *            Multiplied with the thinking time to simulate a slower cpu
	 * @param robotSpeed
	 *            Speed in mm/second
	 * @param codeLength
	 *            Code length
	 * @param strategy
	 *            Used strategy
	 */
	public Simulation(int codeLength, IMastermindStrategy strategy) {
		// Convert from seconds to milliseconds
		this.codeLength = codeLength;
	}
	/**
	 * Create and return a random code of specified length.
	 * 
	 * @param length
	 *            Length of the code
	 * @return Random code
	 */
	public static Code createRandomCode(int length) {
		Random rnd = new Random();
		T[] ts = new T[length];
		for (int i = 0; i < length; i++) {
			ts[i] = T.values()[rnd.nextInt(8)];
		}
		return new Code(ts);
	}

}