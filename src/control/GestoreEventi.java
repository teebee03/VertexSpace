package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import model.ApiCommunicator;
import model.Bodroot;
import view.Finestra;

public class GestoreEventi implements ActionListener
{
	private Finestra f;
	private ApiCommunicator api;
	private static int currI=0;
	public GestoreEventi(Finestra f,ApiCommunicator api)
	{
		this.f=f;
		this.api=api;
		f.getBs().getBtnPlanets().addActionListener(this);
		f.getPs().getBtnLeft().addActionListener(this);
		f.getPs().getBtnRight().addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		String urlB="?filter[]=isPlanet,eq,true&data=englishName&order=aphelion";
		Bodroot planets=api.makeBodies(urlB);
		
		if(e.getSource()==f.getBs().getBtnPlanets())
		{
			f.getBs().setVisible(false);
			f.getPs().getBtnPlanet().setIcon(chooseIcon(planets,currI));
			f.getPs().getBtnPlanet().setText(planets.getBodies().get(currI).getEnglishName());
			f.getPs().setVisible(true);
		}
		
		if(e.getSource()==f.getPs().getBtnRight())
		{
			if(currI<planets.getBodies().size()-1)
			{
				currI++;
				f.getPs().getBtnPlanet().setIcon(chooseIcon(planets,currI));
				f.getPs().getBtnPlanet().setText(planets.getBodies().get(currI).getEnglishName());
			}
		}
		
		if(e.getSource()==f.getPs().getBtnLeft())
		{
			if(currI>0)
			{
				currI--;
				f.getPs().getBtnPlanet().setIcon(chooseIcon(planets,currI));
				f.getPs().getBtnPlanet().setText(planets.getBodies().get(currI).getEnglishName());
			}
		}
	}
	
	static Icon chooseIcon(Bodroot planets,int currI)
	{
		URL imageUrl=ClassLoader.getSystemResource("images/"+planets.getBodies().get(currI).getEnglishName()+".png");
		Icon icon = new ImageIcon(imageUrl);
		return icon;
	}

}
