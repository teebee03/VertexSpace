package view;

import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.awt.Font;

/**
 * Crea un pannello che contiene i bottoni per visualizzare un preciso tipo di Body
 * @author Alberti Lorenzo, Bertelli Tommaso
 * @version 1.0.0
 * @since 1.0
 */
public class BodiesSelection extends JPanel
{

	private static final long serialVersionUID = 1L;
	private Image img;
	private JPanel gridPanel;
	private JButton btnPlanets;
	private JButton btnMoons;
	private JButton btnDwarfPlanets;
	private JButton btnAsteroids;
	private JButton btnComets;
	private JButton btnStars;
	
	
	/**
	 * Create the panel.
	 */
	public BodiesSelection() {
		
		URL imageUrlBg=ClassLoader.getSystemResource("images/spaceBg.jpg");
		img=Toolkit.getDefaultToolkit().createImage(imageUrlBg);
		UsefulMethods.loadImage(img,this);
		setBounds(0, 0, 1170, 861);
		setLayout(null);
		
		gridPanel = new JPanel();
		gridPanel.setOpaque(false);
		gridPanel.setBounds(295, 128, 570, 600);
		add(gridPanel);
		gridPanel.setLayout(new GridLayout(0, 2, 270, 80));
		
		
		UIManager.put("Button.select", Color.TRANSLUCENT);
		
		btnPlanets = createButton("Planets","Mars",18);
		gridPanel.add(btnPlanets);
		
		btnMoons = createButton("Moons","Moon",18);
		gridPanel.add(btnMoons);
		
		btnDwarfPlanets = createButton("Dwarf Planets","Pluto",16);
		gridPanel.add(btnDwarfPlanets);
		
		btnAsteroids = createButton("Asteroids","Asteroid",18);
		gridPanel.add(btnAsteroids);
		
		btnComets = createButton("Comets","Comet Hyakutake",18);
		gridPanel.add(btnComets);
		
		btnStars = createButton("Stars","Sun",18);
		gridPanel.add(btnStars);
	}


	public JPanel getGridPanel() {
		return gridPanel;
	}


	public void setGridPanel(JPanel gridPanel) {
		this.gridPanel = gridPanel;
	}


	public JButton getBtnPlanets() {
		return btnPlanets;
	}


	public void setBtnPlanets(JButton btnPlanets) {
		this.btnPlanets = btnPlanets;
	}


	public JButton getBtnMoons() {
		return btnMoons;
	}


	public void setBtnMoons(JButton btnMoons) {
		this.btnMoons = btnMoons;
	}


	public JButton getBtnDwarfPlanets() {
		return btnDwarfPlanets;
	}


	public void setBtnDwarfPlanets(JButton btnDwarfPlanets) {
		this.btnDwarfPlanets = btnDwarfPlanets;
	}


	public JButton getBtnAsteroids() {
		return btnAsteroids;
	}


	public void setBtnAsteroids(JButton btnAsteroids) {
		this.btnAsteroids = btnAsteroids;
	}


	public JButton getBtnComets() {
		return btnComets;
	}


	public void setBtnComets(JButton btnComets) {
		this.btnComets = btnComets;
	}


	public JButton getBtnStars() {
		return btnStars;
	}


	public void setBtnStars(JButton btnStars) {
		this.btnStars = btnStars;
	}
	
	@Override
	protected void paintComponent(Graphics g)
	{
	    setOpaque(false);
	    g.drawImage(img, 0, 0, null);
	    super.paintComponent(g);
	}
	
	/**
	 * Crea un'icona
	 * @param body Nome del Body di cui prelevare l'immagine
	 * @return l'icona
	 */
	private Icon createButtonIcon(String body)
	{
		URL imageUrl=ClassLoader.getSystemResource("images/planets/"+body+".png");
		Image img= new ImageIcon(imageUrl).getImage().getScaledInstance( 115, 115,  java.awt.Image.SCALE_SMOOTH );
		Icon icon = new ImageIcon(img);
		return icon;
	}
	
	/**
	 * Crea un bottone 
	 * @param text Testo per il bottone
	 * @param iconN Icona per il bottone
	 * @param fontSize Dimensione del Font del bottone
	 * @return il bottone
	 */
	private JButton createButton(String text, String iconN, int fontSize)
	{
		JButton btn = new JButton(text);
		btn.setForeground(Color.ORANGE);
		btn.setBackground(Color.BLACK);
		btn.setFont(new Font("Tahoma", Font.BOLD, fontSize));
		btn.setIcon(createButtonIcon(iconN));
		btn.setVerticalTextPosition(SwingConstants.BOTTOM);
		btn.setHorizontalTextPosition(SwingConstants.CENTER);
		btn.setFocusPainted(false);
		return btn;
	}
}
