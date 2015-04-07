/**
* Classe Partie
* 
*@author 
*@version 1.0
*
*/




public class Partie
{
	private Joueur joueur;
	private Combinaison combinaison;
/** 
*Constructeur de la classe Partie
*@param 
*/

	public Partie(String pseudo)
	{
		this.joueur = new Joueur(pseudo);
	}

	public Partie()
	{
		this.joueur = new Joueur("Joueur1");
	}

	private void getCombiJoueur()
	{
		this.combinaison = this.joueur.getCombi();
	}
	
}