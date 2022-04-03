package view;

import java.awt.Color;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.net.URL;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.FlowLayout;
import java.awt.Font;

public class BodyDesc extends JPanel {
	private JTable tableBodyDesc;
	private JButton btnBack;
	private JScrollPane scrollPane;
	private JPanel componentsContainter;
	private JLabel lblBodyimage;
	/**
	 * Create the panel.
	 */
	public BodyDesc()
	{
		setBackground(Color.RED);
		setBounds(0, 0, 1170, 861);
		setLayout(new GridLayout(0, 2, 0, 0));
		
		componentsContainter = new JPanel();
		add(componentsContainter);
		componentsContainter.setLayout(null);
		
		lblBodyimage = new JLabel("bodyImage");
		lblBodyimage.setBounds(36, 174, 512, 512);
		lblBodyimage.setHorizontalAlignment(SwingConstants.CENTER);
		componentsContainter.add(lblBodyimage);
		
		URL imageUrl=ClassLoader.getSystemResource("images/back.png");
		Icon icon = new ImageIcon(imageUrl);
		btnBack = new JButton(icon);
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Times New Roman", Font.BOLD, 99));
		btnBack.setFocusPainted(false);
		btnBack.setContentAreaFilled(false);
		btnBack.setBorder(null);
		btnBack.setBackground(Color.BLACK);
		btnBack.setBounds(39, 734, 126, 90);
		componentsContainter.add(btnBack);
		
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
	public JScrollPane getScrollPane() {
		return scrollPane;
	}
	public void setScrollPane(JScrollPane scrollPane) {
		this.scrollPane = scrollPane;
	}
	public JPanel getComponentsContainter() {
		return componentsContainter;
	}
	public void setComponentsContainter(JPanel componentsContainter) {
		this.componentsContainter = componentsContainter;
	}
	public JLabel getLblBodyimage() {
		return lblBodyimage;
	}
	public void setLblBodyimage(JLabel lblBodyimage) {
		this.lblBodyimage = lblBodyimage;
	}
	public JButton getBtnBack() {
		return btnBack;
	}
	public void setBtnBack(JButton btnBack) {
		this.btnBack = btnBack;
	}
	
}
