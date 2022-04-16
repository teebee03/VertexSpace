package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.MediaTracker;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * Contiene metodi utili per evitare la definizione ripetuta in piu' classi
 * @author Alberti Lorenzo, Bertelli Tommaso
 * @version 1.0.0
 * @since 1.0
 */
public class UsefulMethods
{
	/**
	 * Carica l'immagine da impostare come background
	 * @param img Immagine da impostare come background
	 * @param p Pannello dove applicare il metodo
	 */
	public static void loadImage(Image img, JPanel p)
	{
	    try
	    {
	      MediaTracker track = new MediaTracker(p);
	      track.addImage(img, 0);
	      track.waitForID(0);
	    }
	    catch (InterruptedException e)
	    {
	      e.printStackTrace();
	    }
	 }
	
	/**
	 * Crea un bottone con una freccia come immagine in basso a sinistra del pannello
	 * @return il bottone con l'immagine
	 */
	public static JButton backButton()
	{
		URL imageUrl=ClassLoader.getSystemResource("images/back.png");
		Icon icon = new ImageIcon(imageUrl);
		JButton btnBack = new JButton(icon);
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Times New Roman", Font.BOLD, 99));
		btnBack.setFocusPainted(false);
		btnBack.setContentAreaFilled(false);
		btnBack.setBorder(null);
		btnBack.setBackground(Color.BLACK);
		btnBack.setBounds(39, 734, 126, 90);
		return btnBack;
	}
}
