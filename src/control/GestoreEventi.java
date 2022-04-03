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
		f.getPs().getBtnBack().addActionListener(this);
		f.getPs().getBtnPlanet().addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		String urlB="?filter[]=isPlanet,eq,true&data=englishName&order=aphelion";
		Bodroot planets=api.makeBodies(urlB);
		
		//BodiesSelection
		if(e.getSource()==f.getBs().getBtnPlanets())
		{
			f.getBs().setVisible(false);
			ButtonImageText(planets,currI);
			f.getPs().setVisible(true);
		}
		
		//PlanetSelection
		if(e.getSource()==f.getPs().getBtnRight())
		{
			if(currI<planets.getBodies().size()-1)
			{
				currI++;
				ButtonImageText(planets,currI);
			}
			else
			{
				currI=0;
				ButtonImageText(planets,currI);
			}
		}
		
		if(e.getSource()==f.getPs().getBtnLeft())
		{
			if(currI>0)
			{
				currI--;
				ButtonImageText(planets,currI);
			}
			else
			{
				currI=planets.getBodies().size()-1;
				ButtonImageText(planets,currI);
			}
		}
		
		if(e.getSource()==f.getPs().getBtnBack())
		{
			f.getPs().setVisible(false);
			currI=0;
			f.getBs().setVisible(true);
		}
		
		if(e.getSource()==f.getPs().getBtnPlanet())
		{
			f.getPs().setVisible(false);
			f.getBd().setVisible(true);
		}		
		
		//BodyDesc
		if(e.getSource()==f.getBd().getBtnBack()) //ci vorra' un if per stabilire se tornare su Ps o MlP
		{
			f.getBd().setVisible(false);
			currI=0;
			f.getPs().setVisible(true);
		}
	}
	
	private void ButtonImageText(Bodroot planets,int currI)
	{
		URL imageUrl=ClassLoader.getSystemResource("images/planets/"+planets.getBodies().get(currI).getEnglishName()+".png");
		Icon icon = new ImageIcon(imageUrl);
		f.getPs().getBtnPlanet().setIcon(icon);
		f.getPs().getBtnPlanet().setText(planets.getBodies().get(currI).getEnglishName());
	}

}
