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
import javax.swing.JFormattedTextField;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class BodiesList extends JPanel 
{
	
	private Image img;
	private JScrollPane scrollPane;
	private JTable tableOfMoons;
	private JButton btnBack;
	private JTextField searchField;
	private JLabel lblFilter;

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
		tableOfMoons.setFocusable(false);
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
		
		searchField = new JTextField();
		searchField.setBounds(930, 758, 200, 27);
		searchField.setFont(new Font("Tahoma", Font.BOLD, 19));
		searchField.setForeground(Color.ORANGE);
		searchField.setOpaque(false);
		searchField.setVisible(false);
		add(searchField);
		
		lblFilter = new JLabel("Filter:");
		lblFilter.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFilter.setForeground(Color.ORANGE);
		lblFilter.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblFilter.setBounds(851, 759, 73, 24);
		lblFilter.setVisible(false);
		add(lblFilter);
		
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

	public JTextField getSearchField() {
		return searchField;
	}

	public void setSearchField(JTextField searchField) {
		this.searchField = searchField;
	}

	public JLabel getLblFilter() {
		return lblFilter;
	}

	public void setLblFilter(JLabel lblFilter) {
		this.lblFilter = lblFilter;
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
