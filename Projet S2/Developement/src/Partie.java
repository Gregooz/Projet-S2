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
	private Liste indices; // Liste contenant des combinaison de pion indice
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
		this.indices = new Liste();
	}


	public Partie()
	{
		this.joueur = new Joueur("Joueur1");
		this.nbToursMax = 8;
		this.ordinateur = new Ordinateur();
		this.combinaison_p = new Liste();
		this.indices = new Liste();
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

		Combinaison comb_indic = new Combinaison(4);
		PionIndice[] tab_indic = new PionIndice[4];
		Couleur rouge = new Couleur("rouge");
		Couleur blanc = new Couleur("blanc");


		for (int i =0; i < comb.getNombrePion() ; i++ ) 
		{
			for (int j=0; j< comb.getNombrePion(); j++) 
				{
					if( this.combinaisonSecrete.getCouleur(i).equals( comb.getCouleur(j) ));
					{
						if ( i==j )
						{
							tab_indic[i] = new PionIndice(rouge);
						}
						else // Si un pion est de bonne couleur ou mal placé
						{
							tab_indic[i] = new PionIndice(blanc);
						}
					}			
				}
		}
		comb_indic.setPionCombinaison(tab_indic);	
		this.indices.add(comb_indic);
		return trouve;
	}

	public String toString()
	{
		String chaine = "";
		return ("\nPartie:\nJoueur: "+this.joueur.getPseudo() +"    nbToursMax: "+this.nbToursMax + chaine);
	}



	public String affichage()
	{
		String chaine = "Les combinaisons déjà entrée sont: \n";

		for (int i=0 ; i<combinaison_p.size() ; i++ ) 
		{
			chaine =chaine+ "\n" + (i+1) + "      " + combinaison_p.get(i).toString();// +"   "+this.indices.get(i).toString();
		}
		return chaine;
	}

	public void initCombi()
	{

		Combinaison comb = new Combinaison(4);
		Combinaison comb1 = new Combinaison(4);
		PionCombinaison[] t_pions = new PionCombinaison[4];
		Couleur blanc = new Couleur("blanc");
		Couleur rouge = new Couleur("rouge");

		Combinaison comb_indic =new Combinaison(4);
		PionIndice[] tab_indic = new PionIndice[4];

		tab_indic[0] = new PionIndice(rouge);
		tab_indic[1] = new PionIndice(blanc);
		tab_indic[2] = new PionIndice(rouge);
		tab_indic[3] = new PionIndice(rouge);
		System.out.println(tab_indic);
		comb_indic.setPionCombinaison(tab_indic);
		this.indices.add(comb_indic);

		tab_indic[0] = new PionIndice(rouge);
		tab_indic[1] = new PionIndice(rouge);
		tab_indic[2] = new PionIndice(blanc);
		tab_indic[3] = new PionIndice(rouge);
		comb_indic.setPionCombinaison(tab_indic);
		this.indices.add(comb_indic);


		Couleur coul = new Couleur("rouge");
		t_pions[0] = new PionCombinaison(coul);

		coul = new Couleur("blanc");
		t_pions[1] = new PionCombinaison(coul);

		coul = new Couleur("cyan");
		t_pions[2] = new PionCombinaison(coul);

		coul = new Couleur("rouge");
		t_pions[3] = new PionCombinaison(coul);

		comb1.setPionCombinaison( t_pions);
		combinaison_p.add(comb1);


		coul = new Couleur("jaune");
		t_pions[0] = new PionCombinaison(coul);

		coul = new Couleur("bleu");
		t_pions[1] = new PionCombinaison(coul);

		coul = new Couleur("vert");
		t_pions[2] = new PionCombinaison(coul);

		coul = new Couleur("bleu");
		t_pions[3] = new PionCombinaison(coul);

		comb.setPionCombinaison( t_pions);
		//System.out.println(comb + "Nein");

		combinaison_p.add(comb);

	}
}