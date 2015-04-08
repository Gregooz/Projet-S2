/**
* Classe Couleur
* 
*@author 
*@version 1.0
*
*/




public class Couleur
{
	private String couleur;
/** 
* Constructeur de la classe Couleur
*@param couleur La couleur que l'on veut créer
*/

	public Couleur(String couleur)
	{
		this.couleur = couleur;
	}
 /**
  * Méthode qui retourne la couleur 
  * @return La couleur
  */
	public String getCouleur()
	{
		return this.couleur;
	}
/**
 * Méthode qui permet de changer la couleur
 * @param couleur La nouvelle couleure que l'on veut attribuer
 */
	public void setCouleur(String couleur)
	{
		this.couleur = couleur;
	}
}
