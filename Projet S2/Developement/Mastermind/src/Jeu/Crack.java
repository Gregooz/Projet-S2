package Jeu;

import CPU.implementations.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import CPU.Answer;
import CPU.Code;
import CPU.IMastermindStrategy;
import CPU.T;


public class Crack {

	private List<Code> allCodes; 
	private Partie partie;
	private BasicStrategy strat;

	public Crack( int CODE_LENGTH, Partie part, BasicStrategy strat){
		this.allCodes = Code.createAllCodes(CODE_LENGTH);
		this.partie=part;
		this.strat =strat;
	}


	public Code createRandomCode(int length) {
		Random rnd = new Random();
		T[] ts = new T[length];
		for (int i = 0; i < length; i++) {
			ts[i] = T.values()[rnd.nextInt(5)];
		}
		return new Code(ts);
	}

	public Code run( BasicStrategy strat){
		return (allCodes.get(0));
		
	}
	public Code run(BasicStrategy strat, Answer indice){
		this.strat.removeInconsistentCodes(allCodes, allCodes.get(0), indice);
		return(allCodes.get(0));
		
	}

}
