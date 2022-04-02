package view;

import java.awt.Color;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.BoxLayout;
import javax.swing.JTabbedPane;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class PlanetSelection extends JPanel {

	/**
	 * Create the panel.
	 */
	public PlanetSelection()
	{
		setBackground(Color.RED);
		setBounds(0, 0, 1170, 860);
		setLayout(null);
		
		JButton btnPlanet = new JButton("PlanetImage");
		btnPlanet.setBounds(557, 414, 195, 80);
		add(btnPlanet);
	}
}
