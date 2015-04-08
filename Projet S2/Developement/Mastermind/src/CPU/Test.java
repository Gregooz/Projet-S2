package CPU;

import Libs.*;
import Jeu.*;
public class Test
{
	public static void main(String[] args)
	{
		Joueur j1 = new Joueur("Michel");
		Partie partie = new Partie(j1, 5);
		j1.choisitCouleurPion();
		System.out.println(j1.combinaison);


	}
}