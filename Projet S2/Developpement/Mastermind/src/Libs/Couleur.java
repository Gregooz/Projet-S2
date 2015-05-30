package Libs;
/**
 * 
 * @author Nicolas
 * @version 1.0
 * 
 * Class to have color in the console display
 */
public class Couleur {

	/*
	 * RESET("1"), BLACK("black"), RED("red"), GREEN("green"), YELLOW("yellow"),
	 * BLUE("blue"), PURPLE("purple"), CYAN("cyan"), WHITE("white");
	 */
	public static final String RESET = ("\u001B[0m");
	public static final String BLACK = ("\u001B[30m");
	public static final String RED = ("\u001B[31m");
	public static final String GREEN = ("\u001B[32m");
	public static final String YELLOW = ("\u001B[33m");
	public static final String BLUE = ("\u001B[34m");
	public static final String PURPLE = ("\u001B[35m");
	public static final String CYAN = ("\u001B[36m");
	public static final String WHITE = ("\u001B[37m");

	private String code;
	private int numero;

	/**
	 * Constructeur de la classe Couleur.
	 *  1 : noir 
	 * 	2 : rouge 
	 * 	3 : jaune 
	 * 	4 : vert 
	 *	5 : bleu 
	 * 	6 : purple 
	 * 	7 : white
	 *  8 : cyan
	 * 
	 * @param num Le numéro de la couleur
	 */
	public Couleur(int num) {
		this.numero = num;
//		switch (this.numero) {
//			case 1:
//				this.code = BLACK;
//			case 2:
//				this.code = RED;
//			case 3:
//				this.code = YELLOW;
//			case 4:
//				this.code = GREEN;
//			case 5:
//				this.code = BLUE;
//			case 6:
//				this.code = PURPLE;
//			case 7:
//				this.code = WHITE;
//			case 8:
//				this.code = CYAN;
//		}
//	}
		switch (this.numero) {
		case 1:
			this.code = "1";
			break;
		case 2:
			this.code = "2";
			break;			
		case 3:
			this.code = "3";
			break;
		case 4:
			this.code = "4";
			break;
		case 5:
			this.code = "5";
			break;
		case 6:
			this.code = "6";
			break;
		case 7:
			this.code = "7";
			break;
		case 8:
			this.code = "8";
			break;
		}
}

	@Override
	public String toString() {
		return code;
	}

	public boolean equals(Couleur couleur) {
		boolean b = false;
		if (this.numero ==  couleur.getNum()) {
			b = true;
		}
		return b;
	}
	/**
	 * Method to have the number of the color represent by the Color's object 
	 * @return the number of the color
	 */
	public int getNum() {
		return this.numero;
	}

}