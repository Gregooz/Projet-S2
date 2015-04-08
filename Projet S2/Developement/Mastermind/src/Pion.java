/**
* Classe Partie
* 
*@author 
*@version 1.0
*
*/




public  class Pion
{
	private Couleur couleur;

/**
 * Constructeur de la classe pion
 * @param couleur Attribuer la couleur au pion
 */
	public Pion(Couleur couleur)
	{
		this.couleur = couleur;
	}

/**
 * Constructeur de la classe pion sans paramètres
 */
	public Pion()
	{
		Couleur coul = new Couleur("B");
		this.couleur = couleur;
	}

/**
 * Méthode qui permet de changer la couleur
 * @param couleur La nouvelle couleur que l'on veut attribuer au pion
 */
	public void setPion(Couleur couleur)
	{
		this.couleur = couleur;
	}

/**
 * Méthode qui permet de retourner la couleur du pion
 * @return Retourne la couleur du pion
 */
	public String toString()
	{
		return("Le pion est de la couleur " + this.couleur);
	}
}