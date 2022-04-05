package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import com.sun.tools.rngom.digested.DAnnotation;

import model.ApiCommunicator;
import model.Bodroot;
import view.Finestra;

public class GestoreEventi implements ActionListener,ListSelectionListener
{
	private Finestra f;
	private ApiCommunicator api;
	private static int currI=0;
	private static Bodroot bodiesReq=null;
	private static String urlB="";
	
	public GestoreEventi(Finestra f,ApiCommunicator api)
	{
		this.f=f;
		this.api=api;
		f.getBs().getBtnComets().addActionListener(this);
		f.getBs().getBtnAsteroids().addActionListener(this);
		f.getBs().getBtnMoons().addActionListener(this);
		f.getBs().getBtnPlanets().addActionListener(this);
		f.getPs().getBtnLeft().addActionListener(this);
		f.getPs().getBtnRight().addActionListener(this);
		f.getPs().getBtnBack().addActionListener(this);
		f.getPs().getBtnPlanet().addActionListener(this);
		f.getBd().getBtnBack().addActionListener(this);
		f.getMl().getTableOfMoons().getSelectionModel().addListSelectionListener(this);
		f.getMl().getBtnBack().addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		/***BodiesSelection***/
		if(e.getSource()==f.getBs().getBtnComets()) //da Bs a MlP (comets)
		{
			f.getBs().setVisible(false);
			urlB="?filter[]=bodyType,eq,Comet&data=id,englishName";
			bodiesReq=api.makeBodies(urlB);
			f.getMl().getTableOfMoons().setModel(bodiesReq.printBodiesListNoMoon());
			f.getMl().setVisible(true);
		}
		
		if(e.getSource()==f.getBs().getBtnAsteroids()) //da Bs a MlP (asteroid)
		{
			f.getBs().setVisible(false);
			urlB="?filter[]=bodyType,eq,Asteroid&data=id,englishName";
			bodiesReq=api.makeBodies(urlB);
			f.getMl().getTableOfMoons().setModel(bodiesReq.printBodiesListNoMoon());
			f.getMl().setVisible(true);
		}
		
		if(e.getSource()==f.getBs().getBtnMoons()) //da Bs a MlP (moons)
		{
			f.getBs().setVisible(false);
			urlB="?filter[]=bodyType,eq,Moon&data=id,englishName,aroundPlanet,planet,rel";
			bodiesReq=api.makeBodies(urlB);
			f.getMl().getTableOfMoons().setModel(bodiesReq.printBodiesList());
			f.getMl().setVisible(true);
		}
		
		if(e.getSource()==f.getBs().getBtnPlanets()) //da Bs a Ps (planets)
		{
			f.getBs().setVisible(false);
			urlB="?filter[]=isPlanet,eq,true&order=aphelion&data=id,englishName,isPlanet";
			bodiesReq=api.makeBodies(urlB);
			ButtonImageText(bodiesReq,currI);
			f.getPs().setVisible(true);
		}
		
		/***PlanetSelection***/
		if(e.getSource()==f.getPs().getBtnRight())
		{
			if(currI<bodiesReq.getBodies().size()-1)
			{
				currI++;
				ButtonImageText(bodiesReq,currI);
			}
			else
			{
				currI=0;
				ButtonImageText(bodiesReq,currI);
			}
		}
		
		if(e.getSource()==f.getPs().getBtnLeft())
		{
			if(currI>0)
			{
				currI--;
				ButtonImageText(bodiesReq,currI);
			}
			else
			{
				currI=bodiesReq.getBodies().size()-1;
				ButtonImageText(bodiesReq,currI);
			}
		}
		
		if(e.getSource()==f.getPs().getBtnBack()) //da Ps a Bs
		{
			f.getPs().setVisible(false);
			currI=0;
			f.getBs().setVisible(true);
		}
		
		if(e.getSource()==f.getPs().getBtnPlanet()) //da Ps a Bd
		{
			f.getPs().setVisible(false);
			Bodroot.Bodies currPlanetName=bodiesReq.getBodies().get(currI);
			URL imageUrl=ClassLoader.getSystemResource("images/planets/"+currPlanetName.getEnglishName()+".png");
			Icon icon = new ImageIcon(imageUrl);
			f.getBd().getLblBodyImage().setIcon(icon);
			Bodroot body=api.makeBodies(currPlanetName.getId());
			f.getBd().getTableBodyDesc().setModel(body.printBodyTable());
			f.getBd().setVisible(true);
		}		
		
		/***BodyDesc***/
		if(e.getSource()==f.getBd().getBtnBack()) //ci vorra' un if per stabilire se tornare su Ps o MlP
		{
			f.getBd().setVisible(false);
			if(bodiesReq.getBodies().get(0).getIsPlanet().equals("true"))
				f.getPs().setVisible(true);
			else
				f.getMl().setVisible(true);
		}
		
		/***MoonsList***/
		if(e.getSource()==f.getMl().getBtnBack()) //da Ml a Bs
		{
			f.getMl().setVisible(false);
			f.getBs().setVisible(true);
		}
	}
	
	private void ButtonImageText(Bodroot planets,int currI)
	{
		URL imageUrl=ClassLoader.getSystemResource("images/planets/"+planets.getBodies().get(currI).getEnglishName()+".png");
		Icon icon = new ImageIcon(imageUrl);
		f.getPs().getBtnPlanet().setIcon(icon);
		f.getPs().getBtnPlanet().setText(planets.getBodies().get(currI).getEnglishName());
	}

	@Override
	public void valueChanged(ListSelectionEvent e)
	{
		if(e.getSource()==f.getMl().getTableOfMoons().getSelectionModel()) //da Ml a Bd
		{
			int row = f.getMl().getTableOfMoons().getSelectedRow();
			if (row>=0)
			{
				f.getMl().setVisible(false);
				f.getBd().getLblBodyImage().setIcon(null);
				String selBody = ""+f.getMl().getTableOfMoons().getValueAt(row, 0);
				bodiesReq=api.makeBodies(selBody);
				f.getBd().getTableBodyDesc().setModel(bodiesReq.printBodyTable());
				f.getBd().setVisible(true);
			}
		}
	}

}
