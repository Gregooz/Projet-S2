/**
* Classe Joueur
* 
*@author Ian Clement
*@version 1.0
*
*/




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



}