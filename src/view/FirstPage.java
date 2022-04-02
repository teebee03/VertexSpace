package view;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class FirstPage extends JPanel{
	private JLabel lblVertexspace;

	/**
	 * Create the panel.
	 */
	public FirstPage()
	{
		setBackground(Color.BLACK);
		setBounds(0, 0, 1170, 861);
		setLayout(null);
		
		lblVertexspace = new JLabel("VertexSpace");
		lblVertexspace.setForeground(Color.ORANGE);
		lblVertexspace.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 99));
		lblVertexspace.setHorizontalAlignment(SwingConstants.CENTER);
		lblVertexspace.setBounds(0, 0, 1170, 861);
		add(lblVertexspace);
	}
}
