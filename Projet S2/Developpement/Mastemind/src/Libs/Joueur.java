/**
* Classe Joueur
* 
*@author Ian Clement
*@version 1.0
*
*/
package Libs;

import strategy.Code;
import Jeu.Partie;



public class Joueur
{
	private String pseudo;
	private Code combinaison;
/** 
* Constructeur de la classe Joueur
*@param Pseudo Pseudo du joueur
*
*/
	public Joueur(String pseudo)
	{
		this.pseudo = pseudo;
		//this.combinaison = new Code();
	}

	/**
	 * Connaître le pseudo du joueur
	 * @return Retourne le pseudo du joueur
	 */
	public String getPseudo()
	{
		return this.pseudo;
	}

	/** 
	* modifieur du pseudo du joueur
	*@param Pseudo Pseudo du joueur
	*
	*/
	public void setPseudo(String pseudo)
	{
		this.pseudo = pseudo;
	}

	/** 
	* Récupéreur de la combinaison
	*@return Pseudo retourne la combinaison construite par le joueur
	*
	*/
	public Code getCombi()
	{
		return this.combinaison;
	}

	/** 
	* Modifie les couleurs des pions de la combinaison
	*@param  p1 PionCombinaison  
	*@param  p2 PionCombinaison
	*@param  p3 PionCombinaison
	*@param  p4 PionCombinaison
	*/		
	/*public void choisitCouleurPion(PionCombinaison p1, PionCombinaison p2, PionCombinaison p3, PionCombinaison p4)
	{
		PionCombinaison[] tableau = new PionCombinaison[4];
		tableau[1] = p1;
		tableau[2] = p2;
		tableau[3] = p3;
		tableau[4] = p4;

		this.combinaison.setPionCombinaison(tableau);

	}*/
/**
 * Modifie la combinaison du joueur
 * @param c La nouvelle combinaison 
 */
	public void setCombi(Code c)
	{
		this.combinaison = c;
	}
/**
 * Modifie le nombre de pion dans la combinaison du Joueur
 * @param nb Le nouveau nombre de pion
 *//*
	public void setNbPion(int nb) {
		
		this.combinaison.setNombrePion(nb);
	}*/

	
}