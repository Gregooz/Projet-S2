/**
* Classe Partie
* 
*@author 
*@version 1.0
*
*/
package Libs;



public  class Pion
{
	private Couleur couleur;	

	/**
	 * Constructeur de la classe Pion
	 * @param couleur La couleur du pion
	 */
	public Pion(Couleur couleur)
	{
		this.couleur = couleur;
	}
	
	/**
	 * Constructeur de la classe Pion sans couleur rentrée en paramètre
	 */
	public Pion()
	{
		this.couleur = new Couleur(2);
	}

	/**
	 * Changer la couleur du pion
	 * @param couleur La nouvelle couleur du pion
	 */
	public void setPion(Couleur couleur)
	
	{
		this.couleur = couleur;
	}

	/**
	 * Retourne le pion de la bonne couleur
	 */
	public String toString()
	{
		return(this.couleur + "O");
	}
	
	/**
	 * Connaître la couleur du pion
	 * @return Retourne la couleur du pion
	 */
	public Couleur getCouleur() {
		return this.couleur;
	}
	
	/**
	 * Vérifier si deux pions sont égaux
	 * @param p Le pion auquel on veut comparer notre objet pion
	 * @return True si les pion ont la même couleur, false sinon
	 */
	public boolean equals(Pion p) {
		
		boolean retour = false;
		Couleur p_couleur = p.getCouleur();
		if ( this.couleur.equals(p_couleur))
		{
			retour = true;
		}
		return retour;
	}
	
}