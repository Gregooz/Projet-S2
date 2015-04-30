package Jeu;

import CPU.implementations.*;
import Main.*;
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

	public void run( BasicStrategy strat){
		Code guess = allCodes.get(1);
		Answer answer = partie.compare(guess);
				strat.removeInconsistentCodes(allCodes,guess,answer);
	}


}
