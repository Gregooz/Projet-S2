package Jeu;

import CPU.implementations.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import CPU.*;


public class Test {
	
	private static int CODE_LENGTH = 4; 
	
	public static Code createRandomCode(int length) {
		Random rnd = new Random();
		T[] ts = new T[length];
		for (int i = 0; i < length; i++) {
			ts[i] = T.values()[rnd.nextInt(5)];
		}
		return new Code(ts);
	}
	
		public static void main (String args[]){
	
			 int timeLimit = 1000;
			int CPUSlowness = 0;
			double robotSpeed = 100;

			;
			
			
			BasicStrategy strategy = new Knuth2(CODE_LENGTH);
			List<Code> test = new ArrayList<Code>();
			test = Code.createAllCodes(CODE_LENGTH);
			for(int i=0;i< test.size();i++){
				System.out.println("Combinaison =" + test.get(i));
			}
			List<Answer> test2 = new ArrayList<Answer>();
				test2 = Answer.createAllAnswers(CODE_LENGTH);
				for(int i=0;i< test2.size();i++){
					System.out.println("R�ponses =" + test2.get(i));
			}
				Code secretCode = createRandomCode(CODE_LENGTH);
				//System.out.println(secretCode.toString());
					
			//	while (i<=11 || !(answer.blacks == CODE_LENGTH)) {
				
					Simulation simulation = new Simulation(CODE_LENGTH, strategy);
						Code guess = test.get(1);
					Answer answer = guess.compare(secretCode);
					 System.out.println(answer.toString());
					strategy.removeInconsistentCodes(test,guess,answer);
					// i++;
					for(int j=0;j< test.size();j++){
						System.out.println("Combinaison 2 =" + test.get(j));
					
				}
		}
}
