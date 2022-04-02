package view;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class BodiesSelection extends JPanel {

	/**
	 * Create the panel.
	 */
	public BodiesSelection() {
		setBackground(Color.RED);
		setBounds(0, 0, 1170, 860);
		setLayout(null);
		
		JPanel gridPanel = new JPanel();
		gridPanel.setBounds(230, 128, 700, 601);
		add(gridPanel);
		gridPanel.setLayout(new GridLayout(0, 2, 200, 70));
		
		JButton btnPlanets = new JButton("Planets");
		gridPanel.add(btnPlanets);
		
		JButton btnMoons = new JButton("Moons");
		gridPanel.add(btnMoons);
		
		JButton btnDwarfPlanets = new JButton("Dwarf Planets");
		gridPanel.add(btnDwarfPlanets);
		
		JButton btnAsteroids = new JButton("Asteroids");
		gridPanel.add(btnAsteroids);
		
		JButton btnComets = new JButton("Comets");
		gridPanel.add(btnComets);
		
		JButton btnStars = new JButton("Stars");
		gridPanel.add(btnStars);
	}

}
