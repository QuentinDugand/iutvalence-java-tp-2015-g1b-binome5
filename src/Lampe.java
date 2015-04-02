
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
	 * @param estAllumee 
	 * 			C'est ce qui d�finit l'�tat courant de la lampe (allum� OU �teint)
	 * 
	 * 
	 * 
	 */

public class Lampe 
{
	
	public final static boolean ALLUMEE = true;
	public final static boolean ETEINTE = false;
	
	private boolean estAllumee;
	
	public Lampe(boolean etatLampe)
	{
		this.estAllumee = etatLampe;
	}
	
	public void changerEtatLampe()
	{

	}
}
