package Jeu;

import java.util.List;

import strategy.Code;
/**
 * @author Nicolas GOUREAU
 * @version 1.0
 * Export class for the creation of all the code existing with a number
 * of pawn.
 * Allows generation of a List<Code> containing all the codes.
 */
public class AllCodes {
		private int CODE_LENGTH;
	/**
	 * Conctructor of the class
	 * @param CODE_LENGTH : Length of the code to be generated
	 */
	public AllCodes(int CODE_LENGTH){
		this.CODE_LENGTH =CODE_LENGTH;
	}
	/** Method to obtain te list of codes
	 * 
	 * @return A list containing all the code existing with the number of pawn 
	 * gived in the constructor
	 */
	public List<Code> getAllCodes(){
		return Code.createAllCodes(CODE_LENGTH);
	}


}
