package view;

import java.awt.Color;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.net.URL;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

import model.Bodroot;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;

public class BodyDesc extends JPanel {
	
	private Image img;
	private JTable tableBodyDesc;
	private JButton btnBack;
	private JScrollPane scrollPane;
	private JPanel componentsContainter;
	private JLabel lblBodyImage;
	/**
	 * Create the panel.
	 */
	public BodyDesc(Bodroot body)
	{
		URL imageUrlBg=ClassLoader.getSystemResource("images/spaceBg.jpg");
		img=Toolkit.getDefaultToolkit().createImage(imageUrlBg);
		this.loadImage(img);
		setBounds(0, 0, 1170, 861);
		setLayout(new GridLayout(1, 2, 0, 0));
		
		componentsContainter = new JPanel();
		add(componentsContainter);
		componentsContainter.setLayout(null);
		componentsContainter.setOpaque(false);
		
		lblBodyImage = new JLabel();
		if(body!=null)
		{
			URL imageUrl=ClassLoader.getSystemResource("images/planets/"+body.getBodies().get(0).getEnglishName()+".png");
			Icon icon = new ImageIcon(imageUrl);
			lblBodyImage.setIcon(icon);
		}
		lblBodyImage.setBounds(36, 174, 512, 512);
		lblBodyImage.setHorizontalAlignment(SwingConstants.CENTER);
		
		componentsContainter.add(lblBodyImage);
		
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
		
		tableBodyDesc = new JTable(){
			private static final long serialVersionUID = 1L;

			@Override
			public boolean isCellEditable ( int row, int col)
			{
				return false;
			}
		};
		tableBodyDesc.setRowHeight(27);
		tableBodyDesc.setShowVerticalLines(false);
		tableBodyDesc.setRowSelectionAllowed(false);
		tableBodyDesc.setFont(new Font("Tahoma", Font.BOLD, 19));
		tableBodyDesc.setForeground(Color.ORANGE);
		tableBodyDesc.setOpaque(false);
		((DefaultTableCellRenderer)tableBodyDesc.getDefaultRenderer(Object.class)).setOpaque(false);
		add(tableBodyDesc);
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
	public JLabel getLblBodyImage() {
		return lblBodyImage;
	}
	public void setLblBodyImage(JLabel lblBodyimage) {
		this.lblBodyImage = lblBodyimage;
	}
	public JButton getBtnBack() {
		return btnBack;
	}
	public void setBtnBack(JButton btnBack) {
		this.btnBack = btnBack;
	}
	
	private void loadImage(Image img)
	{
	    try
	    {
	      MediaTracker track = new MediaTracker(this);
	      track.addImage(img, 0);
	      track.waitForID(0);
	    }
	    catch (InterruptedException e)
	    {
	      e.printStackTrace();
	    }
	 }
	
	protected void paintComponent(Graphics g)
	{
	    setOpaque(false);
	    g.drawImage(img, 0, 0, null);
	    super.paintComponent(g);
	}
}
