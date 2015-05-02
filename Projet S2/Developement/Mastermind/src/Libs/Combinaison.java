/**
* Classe Combinaison
* 
*@author 
*@version 1.0
*
*/

package Libs;


public class Combinaison
{
	private static Object getPion;
	private Pion[] pion;
	private int nombrePion;
	public static final String BACK_WHITE = "\u001B[47m";
	public static final String RESET = "\u001B[0m";
	public static final String BRIGHT = "\u001B[1m";

/** 
* Constructeur de la classe Combinaison
*@param 
*/
	
	public Combinaison(int nombrePion)
		{
			this.nombrePion = nombrePion;
			this.pion = new Pion[nombrePion];
		}

	public Combinaison(Couleur c1, Couleur c2, Couleur c3, Couleur c4)
	{
		this(4);
		this.pion[0] = new PionCombinaison(c1);
		this.pion[1] = new PionCombinaison(c2);
		this.pion[2] = new PionCombinaison(c3);
		this.pion[3] = new PionCombinaison(c4);
	}
	public Combinaison()
	{
		this(4);
	}

	public void setPionCombinaison(Pion[] pions)
	{		

		for (int i = 0 ;i < this.nombrePion ; i++)
		{
			this.pion[i] = pions[i];
		}
	}
	
	public void setPionCombinaison(int i, Pion p)
	{		
			this.pion[i] = p;

	}

	public void setNombrePion(int nombrePion)
	{
		this.nombrePion =nombrePion;
		this.pion = new PionCombinaison[ this.nombrePion ];
	}

	public int getNombrePion()
	{
		return this.nombrePion;
	}
	
	public Pion getPion(int i)
	{
		
		return this.pion[i];
	}

	public String toString()
	{
		String chaine = "";
		for (int i=0;i < this.nombrePion; i++) 
		{
			chaine = BRIGHT + chaine + BACK_WHITE +" "+ pion[i];
		}
		chaine = chaine + RESET;
		return chaine;	
	}
	
	public static boolean equals(Combinaison c1, Combinaison c2) {
		boolean retour = true;
		
		if (c1.nombrePion == c2.nombrePion) {
			for( int i=0; i<c1.nombrePion; i++) {
				if( c1.getPion(i).getCouleur().compareTo( c2.getPion(i).getCouleur() ) != 0){
					retour = false;
				}
			} 
		}
		else {
			retour = false;
		}
				
		return retour;
	}

	public void test() {
		
		this.pion[0] = new PionCombinaison(Couleur.BLUE);
		this.pion[1] = new PionCombinaison(Couleur.WHITE);
		this.pion[2] = new PionCombinaison(Couleur.WHITE);
		this.pion[3] = new PionCombinaison(Couleur.RED);

		for (int i = 3 ;i < this.nombrePion ; i++)
		{
			this.pion[i] = new PionCombinaison(Couleur.PURPLE);
		}
	}

	public int getNbBienPlaceCouleur(Combinaison combinaison) {
		// TODO Calculer les pions biens placers avec les bonnes couleurs
		
		return 0;
	}

	public int nb_mauvaise_couleur(Combinaison combinaison) {
		// TODO calculer le nombre de pions ayant la mauvaise couleur.
		return 0;
	}


}