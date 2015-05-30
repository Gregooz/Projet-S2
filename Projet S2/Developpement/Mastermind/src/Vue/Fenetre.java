package Vue;

import javax.swing.*;

import java.awt.*;

public class Fenetre extends JFrame
{
	//CONTENEURS
	private JPanel menu = new JPanel();
	private JPanel boutonMenu = new JPanel();
	private JLabel back = new JLabel();
	private JPanel jeu = new JPanel();
	private JPanel boutonJeu = new JPanel();
	private JLabel[][] plateau = new JLabel[8][4];
	private JLabel[][] indice = new JLabel[8][4];
	private JLabel[] solution = new JLabel[4];
	
	//IMAGES DE PIONS
	private ImageIcon pionRed= new ImageIcon("../Mastermind/img/6.png");
	private ImageIcon pionBlue= new ImageIcon("../Mastermind/img/1.png");
	private ImageIcon pionGreen= new ImageIcon("../Mastermind/img/3.png");
	private ImageIcon pionOrange= new ImageIcon("../Mastermind/img/4.png");
	private ImageIcon pionCyan= new ImageIcon("../Mastermind/img/2.png");
	private ImageIcon pionPurple= new ImageIcon("../Mastermind/img/5.png");
//	private ImageIcon pionIndicR= new ImageIcon("../Mastermind/img/indicR.png");
//	private ImageIcon pionIndicB= new ImageIcon("../Mastermind/img/indicB.png");
	private ImageIcon pionVide = new ImageIcon("../Mastermind/img/7.png");
//	private ImageIcon indicVide = new ImageIcon("img/indicVide.png");
				
	//BOUTTONS DES PIONS
	private JButton boutonJeuRed = new JButton(pionRed);
	private JButton boutonJeuBlue = new JButton(pionBlue);
	private JButton boutonJeuGreen = new JButton(pionGreen);
	private JButton boutonJeuOrange = new JButton(pionOrange);
	private JButton boutonJeuCyan = new JButton(pionCyan);
	private JButton boutonJeuPurple = new JButton(pionPurple);
	
	//BOUTTONS DU MENU PRINICPAL
	private JButton jouer = new JButton("Jouer");
	private JButton option = new JButton("Options");
	private JButton credit = new JButton("Crédits");
	
	

	public Fenetre(String s)
	{
		super(s);
		fenetreMenu();
		fenetreJeu();
		
		
		
	
		this.setResizable(false);
		this.setPreferredSize(new Dimension(500, 500));
		this.setContentPane(menu);
		this.pack();
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setVisible(true);
		jeu.setVisible(false);
		
	}
		
	public void fenetreMenu()
	{
		boutonMenu.setLayout(new GridLayout(3, 1, 5, 5));
		boutonMenu.setBounds(167, 167, 167,167);
		boutonMenu.add(jouer);
		boutonMenu.add(option);
		boutonMenu.add(credit);
		boutonMenu.setBackground(Color.black);
			
		back.setIcon(new ImageIcon("../Mastermind/img/back.gif"));
		back.add(boutonMenu);
		menu.add(back);
			
		ControleurJouer cj = new ControleurJouer(this, jouer);
		jouer.addActionListener(cj);
		
		ControleurCredits cc = new ControleurCredits(this, credit);
		credit.addActionListener(cc);
		
		
		
		
	}
	
	public void fenetreJeu()
	{
		jeu.setLayout(new BorderLayout());
		boutonJeu.setLayout(new GridLayout(3, 2));
		
		//AJOUT DES BOUTTONS AU JPANEL
		boutonJeu.add(boutonJeuRed);
		boutonJeu.add(boutonJeuBlue);
		boutonJeu.add(boutonJeuGreen);
		boutonJeu.add(boutonJeuOrange);
		boutonJeu.add(boutonJeuCyan);
		boutonJeu.add(boutonJeuPurple);
		
		jeu.add(boutonJeu, BorderLayout.EAST);
		
		ControleurFrame cf = new ControleurFrame(this, jeu);
		jeu.addKeyListener(cf);
		
	}
	
	public void changerPanel()
	{
		setContentPane(jeu);
		jeu.setVisible(true);
	}
	
	public void revenirMenu()
	{
		setContentPane(menu);
		jeu.setVisible(false);
	}
	
	public static void main(String[] args)
	{
		new Fenetre("Mastermind");
	}
}