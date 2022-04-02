package view;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.FlowLayout;

public class MoonsListPanel extends JPanel {
	private JScrollPane scrollPane;
	private JTable tableOfMoons;

	/**
	 * Create the panel.
	 */
	public MoonsListPanel()
	{
		setBackground(Color.RED);
		setBounds(0, 0, 1170, 861);
		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		scrollPane = new JScrollPane();
		add(scrollPane);
		
		tableOfMoons = new JTable();
		scrollPane.setViewportView(tableOfMoons);
	}

	public JScrollPane getScrollPane() {
		return scrollPane;
	}

	public void setScrollPane(JScrollPane scrollPane) {
		this.scrollPane = scrollPane;
	}

	public JTable getTableOfMoons() {
		return tableOfMoons;
	}

	public void setTableOfMoons(JTable tableOfMoons) {
		this.tableOfMoons = tableOfMoons;
	}

}
