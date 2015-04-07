/**
* Classe Partie
* 
*@author 
*@version 1.0
*
*/




public abstract class Pion
{
	private Couleur couleur;
/** 
* Constructeur de la classe Partie
*@param 
*/

	public Pion(Couleur couleur)
	{
		this.couleur = couleur;
	}

	public void setPion(Couleur couleur)
	{
		this.couleur = couleur;
	}

	public String toString()
	{
		return("Le pion est de la couleur " + this.couleur);
	}
}