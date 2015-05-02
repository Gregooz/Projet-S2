package Libs;

public enum Couleur
{

	RESET("1"),
	BLACK("black"),
	RED("red"),
	GREEN("green"),
	YELLOW("yellow"),
	BLUE("blue"),
	PURPLE("purple"),
	CYAN("cyan"),
	WHITE("white");
	/*
	 * RESET("\u001B[0m"),
	BLACK("\u001B[30m"),
	RED("\u001B[31m"),
	GREEN("\u001B[32m"),
	YELLOW("\u001B[33m"),
	BLUE("\u001B[34m"),
	PURPLE("\u001B[35m"),
	CYAN("\u001B[36m"),
	WHITE("\u001B[37m");
	 */
	private String code;

	private Couleur(String code)
	{
		this.code = code;
	}

	@Override
	public String toString()
	{
		return code;
	}
	
	
}