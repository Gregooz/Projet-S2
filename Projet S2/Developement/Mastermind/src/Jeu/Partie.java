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
	private Combinaison[] combi_Enregistrer;
	private Combinaison[] combi_indice;
	private int numero_tour;
/** 
*Constructeur de la classe Partie
*@param pseudo Pseudo du joueur
*@param nbToursMax nombres d'essais possibles pour le joueur.
*/

	public Partie(Joueur joueur,int nbToursMax)
	{
		this.combi_Enregistrer = new Combinaison[nbToursMax];
		this.combi_indice = new Combinaison[nbToursMax];
		this.joueur = new Joueur("Joueur1");
		this.nbToursMax = nbToursMax;
		this.numero_tour = 0;
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
		boolean retour = false;
		if ( this.combi_Enregistrer[this.numero_tour].equals(this.combinaison)){
			retour = true;
			this.combi_indice[this.numero_tour] = new Combinaison(Couleur.RED,Couleur.RED,Couleur.RED,Couleur.RED);
		}
		else
		{
			int nb_bien_placeCouleur = this.combinaison.getNbBienPlaceCouleur(this.combi_Enregistrer[this.numero_tour]);
			int nb_bonne_couleur = this.combinaison.getNbBonneCouleur(this.combi_Enregistrer[this.numero_tour]);
			
			//for (int i = 0; i < nb)
		}
		
		
		
		return retour;
		
	}
	
	/** 
	*- Recupère la solution de l'ordi et l'ajoute dans les anciennes combi
	*
	*/
	public void combiOrdinateur() {
		/* Recupère la solution de l'ordi et l'ajoute dans les anciennes combi
		 */
		//this.combi_test[ this.combi_test.lenght() ] = this.ordinateur.getCombiCreer(); ?
		Combinaison comb_test = new Combinaison( this.joueur.getCombi().getNombrePion());
		comb_test.test();
		this.combi_Enregistrer[ this.numero_tour] = comb_test;
		this.numero_tour ++;
		 
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
	System.out.println("+ - - - Tour "+ this.numero_tour+ " - - - +\n");
	System.out.println("                    Votre Combi: "+ this.combinaison.toString());
	String chaine = this.numero_tour +" ";
	for (int i =0; i< this.numero_tour;i++)
	{
		chaine = chaine + this.combi_Enregistrer[i] + "    " + this.combi_indice[i] +"\n";
	}
	System.out.println(chaine);
	if (testEquivalence()){
		System.out.println("Perdu : L'ordinateur à trouver votre code !");
	}
	else {
		System.out.println("Appuyez sur une touche pour continuer...");
	}
	
	
	}



}