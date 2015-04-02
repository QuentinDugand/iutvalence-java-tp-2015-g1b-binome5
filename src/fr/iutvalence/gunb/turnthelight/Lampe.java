package fr.iutvalence.gunb.turnthelight;

	/**
	 * Objet principal du jeu, la lampe est en bas de l'�chelle des objets.
	 * 
	 * La classe Lampe est l'objet qui sera contenu dans chaque emplacement de la grille.
	 * Une lampe peut �tre allum�e ou �teinte et peut changer d'�tat. 
	 * Une lampe est situ�e dans un Groupe suivant sa position dans la Grille.
	 *
	 * @see Groupe
	 * @see Grille
	 * 
	 */

public class Lampe 
{
	
	public final static boolean ALLUMEE = true;
	public final static boolean ETEINTE = false;
	
	/**
	 * Constantes correspondant aux �tats "allum�" ou "�teint".
	 */
	
	private boolean estAllumee;
	
	/**
	 * Etat courant.
	 */
	
	private int positionLigne;
	
	/**
	 * Abscisse de la position dans la grille de jeu.
	 */
	
	private int positionColonne;
	
	/**
	 * Ordonn�e de la position dans la grille de jeu. 
	 */
	
	public Lampe(boolean etatLampe, int x, int y)
	{
		this.estAllumee = etatLampe;
		this.positionLigne = x;
		this.positionColonne = y;
	}
	
	/**
	 * Cr�ation d'une lampe.
	 * On prend en param�tre son �tat initial, et sa position dans la grille (x et y).
	 */
	
	public void changerEtatLampe()
	{

	}
	
	/**
	 * On change d'�tat. La lampe passe allum�e si elle �tait �teinte et �teinte si elle �tait allum�e. 
	 */
}
