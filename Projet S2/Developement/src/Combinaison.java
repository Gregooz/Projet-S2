/**
* Classe Combinaison
* 
*@author 
*@version 1.0
*
*/




public class Combinaison
{
	private Pion[] pionCombinaisons;
	private PionIndice[] pionIndices;
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
			this.pionCombinaisons = new Pion[nombrePion];
			this.pionIndices = new PionIndice[nombrePion];
		}

	public Combinaison()
	{
		this(4);
	}

	public void setPionCombinaison(Pion[] pions)
	{		
		//System.out.println(pions[0]);
		//System.out.println(pions[1]);
		//System.out.println(pions[2]);
		//System.out.println(pions[3]);		

		for (int i = 0 ;i < this.nombrePion ; i++)
		{
			//System.out.println(i);

			this.pionCombinaisons[i] = pions[i];

		}
	}

	public void setNombrePion(int nombrePion)
	{
		this.nombrePion =nombrePion;
		this.pionCombinaisons = new PionCombinaison[ this.nombrePion ];
	}

	public int getNombrePion()
	{
		return this.nombrePion;
	}

	public String toString()
	{
		String chaine = "";
		for (int i=0;i < this.nombrePion; i++) 
		{
			chaine = BRIGHT + chaine + BACK_WHITE +" "+ pionCombinaisons[i].toString();
		}
		chaine = chaine + RESET;
		return chaine;	
	}

	public Couleur getCouleur(int indice)
	{
		return pionCombinaisons[indice].getCouleur();
	}

}