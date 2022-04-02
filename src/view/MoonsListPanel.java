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

public class MoonsListPanel extends JPanel {
	private JTable tableOfMoons;

	/**
	 * Create the panel.
	 */
	public MoonsListPanel()
	{
		setBackground(Color.RED);
		setBounds(0, 0, 1170, 860);
		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane);
		
		tableOfMoons = new JTable();
		scrollPane.setViewportView(tableOfMoons);
	}

}
