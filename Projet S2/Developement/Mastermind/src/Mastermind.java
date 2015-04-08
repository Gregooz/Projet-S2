/**
* Classe Mastermind
* 
*@author 
*@version 1.0
*
*/




public class Mastermind
{	

			// Teste des classes 
	public static void main(String[] args)
	{
		Joueur j1 = new Joueur("Jacquie");

		Partie partie = new Partie(j1,5);
		// Joueur choisit les paramètres
			// nombre de pion dans la cbS
			// Choisit les couleurs disponibles
			// -> Ajouter les couleurs
		partie.setNombrePion(4);

		Couleur[] couleur = new Couleur[5];
		for (int i = 0; i <4; i++)
		{ 
			couleur[i] = new Couleur("C"+i);
		}
		partie.setCouleursDisp(couleur);
		partie.toString();
		//partie.choixCombi();

	}
}