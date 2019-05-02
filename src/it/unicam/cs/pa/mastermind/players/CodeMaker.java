package it.unicam.cs.pa.mastermind.players;

import java.util.List;

import it.unicam.cs.pa.mastermind.gui.InteractionManager;
import it.unicam.cs.pa.mastermind.pegs.ColorPegs;

/**
 * Interfaccia relativa ai giocatori che forniscono la sequenza da codificare
 * 
 * @author Francesco Pio Stelluti, Francesco Coppola
 *
 */
public interface CodeMaker {

	/**
	 * Restituisce la sequenza di pioli da indovinare
	 * 
	 * @param inputManager
	 * @return
	 */
	public List<ColorPegs> getCodeToGuess(int sequenceLength, InteractionManager inputManager);
}
