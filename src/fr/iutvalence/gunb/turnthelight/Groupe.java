package fr.iutvalence.gunb.turnthelight;

	/**
	 * Objet n�cessaire aux changements d'�tat, le groupe est juste au dessus de la Lampe dans l'�chelle des objets.
	 * 
	 * La classe Groupe d�finit des objets servant de r�f�rences � certaines Lampes.
	 * Selon leur position dans la grille, chaque lampe a 2, 3 ou 4 lampes adjacentes qui changeront d'�tat en m�me temps qu'elle.
	 * Il faut un groupe par nombre de lampes adjacentes pour pouvoir bien d�finir les diff�rents cas.
	 *  
	 *
	 * @see Lampe
	 * 
	 */

public class Groupe 
{
	private String typeGroupe;
	private int nbLampesAdjacentes;
	
	public Groupe(String nom, int nb)
	{
		this.typeGroupe = nom;
		this.nbLampesAdjacentes = nb;		
	}	
	
}
