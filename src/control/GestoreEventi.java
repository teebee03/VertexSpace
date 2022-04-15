package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.xml.bind.JAXBElement;

import model.ApiCommunicator;
import model.Bodroot;
import view.Finestra;

public class GestoreEventi implements ActionListener,ListSelectionListener,DocumentListener
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
		f.getBs().getBtnStars().addActionListener(this);
		f.getBs().getBtnDwarfPlanets().addActionListener(this);
		f.getBs().getBtnComets().addActionListener(this);
		f.getBs().getBtnAsteroids().addActionListener(this);
		f.getBs().getBtnMoons().addActionListener(this);
		f.getBs().getBtnPlanets().addActionListener(this);
		f.getPs().getBtnLeft().addActionListener(this);
		f.getPs().getBtnRight().addActionListener(this);
		f.getPs().getBtnBack().addActionListener(this);
		f.getPs().getBtnPlanet().addActionListener(this);
		f.getBd().getBtnBack().addActionListener(this);
		f.getBl().getTableOfBodies().getSelectionModel().addListSelectionListener(this);
		f.getBd().getTableBodyDesc().getSelectionModel().addListSelectionListener(this);
		f.getBl().getBtnBack().addActionListener(this);
		f.getBl().getSearchArField().getDocument().addDocumentListener(this);
		f.getBl().getSearchBodyField().getDocument().addDocumentListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		/***BodiesSelection***/
		if(e.getSource()==f.getBs().getBtnStars()) //da Bs a Bd (stars)
		{
			f.getBs().setVisible(false);
			if(urlB!="?filter[]=bodyType,eq,Star")
			{
				urlB="?filter[]=bodyType,eq,Star";
				bodiesReq=api.makeBodies(urlB);
			}
			f.getBd().getTableBodyDesc().setModel(bodiesReq.printBodyTable());
			try
			{
				URL imageUrl=ClassLoader.getSystemResource("images/planets/"+bodiesReq.getBodies().get(0).getEnglishName()+".png");
				Icon icon = new ImageIcon(imageUrl);
				f.getBd().getLblBodyImage().setIcon(icon);
			}
			catch(NullPointerException ex)
			{}
			f.getBd().setVisible(true);
		}
		
		if(e.getSource()==f.getBs().getBtnDwarfPlanets()) //da Bs a Bl (dwarf planets)
		{
			f.getBs().setVisible(false);
			if(urlB!="?filter[]=bodyType,eq,Dwarf%20Planet&data=id,englishName,bodyType")
			{
				urlB="?filter[]=bodyType,eq,Dwarf%20Planet&data=id,englishName,bodyType";
				bodiesReq=api.makeBodies(urlB);
				f.getBl().getTableOfBodies().setModel(bodiesReq.printBodiesList());
				f.getBl().getTableOfBodies().removeColumn(f.getBl().getTableOfBodies().getColumnModel().getColumn(0));
			}
			TableRowSorter ts=new TableRowSorter(f.getBl().getTableOfBodies().getModel());
			f.getBl().getTableOfBodies().setRowSorter(ts);
			f.getBl().setVisible(true);
		}
		
		if(e.getSource()==f.getBs().getBtnComets()) //da Bs a Bl (comets)
		{
			f.getBs().setVisible(false);
			if(urlB!="?filter[]=bodyType,eq,Comet&data=id,englishName,bodyType")
			{
				urlB="?filter[]=bodyType,eq,Comet&data=id,englishName,bodyType";
				bodiesReq=api.makeBodies(urlB);
				f.getBl().getTableOfBodies().setModel(bodiesReq.printBodiesList());
				f.getBl().getTableOfBodies().removeColumn(f.getBl().getTableOfBodies().getColumnModel().getColumn(0));
			}
			TableRowSorter ts=new TableRowSorter(f.getBl().getTableOfBodies().getModel());
			f.getBl().getTableOfBodies().setRowSorter(ts);
			f.getBl().setVisible(true);
		}
		
		if(e.getSource()==f.getBs().getBtnAsteroids()) //da Bs a Bl (asteroid)
		{
			f.getBs().setVisible(false);
			if(urlB!="?filter[]=bodyType,eq,Asteroid&data=id,englishName,bodyType")
			{
				urlB="?filter[]=bodyType,eq,Asteroid&data=id,englishName,bodyType";
				bodiesReq=api.makeBodies(urlB);
				f.getBl().getTableOfBodies().setModel(bodiesReq.printBodiesList());
				f.getBl().getTableOfBodies().removeColumn(f.getBl().getTableOfBodies().getColumnModel().getColumn(0));
			}
			TableRowSorter ts=new TableRowSorter(f.getBl().getTableOfBodies().getModel());
			f.getBl().getTableOfBodies().setRowSorter(ts);
			f.getBl().setVisible(true);
		}
		
		if(e.getSource()==f.getBs().getBtnMoons()) //da Bs a Bl (moons)
		{
			f.getBs().setVisible(false);
			if(urlB!="?filter[]=bodyType,eq,Moon&data=id,englishName,aroundPlanet,planet,rel,bodyType")
			{
				urlB="?filter[]=bodyType,eq,Moon&data=id,englishName,aroundPlanet,planet,rel,bodyType";
				bodiesReq=api.makeBodies(urlB);
				
				String link="?filter[]=isPlanet,eq,true&data=id,englishName";
				Bodroot engNames = api.makeBodies(link);
				String aroundPlanet="";
				for(int i=0;i<bodiesReq.getBodies().size();i++)
				{
					aroundPlanet = ""+((JAXBElement)bodiesReq.getBodies().get(i).getAroundPlanet().getContent().get(0)).getValue();
					
					Boolean flag=false;
					int j=0;
					while(j<engNames.getBodies().size() && !flag)
					{
						if(engNames.getBodies().get(j).getId().equals(aroundPlanet))
							flag=true;
						else
							j++;
					}
					if(!flag)
					{
						Bodroot req=api.makeBodies(aroundPlanet+"?data=id,englishName");
						engNames.getBodies().add(req.getBodies().get(0));
					}
				}
				f.getBl().getTableOfBodies().setModel(bodiesReq.printBodiesList(engNames));
				f.getBl().getTableOfBodies().removeColumn(f.getBl().getTableOfBodies().getColumnModel().getColumn(0));
			}
			TableRowSorter ts=new TableRowSorter(f.getBl().getTableOfBodies().getModel());
			f.getBl().getTableOfBodies().setRowSorter(ts);
			f.getBl().getLblAroundPlanet().setVisible(true);
			f.getBl().getSearchArField().setVisible(true);		
			f.getBl().setVisible(true);
		}
		
		if(e.getSource()==f.getBs().getBtnPlanets()) //da Bs a Ps (planets)
		{
			f.getBs().setVisible(false);
			if(urlB!="?filter[]=isPlanet,eq,true&order=aphelion&data=id,englishName,isPlanet,bodyType")
			{
				urlB="?filter[]=isPlanet,eq,true&order=aphelion&data=id,englishName,isPlanet,bodyType";
				bodiesReq=api.makeBodies(urlB);
			}
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
			
			//count moons
			Bodroot moons =api.makeBodies("?filter[]=bodyType,eq,Moon&data=id,englishName,aroundPlanet,planet");
			int counter =0;
			for (int i = 0; i < moons.getBodies().size(); i++) 
			{
				if (body.getBodies().get(0).getId().equals(((JAXBElement)moons.getBodies().get(i).getAroundPlanet().getContent().get(0)).getValue()))
					counter++;
			}
			
			DefaultTableModel model = body.printBodyTable();
			model.insertRow(1,new String[]{"Moons:",""+counter} );
			
			f.getBd().getTableBodyDesc().setModel(model);
			f.getBd().getTableBodyDesc().getColumnModel().getColumn(0).setPreferredWidth(5);
			f.getBd().setVisible(true);
		}		
		
		/***BodyDesc***/
		if(e.getSource()==f.getBd().getBtnBack()) //da Bd a (Ps o Bl)
		{
			f.getBd().setVisible(false);
			if(bodiesReq.getBodies().get(0).getIsPlanet().equals("true"))
				f.getPs().setVisible(true);
			else if(bodiesReq.getBodies().get(0).getBodyType().equals("Star"))
				f.getBs().setVisible(true);
			else
				f.getBl().setVisible(true);
		}
		
		/***BodiesList***/
		if(e.getSource()==f.getBl().getBtnBack()) //da Bl a Bs
		{
			f.getBl().setVisible(false);
			f.getBl().getSearchBodyField().setText("");
			f.getBl().getSearchArField().setText("");
			f.getBl().getSearchArField().setVisible(false);
			f.getBl().getLblAroundPlanet().setVisible(false);
			currI=0;
			f.getBl().getTableOfBodies().setRowSorter(null);
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
		if(e.getSource()==f.getBl().getTableOfBodies().getSelectionModel()) //da Bl a Bd
		{
			int rowF = f.getBl().getTableOfBodies().getSelectedRow();
			f.getBl().getTableOfBodies().clearSelection();
			if (rowF>=0)
			{
				int row = f.getBl().getTableOfBodies().getRowSorter().convertRowIndexToModel(rowF);
				f.getBl().setVisible(false);
				f.getBd().getLblBodyImage().setIcon(null);
				urlB = ""+f.getBl().getTableOfBodies().getModel().getValueAt(row, 0);
				bodiesReq=api.makeBodies(urlB);
				URL imageUrl=null;
				try
				{
					if(!bodiesReq.getBodies().get(0).getEnglishName().equals("C/2020 F3 (NEOWISE)"))
						imageUrl=ClassLoader.getSystemResource("images/planets/"+bodiesReq.getBodies().get(0).getEnglishName()+".png");
					else
						imageUrl=ClassLoader.getSystemResource("images/planets/C2020 F3 (NEOWISE).png");
					Icon icon = new ImageIcon(imageUrl);
					f.getBd().getLblBodyImage().setIcon(icon);
					
				}
				catch(NullPointerException ex)
				{
					if(bodiesReq.getBodies().get(0).getBodyType().equals("Asteroid"))
					{
						imageUrl=ClassLoader.getSystemResource("images/planets/asteroidImage.png");
					}
					else 
					{
						//change moon default image
						imageUrl=ClassLoader.getSystemResource("images/planets/moonImage.png");
					}
					Icon icon = new ImageIcon(imageUrl);
					f.getBd().getLblBodyImage().setIcon(icon);
						
				}
				
				if(bodiesReq.getBodies().get(0).getAroundPlanet().getContent().size() !=1)
				{
					String link=""+((JAXBElement)bodiesReq.getBodies().get(0).getAroundPlanet().getContent().get(0)).getValue();
					Bodroot engNames=api.makeBodies(link+"?data=id,englishName");
					f.getBd().getTableBodyDesc().setModel(bodiesReq.printBodyTable(engNames));
				}
				else
					f.getBd().getTableBodyDesc().setModel(bodiesReq.printBodyTable());
				f.getBd().getTableBodyDesc().getColumnModel().getColumn(0).setPreferredWidth(8);
				f.getBd().setVisible(true);
			}
		
		}
		
		if(e.getSource()==f.getBd().getTableBodyDesc().getSelectionModel()) //da Bd a Bl (see moons from planet)
		{
			int row = f.getBd().getTableBodyDesc().getSelectedRow();
			if(row==1 && f.getBd().getTableBodyDesc().getValueAt(row, 0).equals("Moons:") && !f.getBd().getTableBodyDesc().getValueAt(row, 1).equals("0"))
			{
				f.getBd().setVisible(false);
				f.getBd().getTableBodyDesc().clearSelection();
				int k=0;
				boolean flag=false;
				while(k<bodiesReq.getBodies().size() && !flag)
				{
					if(bodiesReq.getBodies().get(k).getEnglishName().equals(f.getBd().getTableBodyDesc().getModel().getValueAt(0, 1)))
						flag=true;
					else
						k++;
				}
				String id = bodiesReq.getBodies().get(k).getId();
				urlB="?filter[]=aroundPlanet,eq,"+id+"&data=id,englishName,aroundPlanet,planet,rel,bodyType";
				Bodroot moons=api.makeBodies(urlB);
				
				String link="?filter[]=isPlanet,eq,true&data=id,englishName";
				Bodroot engNames = api.makeBodies(link);
				f.getBl().getTableOfBodies().setModel(moons.printBodiesList(engNames));
				f.getBl().getTableOfBodies().removeColumn(f.getBl().getTableOfBodies().getColumnModel().getColumn(0));
				TableRowSorter ts=new TableRowSorter(f.getBl().getTableOfBodies().getModel());
				f.getBl().getTableOfBodies().setRowSorter(ts);
				f.getBl().getLblAroundPlanet().setVisible(true);
				f.getBl().getSearchArField().setVisible(true);		
				f.getBl().setVisible(true);
			}
		}
	}

	@Override
	public void insertUpdate(DocumentEvent e)
	{
		String searchTextB="";
		String searchTextAr="";
		
		if(e.getDocument()==f.getBl().getSearchArField().getDocument() || e.getDocument()==f.getBl().getSearchBodyField().getDocument())
		{
			searchTextB=f.getBl().getSearchBodyField().getText();
			searchTextAr=f.getBl().getSearchArField().getText();
			((TableRowSorter) f.getBl().getTableOfBodies().getRowSorter()).setRowFilter(new MyRowFilter(searchTextB,searchTextAr));
		}
		
	}

	@Override
	public void removeUpdate(DocumentEvent e)
	{
		String searchTextB="";
		String searchTextAr="";
		
		if(e.getDocument()==f.getBl().getSearchArField().getDocument() || e.getDocument()==f.getBl().getSearchBodyField().getDocument())
		{
			searchTextB=f.getBl().getSearchBodyField().getText();
			searchTextAr=f.getBl().getSearchArField().getText();
			((TableRowSorter) f.getBl().getTableOfBodies().getRowSorter()).setRowFilter(new MyRowFilter(searchTextB,searchTextAr));
		}
	}

	@Override
	public void changedUpdate(DocumentEvent e) {
		// TODO Auto-generated method stub
		
	}
}
