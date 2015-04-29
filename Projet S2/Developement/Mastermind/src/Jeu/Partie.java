/**
* Classe Partie
* 
*@author 
*@version 1.0
*
*/
package Jeu;


public class Partie
{
	private Joueur joueur;
	private Combinaison combinaison;
	private Ordinateur ordinateur;
	private int nbToursMax;
/** 
*Constructeur de la classe Partie
*@param pseudo Pseudo du joueur
*@param nbToursMax nombres d'essais possibles pour le joueur.
*/

	public Partie(Joueur joueur,int nbToursMax)
	{
		this.joueur = new Joueur("Joueur1");
		this.nbToursMax = nbToursMax;
		this.ordinateur = new Ordinateur();
	}

/**
 * Constructeur de la classe partie sans paramètres
 */
	public Partie()
	{
		this.joueur = new Joueur("Joueur1");
		this.nbToursMax = 8;
		this.ordinateur = new Ordinateur();
	}

/**
 * Changer la combinaison
 */
	private void setCombiJoueur()
	{
		this.combinaison = this.joueur.getCombi();
	}


/** 
*Méthode équivalente à un 'main' de la partie
*@return Retourne Vrai si la combinaison à été trouvé Faux si non.
*/
	public boolean loop() // A voir pour changer le nom de la méthode
	{
		int nbTours = 0;
		boolean trouve = false;

		Combinaison[] combinaison_p = new Combinaison[ this.nbToursMax];

		while ( nbTours <= this.nbToursMax || !trouve)
		{
			combinaison_p[ nbTours ] = this.ordinateur.getCombi();

			trouve = (this.combinaison.equals( combinaison_p [nbTours ]) );

		}

		return trouve;
	}
}