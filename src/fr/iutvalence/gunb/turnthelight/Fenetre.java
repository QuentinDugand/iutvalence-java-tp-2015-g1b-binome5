package fr.iutvalence.gunb.turnthelight;

import javax.swing.JFrame;

import java.awt.GridLayout;

import javax.swing.JButton;

public class Fenetre extends JFrame{
	
	public static void main(String[] args) {
		
		// TODO Instancier JFrame
		JFrame Fenetre1 = new JFrame();
				
		// TODO Rendre fenêtre visible
				
		Fenetre1.setSize(600,700);
		
		Fenetre1.setLocationRelativeTo(null);
		
		Fenetre1.setTitle("Turn The Light");
		
		Fenetre1.setVisible(true);
		
		Fenetre1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Fenetre1.setLayout(new GridLayout(5, 5));
		Fenetre1.add(new JButton(""));
		Fenetre1.add(new JButton(""));
		Fenetre1.add(new JButton(""));
	    Fenetre1.add(new JButton(""));
	    Fenetre1.add(new JButton(""));
	    Fenetre1.add(new JButton(""));
	    Fenetre1.add(new JButton(""));
	    Fenetre1.add(new JButton(""));
	    Fenetre1.add(new JButton(""));
	    Fenetre1.add(new JButton(""));
	    Fenetre1.add(new JButton(""));
	    Fenetre1.add(new JButton(""));
	    Fenetre1.add(new JButton(""));
	    Fenetre1.add(new JButton(""));
	    Fenetre1.add(new JButton(""));
		Fenetre1.add(new JButton(""));
		Fenetre1.add(new JButton(""));
	    Fenetre1.add(new JButton(""));
	    Fenetre1.add(new JButton(""));
	    Fenetre1.add(new JButton(""));
	    Fenetre1.add(new JButton(""));
	    Fenetre1.add(new JButton(""));
	    Fenetre1.add(new JButton(""));
	    Fenetre1.add(new JButton(""));
	    Fenetre1.add(new JButton(""));
	    Fenetre1.pack();
		
	}
}
