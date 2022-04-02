package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.JTabbedPane;
import java.awt.Color;

public class Finestra extends JFrame {

	private JPanel contentPane;
	private JLabel label;

	/**
	 * Create the frame.
	 */
	public Finestra() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1180,900);
		this.setLocationRelativeTo(null); //centro schermo
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		/*************
		//BodiesSelection bs = new BodiesSelection();
		//bs.setBounds(0, 0, 1170, 860);
		//contentPane.add(bs);*///////////////// PROVE DI VISIONE PANNELLO
		
		BodyDesc bd = new BodyDesc();
		bd.setBounds(0, 0, 1170, 860);
		contentPane.add(bd);

		setVisible(true);
	}
}
