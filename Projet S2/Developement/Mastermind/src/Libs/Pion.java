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

	public Pion(Couleur couleur)
	{
		this.couleur = couleur;
	}

	public Pion()
	{
		this.couleur = Couleur.BLUE;
	}

	public void setPion(Couleur couleur)
	{
		this.couleur = couleur;
	}

	public String toString()
	{
		return(this.couleur + "■");
	}
}