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
	private Combinaison combinaisonSecrete;
	private Ordinateur ordinateur;
	private int nbToursMax;
	private Couleur[] couleurs;	// Couleurs disponibles
	private int nombrePionMax;

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


	private void getCombiJoueur()
	{
		this.combinaisonSecrete = this.joueur.getCombi();
	}


/** 
*Méthode équivalente à un 'main' de la partie
*@return Retourne Vrai si la combinaison à été trouvé Faux si non.
*/
	public boolean loop()  /* A voir pour changer le nom de la méthode */
	{
		int nbTours = 0;
		boolean trouve = false;

		Combinaison[] combinaison_p = new Combinaison[ this.nbToursMax];

		while ( nbTours <= this.nbToursMax || !trouve)
		{
			combinaison_p[ nbTours ] = this.ordinateur.getCombi();

			trouve = (this.combinaisonSecrete.equals( combinaison_p [nbTours ]) );

		}

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
}