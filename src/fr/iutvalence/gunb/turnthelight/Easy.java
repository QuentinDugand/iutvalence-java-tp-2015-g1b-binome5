package fr.iutvalence.gunb.turnthelight;

/**
 * That is an extension from the class Game. This extension define the lower level of difficulty.
 * This level is presenting a quota of 5 lights switched ON at the start of the game.
 * 
 * @author dazyj
 * @version 1.0
 * @see Game
 * @see Grid
 * */
public class Easy extends Game {

	/**
	 * create a game of level "easy", with the nickname of the player.
	 * 
	 * @param nickname
	 */
	public Easy(String nickname) {
		super(nickname);
	}
	
	/**
     * Initialize all the lights of the grid for the start situation and switch them on.
     */
	public void initialisation() {
		grid.swap(0, 0);
		grid.swap(0, Grid.NB_COLUMNS - 1);
		grid.swap(Grid.NB_LINES - 1, 0);
		grid.swap(Grid.NB_LINES - 1, Grid.NB_COLUMNS - 1);
		grid.swap((Grid.NB_LINES - 1) / 2, (Grid.NB_COLUMNS - 1) / 2);
	}
}
