package view;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.JScrollPane;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.JButton;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 * Crea un pannello che permette di visualizzare la lista dei Body di un preciso tipo
 * @author Alberti Lorenzo, Bertelli Tommaso
 * @version 1.0.0
 * @since 1.0
 */
public class BodiesList extends JPanel 
{
	
	private static final long serialVersionUID = 1L;
	private Image img;
	private JScrollPane scrollPane;
	private JTable tableOfBodies;
	private JButton btnBack;
	private JTextField searchArField;
	private JTextField searchBodyField;
	private JLabel lblAroundPlanet;
	private JLabel lblBody;
	private JLabel lblSearch;
	

	/**
	 * Create the panel.
	 */
	public BodiesList()
	{
		URL imageUrlBg=ClassLoader.getSystemResource("images/spaceBg.jpg");
		img=Toolkit.getDefaultToolkit().createImage(imageUrlBg);
		UsefulMethods.loadImage(img,this);
		setBounds(0, 0, 1170, 861);
		setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(305, 30, 460, 756);
		add(scrollPane);
		
		tableOfBodies = new JTable(){
			private static final long serialVersionUID = 1L;

			@Override
			public boolean isCellEditable ( int row, int col)
			{
				return false;
			}
		};
		tableOfBodies.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 19));
		tableOfBodies.getTableHeader().setForeground(Color.BLACK);
		tableOfBodies.getTableHeader().setOpaque(false);
		tableOfBodies.getTableHeader().setBackground(Color.ORANGE);
		tableOfBodies.setRowSelectionAllowed(false);
		tableOfBodies.setFocusable(false);
		tableOfBodies.getTableHeader().setReorderingAllowed(false);
		tableOfBodies.setRowHeight(27);
		tableOfBodies.setFont(new Font("Tahoma", Font.BOLD, 19));
		tableOfBodies.setForeground(Color.ORANGE);
		tableOfBodies.setOpaque(false);
		((DefaultTableCellRenderer)tableOfBodies.getDefaultRenderer(Object.class)).setOpaque(false);
		scrollPane.setViewportView(tableOfBodies);
		scrollPane.getViewport().setOpaque(false);
		scrollPane.setOpaque(false);
		
		btnBack=UsefulMethods.backButton();
		add(btnBack);	
		
		searchBodyField = new JTextField();
		searchBodyField.setBounds(924, 759, 200, 27);
		searchBodyField.setFont(new Font("Tahoma", Font.BOLD, 19));
		searchBodyField.setForeground(Color.ORANGE);
		searchBodyField.setOpaque(false);
		add(searchBodyField);
		
		searchArField = new JTextField();
		searchArField.setBounds(924, 797, 200, 27);
		searchArField.setFont(new Font("Tahoma", Font.BOLD, 19));
		searchArField.setForeground(Color.ORANGE);
		searchArField.setOpaque(false);
		searchArField.setVisible(false);
		add(searchArField);
		
		lblBody = new JLabel("Body:");
		lblBody.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBody.setForeground(Color.ORANGE);
		lblBody.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBody.setBounds(818, 760, 100, 24);
		add(lblBody);
		
		lblAroundPlanet = new JLabel("Around Planet:");
		lblAroundPlanet.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAroundPlanet.setForeground(Color.ORANGE);
		lblAroundPlanet.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAroundPlanet.setBounds(797, 798, 121, 24);
		lblAroundPlanet.setVisible(false);
		add(lblAroundPlanet);
		
		lblSearch = new JLabel("SEARCH");
		lblSearch.setHorizontalAlignment(SwingConstants.CENTER);
		lblSearch.setForeground(Color.ORANGE);
		lblSearch.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblSearch.setBounds(961, 727, 126, 24);
		add(lblSearch);
		
	}

	public JScrollPane getScrollPane() {
		return scrollPane;
	}

	public void setScrollPane(JScrollPane scrollPane) {
		this.scrollPane = scrollPane;
	}

	public JTable getTableOfBodies() {
		return tableOfBodies;
	}

	public JButton getBtnBack() {
		return btnBack;
	}

	public void setBtnBack(JButton btnBack) {
		this.btnBack = btnBack;
	}

	public void setTableOfBodies(JTable tableOfBodies) {
		this.tableOfBodies = tableOfBodies;
	}

	public JTextField getSearchArField() {
		return searchArField;
	}

	public void setSearchArField(JTextField searchArField) {
		this.searchArField = searchArField;
	}

	public JTextField getSearchBodyField() {
		return searchBodyField;
	}

	public void setSearchBodyField(JTextField searchBodyField) {
		this.searchBodyField = searchBodyField;
	}

	public JLabel getLblAroundPlanet() {
		return lblAroundPlanet;
	}

	public void setLblAroundPlanet(JLabel lblAroundPlanet) {
		this.lblAroundPlanet = lblAroundPlanet;
	}

	public JLabel getLblBody() {
		return lblBody;
	}

	public void setLblBody(JLabel lblBody) {
		this.lblBody = lblBody;
	}
	
	@Override
	protected void paintComponent(Graphics g)
	{
	    setOpaque(false);
	    g.drawImage(img, 0, 0, null);
	    super.paintComponent(g);
	}
}
