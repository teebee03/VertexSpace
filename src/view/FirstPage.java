package view;

import java.awt.Color;

import javax.swing.JPanel;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.net.URL;

/**
 * Crea un pannello che viene mostrato per n secondi
 * @author Alberti Lorenzo, Bertelli Tommaso
 * @version 1.0.0
 * @since 1.0
 */
public class FirstPage extends JPanel
{
	
	private Image img;

	
	/**
	 * Create the panel.
	 */
	public FirstPage()
	{
		URL imageUrlBg=ClassLoader.getSystemResource("images/firstPageBgCompl.jpg");
		img=Toolkit.getDefaultToolkit().createImage(imageUrlBg);
		UsefulMethods.loadImage(img,this);
		
		setBackground(Color.BLACK);
		setBounds(0, 0, 1170, 861);
		setLayout(null);
	}
	
	@Override
	protected void paintComponent(Graphics g)
	{
	    setOpaque(false);
	    g.drawImage(img, 0, 0, null);
	    super.paintComponent(g);
	}
}
