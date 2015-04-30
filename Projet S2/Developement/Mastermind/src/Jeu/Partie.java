/**
* Classe Partie
* 
*@author 
*@version 1.0
*
*/
package Jeu;
import Libs.*;
import CPU.Answer;
import CPU.Code;
import CPU.implementations.BasicStrategy;

public class Partie
{
	private Joueur joueur;
	private Combinaison combinaison;
	//private BasicStrategy ordinateur;
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
		//this.ordinateur = new Ordinateur();
	}

/**
 * Constructeur de la classe partie sans paramÃ¨tres
 */
	public Partie()
	{
		this.joueur = new Joueur("Joueur1");
		this.nbToursMax = 8;
		//this.ordinateur = new BasicStrategy();
	}

/**
 * Changer la combinaison
 */
	public void setCombiJoueur()
	{
		
		this.combinaison = this.joueur.getCombi();
		
	}

	public int getNbPion()
	{
		return this.joueur.getCombi().getNombrePion();
	}
/** 
*- Test l'equivalence de la dernière combi récup
 - renvoi vrai si les meme
 - ajoute une combi de pion indice pour lesquels pions sont bien placés
*@return Retourne Vrai si la combinaison Ã  Ã©tÃ© trouvÃ© Faux si non.
*/
	public boolean testEquivalence() {
		/* - Test l'equivalence de la dernière combi récup
		   - renvoi vrai si les meme
		   - ajoute une combi de pion indice pour lesquels pions sont bien placés
		  */
		return false;
		
	}
	
	/** 
	*- Recupère la solution de l'ordi et l'ajoute dans les anciennes combi
	*
	*/
	public void combiOrdinateur() {
		/* Recupère la solution de l'ordi et l'ajoute dans les anciennes combi
		 */
		 
	}

public void setNbPion(int nb) {
	this.joueur.setNbPion(nb);
	
}


/** 
*    - afficher la combi du joueur
*    - afficher toutes les combi de l'ordi
*	 -afficher nb d'essais
*	 -( afficher score)
*	 - affiche les indices
*/
public void affichage() {
	/* afficher la combi du joueur
	 - afficher toutes les combi de l'ordi
	 -afficher nb d'essais
	 -( afficher score)
	 -affiche les indices
	 
	*/ 
	
	
	
	}

}