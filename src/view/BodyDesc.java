package view;

import java.awt.Color;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class BodyDesc extends JPanel {
	private JTable tableBodyDesc;

	/**
	 * Create the panel.
	 */
	public BodyDesc()
	{
		setBackground(Color.RED);
		setBounds(0, 0, 1170, 860);
		setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblImage = new JLabel("There will be the image of Body");
		lblImage.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblImage);
		
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane);
		
		tableBodyDesc = new JTable();
		scrollPane.setViewportView(tableBodyDesc);
	}

}
