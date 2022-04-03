package view;

import java.awt.Color;
import java.io.IOException;
import java.net.URL;

import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

import model.Bodroot;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;

public class PlanetSelection extends JPanel {

	private Image img;
	private JButton btnPlanet;
	private JButton btnLeft;
	private JButton btnRight;
	private JButton btnBack;
	
	
	
	/**
	 * Create the panel.
	 * @throws IOException 
	 */
	public PlanetSelection(Bodroot planets) throws IOException
	{
		URL imageUrlBg=ClassLoader.getSystemResource("images/spaceBg.jpg");
		img=Toolkit.getDefaultToolkit().createImage(imageUrlBg);
		this.loadImage(img);
		setBackground(Color.BLACK);
		setBounds(0, 0, 1170, 861);
		setLayout(null);
		
		btnPlanet = new JButton();
		btnPlanet.setFont(new Font("Tahoma", Font.BOLD, 39));
		if(planets!=null)
		{
			btnPlanet.setText(planets.getBodies().get(0).getEnglishName());
			URL imageUrl=ClassLoader.getSystemResource("images/planets/"+planets.getBodies().get(0).getEnglishName()+".png");
			Icon icon = new ImageIcon(imageUrl);
			btnPlanet.setIcon(icon);
		}
		btnPlanet.setForeground(Color.ORANGE);
		btnPlanet.setBackground(Color.BLACK);
		btnPlanet.setHorizontalTextPosition(JButton.CENTER);
		btnPlanet.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnPlanet.setBounds(329, 131, 512, 601);
		btnPlanet.setBorder(null);
		btnPlanet.setContentAreaFilled(false);
		btnPlanet.setFocusPainted(false);
		add(btnPlanet);
		
		btnLeft = new JButton("<");
		btnLeft.setFont(new Font("Times New Roman", Font.BOLD, 99));
		btnLeft.setBackground(Color.BLACK);
		btnLeft.setForeground(Color.WHITE);
		btnLeft.setBounds(131, 385, 90, 90);
		btnLeft.setBorder(null);
		btnLeft.setContentAreaFilled(false);
		btnLeft.setFocusPainted(false);
		add(btnLeft);
		
		btnRight = new JButton(">");
		btnRight.setFont(new Font("Times New Roman", Font.BOLD, 99));
		btnRight.setBackground(Color.BLACK);
		btnRight.setForeground(Color.WHITE);
		btnRight.setBounds(950, 385, 90, 90);
		btnRight.setBorder(null);
		btnRight.setContentAreaFilled(false);
		btnRight.setFocusPainted(false);
		add(btnRight);
		
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
	
	public JButton getBtnPlanet() {
		return btnPlanet;
	}
	public void setBtnPlanet(JButton btnPlanet) {
		this.btnPlanet = btnPlanet;
	}

	public JButton getBtnLeft() {
		return btnLeft;
	}

	public void setBtnLeft(JButton btnLeft) {
		this.btnLeft = btnLeft;
	}

	public JButton getBtnRight() {
		return btnRight;
	}

	public void setBtnRight(JButton btnRight) {
		this.btnRight = btnRight;
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
