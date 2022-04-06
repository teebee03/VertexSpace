package view;

import java.awt.Color;

import javax.swing.JPanel;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.net.URL;

public class FirstPage extends JPanel{
	private Image img;

	/**
	 * Create the panel.
	 */
	public FirstPage()
	{
		URL imageUrlBg=ClassLoader.getSystemResource("images/firstPageBgCompl.jpg");
		img=Toolkit.getDefaultToolkit().createImage(imageUrlBg);
		this.loadImage(img);
		
		setBackground(Color.BLACK);
		setBounds(0, 0, 1170, 861);
		setLayout(null);
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
