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
	public static final String RESET = "\u001B[0m";
	public static final String BLACK = "\u001B[30m";
	public static final String RED = "\u001B[31m";
	public static final String GREEN = "\u001B[32m";
	public static final String YELLOW = "\u001B[33m";
	public static final String BLUE = "\u001B[34m";
	public static final String PURPLE = "\u001B[35m";
	public static final String CYAN = "\u001B[36m";
	public static final String WHITE = "\u001B[37m";
	
/** 
* Constructeur de la classe Couleur
*@param 
*/

	public Couleur(String couleur)
	{
		this.couleur = couleur;
	}

	public String getCouleur()
	{
		return this.couleur;
	}
	
	public void setCouleur(String couleur)
	{
		this.couleur = couleur;
	}

	public boolean equals(Couleur coul)
	{
		return this.couleur == coul.couleur;
	}


	public String toString()
	{
		if (this.couleur == "noir")
		{
			return(BLACK);
		}

		else if (this.couleur == "rouge")
		{
			return(RED);
		}

		else if (this.couleur == "vert")
		{
			return(GREEN);
		}

		else if (this.couleur == "jaune")
		{
			return(YELLOW);
		}

		else if (this.couleur == "bleu")
		{
			return(BLUE);
		}

		else if (this.couleur == "violet")
		{
			return(PURPLE);
		}

		else if (this.couleur == "cyan")
		{
			return(CYAN);
		}

		else if (this.couleur == "blanc")
		{
			return(WHITE);
		}

		else
		{
			return("La couleur choisie n'est pas disponible ");
		}


	}
}
