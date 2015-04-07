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


	public Pion()
	{
		this.couleur = null;
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