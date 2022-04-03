package view;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.net.URL;

public class BodiesSelection extends JPanel {

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
		this.loadImage(img);
		setBounds(0, 0, 1170, 861);
		setLayout(null);
		
		gridPanel = new JPanel();
		gridPanel.setBackground(Color.LIGHT_GRAY);
		gridPanel.setBounds(230, 128, 700, 600);
		add(gridPanel);
		gridPanel.setLayout(new GridLayout(0, 2, 200, 80));
		
		btnPlanets = new JButton("Planets");
		gridPanel.add(btnPlanets);
		
		btnMoons = new JButton("Moons");
		gridPanel.add(btnMoons);
		
		btnDwarfPlanets = new JButton("Dwarf Planets");
		gridPanel.add(btnDwarfPlanets);
		
		btnAsteroids = new JButton("Asteroids");
		gridPanel.add(btnAsteroids);
		
		btnComets = new JButton("Comets");
		gridPanel.add(btnComets);
		
		btnStars = new JButton("Stars");
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
