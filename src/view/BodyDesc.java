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
	private JLabel lblImage;
	private JScrollPane scrollPane;
	/**
	 * Create the panel.
	 */
	public BodyDesc()
	{
		setBackground(Color.RED);
		setBounds(0, 0, 1170, 861);
		setLayout(new GridLayout(0, 2, 0, 0));
		
		lblImage = new JLabel("There will be the image of Body");
		lblImage.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblImage);
		
		scrollPane = new JScrollPane();
		add(scrollPane);
		
		tableBodyDesc = new JTable();
		scrollPane.setViewportView(tableBodyDesc);
	}
	public JTable getTableBodyDesc() {
		return tableBodyDesc;
	}
	public void setTableBodyDesc(JTable tableBodyDesc) {
		this.tableBodyDesc = tableBodyDesc;
	}
	public JLabel getLblImage() {
		return lblImage;
	}
	public void setLblImage(JLabel lblImage) {
		this.lblImage = lblImage;
	}
	public JScrollPane getScrollPane() {
		return scrollPane;
	}
	public void setScrollPane(JScrollPane scrollPane) {
		this.scrollPane = scrollPane;
	}

	
}
