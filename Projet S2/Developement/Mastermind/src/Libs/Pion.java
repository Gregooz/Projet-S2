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

	public Pion(Couleur couleur)
	{
		this.couleur = couleur;
	}

	public Pion()
	{
		Couleur coul = new Couleur("B");
		this.couleur = couleur;
	}

	public void setPion(Couleur couleur)
	{
		this.couleur = couleur;
	}

	public String toString()
	{
		return(this.couleur.toString() + "■");
	}
}