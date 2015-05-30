package strategy;
/**
 * @author Nicolas
 * 
 * @version 1.0
 */

/**
 * Enumeration of the buttons.
 * 
 *Allows to easily create the entire field of possible codes.
 */
public enum T {
	
	T0(0),
	T1(1),
	T2(2),
	T3(3),
	T4(4),
	T5(5),
	T6(6),
	T7(7);
	
	public final int i;
	
	/**
	 * Constructor
	 * 
	 * @param i Value of the "color" of the pawn
	 */
	T(int i) {
		this.i = i;
	}
	
	public static T getValues(int i) {
		switch (i) {
		case 0:
			return(T0);
			
		case 1:
			return(T1);
					
		case 2:
			return(T2);
			
		case 3:
			return(T3);
			
		case 4:
			return(T4);
			
		case 5:
			return(T5);
			
		case 6:
			return(T6);

		case 7:
			return(T7);
		}
		return null;
	}

}