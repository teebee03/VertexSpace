package view;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.JScrollPane;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import java.awt.Font;

public class BodiesList extends JPanel {
	
	private Image img;
	private JScrollPane scrollPane;
	private JTable tableOfMoons;
	private JButton btnBack;

	/**
	 * Create the panel.
	 */
	public BodiesList()
	{
		URL imageUrlBg=ClassLoader.getSystemResource("images/spaceBg.jpg");
		img=Toolkit.getDefaultToolkit().createImage(imageUrlBg);
		this.loadImage(img);
		setBounds(0, 0, 1170, 861);
		setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(360, 30, 460, 756);
		add(scrollPane);
		
		tableOfMoons = new JTable(){
			private static final long serialVersionUID = 1L;

			@Override
			public boolean isCellEditable ( int row, int col)
			{
				return false;
			}
		};
		tableOfMoons.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 19));
		tableOfMoons.getTableHeader().setForeground(Color.BLACK);
		tableOfMoons.getTableHeader().setOpaque(false);
		tableOfMoons.getTableHeader().setBackground(Color.ORANGE);
		
		tableOfMoons.setRowSelectionAllowed(false);
		tableOfMoons.setRowHeight(27);
		tableOfMoons.setFont(new Font("Tahoma", Font.BOLD, 19));
		tableOfMoons.setForeground(Color.ORANGE);
		tableOfMoons.setOpaque(false);
		((DefaultTableCellRenderer)tableOfMoons.getDefaultRenderer(Object.class)).setOpaque(false);
		scrollPane.setViewportView(tableOfMoons);
		scrollPane.getViewport().setOpaque(false);
		scrollPane.setOpaque(false);
		
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
		add(btnBack);
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

	public JButton getBtnBack() {
		return btnBack;
	}

	public void setBtnBack(JButton btnBack) {
		this.btnBack = btnBack;
	}

	public void setTableOfMoons(JTable tableOfMoons) {
		this.tableOfMoons = tableOfMoons;
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
