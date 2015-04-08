/**
* Classe Combinaison
* 
*@author 
*@version 1.0
*
*/




public class Combinaison
{
	private PionCombinaison[] pionCombinaisons;
	private PionIndice[] pionIndices;
	private Indice[] indices;
	private int nombrePion;
	public static final String BACK_WHITE = "\u001B[47m";
	public static final String RESET = "\u001B[0m";
	public static final String BRIGHT = "\u001B[1m";

/** 
* Constructeur de la classe Combinaison
*@param 
*/

	public Combinaison(int nombrePion)
		{
			this.nombrePion = nombrePion;
			this.pionCombinaisons = new PionCombinaison[nombrePion];
			this.pionIndices = new PionIndice[nombrePion];
			this.indices = new Indice[nombrePion];
		}

	public Combinaison()
	{
		this(4);
	}

	public void setPionCombinaison(PionCombinaison[] pions)
	{		

		for (int i = 0 ;i < this.nombrePion ; i++)
		{
			this.pionCombinaisons[i] = pions[i];
		}
	}

	public void setNombrePion(int nombrePion)
	{
		this.nombrePion =nombrePion;
		this.pionCombinaisons = new PionCombinaison[ this.nombrePion ];
		this.pionIndices = new PionIndice[ this.nombrePion ];
	}

	public int getNombrePion()
	{
		return this.nombrePion;
	}

	public String toString()
	{
		String chaine = "La combinaison:";
		for (int i=0;i < this.nombrePion; i++) 
		{
			chaine = BRIGHT + chaine + BACK_WHITE +" "+ pionCombinaisons[i].toString();
		}
		chaine = chaine + RESET;
		return chaine;	
	}


}