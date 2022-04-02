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

public class PlanetSelection extends JPanel {

	private JButton btnPlanet;
	private JButton btnLeft;
	private JButton btnRight;
	
	
	
	/**
	 * Create the panel.
	 * @throws IOException 
	 */
	public PlanetSelection(Bodroot planets) throws IOException
	{
		setBackground(Color.BLACK);
		setBounds(0, 0, 1170, 861);
		setLayout(null);
		
		btnPlanet = new JButton();
		btnPlanet.setFont(new Font("Tahoma", Font.BOLD, 26));
		if(planets!=null)
		{
			btnPlanet.setText(planets.getBodies().get(0).getEnglishName());
			URL imageUrl=ClassLoader.getSystemResource("images/"+planets.getBodies().get(0).getEnglishName()+".png");
			Icon icon = new ImageIcon(imageUrl);
			btnPlanet.setIcon(icon);
		}
		btnPlanet.setForeground(Color.ORANGE);
		btnPlanet.setBackground(Color.BLACK);
		btnPlanet.setHorizontalTextPosition(JButton.CENTER);
		btnPlanet.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnPlanet.setBounds(329, 131, 512, 601);
		Border emptyBorder = BorderFactory.createEmptyBorder();
		btnPlanet.setBorder(emptyBorder);
		add(btnPlanet);
		
		btnLeft = new JButton("<");
		btnLeft.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnLeft.setBackground(Color.BLACK);
		btnLeft.setForeground(Color.WHITE);
		btnLeft.setBounds(170, 420, 89, 33);
		add(btnLeft);
		
		btnRight = new JButton(">");
		btnRight.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnRight.setBackground(Color.BLACK);
		btnRight.setForeground(Color.WHITE);
		btnRight.setBounds(911, 420, 89, 33);
		add(btnRight);
		
		
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
	
	
}
