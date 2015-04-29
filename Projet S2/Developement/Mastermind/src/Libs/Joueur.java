/**
* Classe Joueur
* 
*@author Ian Clement
*@version 1.0
*
*/
package Libs;



public class Joueur
{
	private String pseudo;
	private Combinaison combinaison;
	private Partie partie;
/** 
* Constructeur de la classe Joueur
*@param Pseudo Pseudo du joueur
*
*/

	public Joueur(String pseudo)
	{
		this.pseudo = pseudo;
	}

	public String getPseudo()
	{
		return this.pseudo;
	}

	public void setPseudo(String pseudo)
	{
		this.pseudo = pseudo;
	}

	public Combinaison getCombi()
	{
		return this.combinaison;
	}

	public void choisitCouleurPion(PionCombinaison p1, PionCombinaison p2, PionCombinaison p3, PionCombinaison p4)
	{
		PionCombinaison[] tableau = new PionCombinaison[4];
		tableau[1] = p1;
		tableau[2] = p2;
		tableau[3] = p3;
		tableau[4] = p4;

		this.combinaison.setPionCombinaison(tableau);

	}

}