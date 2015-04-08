/**
* Classe Partie
* 
*@author 
*@version 1.0
*
*/


import liste.Liste;

public class Partie
{
	private Joueur joueur;
	private Combinaison combinaisonSecrete;
	private Ordinateur ordinateur;
	private int nbToursMax;
	private Couleur[] couleurs;	// Couleurs disponibles
	private Liste combinaison_p ; // Toutes les combinaisons déjà entrée.

/** 
*Constructeur de la classe Partie
*@param pseudo Pseudo du joueur
*@param nbToursMax nombres d'essais possibles pour le joueur.
*/

	public Partie(Joueur joueur,int nbToursMax)
	{
		this.joueur = joueur;
		this.nbToursMax = nbToursMax;
		this.ordinateur = new Ordinateur();
		this.combinaisonSecrete = new Combinaison(4);
		this.combinaison_p = new Liste();
	}


	public Partie()
	{
		this.joueur = new Joueur("Joueur1");
		this.nbToursMax = 8;
		this.ordinateur = new Ordinateur();
	}


	public void setNombrePion(int nombrePionMax)
	{
		this.combinaisonSecrete.setNombrePion(nombrePionMax);
	}


	public void setCouleursDisp(Couleur[] couleur)
	{
		this.couleurs = couleur;
	}


	public void getCombiJoueur()
	{
		this.combinaisonSecrete = this.joueur.getCombi();		
	}

	public int getNombrePion()
	{
		return this.combinaisonSecrete.getNombrePion();
	}


/** 
*Méthode équivalente à un 'main' de la partie
*@return Retourne Vrai si la combinaison à été trouvé Faux si non.
*/
	public boolean combiEquivalente()  /* A voir pour changer le nom de la méthode */
	{
		Combinaison comb = this.ordinateur.getCombi();
		combinaison_p.add (comb );

		boolean trouve = this.combinaisonSecrete.equals( comb ) ;

		

		return trouve;
	}

	public String toString()
	{
		String chaine = "";
		for (int i = 0; i< couleurs.length ; i++ ) 
		{
			chaine = chaine + "\nCouleurs " + i + ": " + couleurs[i];
		}
		return ("\nPartie:\nJoueur: "+this.joueur.getPseudo() +"    nbToursMax: "+this.nbToursMax + chaine);
	}



	public String affichage()
	{
		String chaine = "Les combinaisons déjà entrée sont: \n";
		for (int i=combinaison_p.size(); i>0 ; i-- ) 
		{
			chaine = "\n  " +i + "      " + combinaison_p.get(i).toString();
		}
		return chaine;
	}
}