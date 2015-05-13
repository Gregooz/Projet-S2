package Jeu;
import java.util.List;

import CPU.*;
import CPU.implementations.*;

public class Test {
	
	public static void main(String[] args){
		
	
	int CODE_LENGHT =4;
	BasicStrategy strategy = new Knuth(CODE_LENGHT);
	
	List <Code> allCodes=  Code.createAllCodes(CODE_LENGHT);
	
	Code yo =Simulation.createRandomCode(CODE_LENGHT);
	Code secretCode =Simulation.createRandomCode(CODE_LENGHT);
	int i =1;	
	Answer answer = yo.compare(secretCode);
	do{
	
	System.out.println(answer.toString() + " Tour n°"+i);
	strategy.removeInconsistentCodes(allCodes, yo,
			answer);
	yo = allCodes.get(0);
	answer = yo.compare(secretCode);
	
	for(Code c : allCodes){
		System.out.println(c.toString());
	}
	i++;
	}while(answer.getBlacks() != CODE_LENGHT);
	System.out.println(answer.toString() + " Tour n°"+i);
	System.out.println("Réponse :" + secretCode);
	}
	}
	
