package main;
import java.io.Serializable;

import javax.xml.bind.JAXBElement;

import control.GestoreEventi;
import model.ApiCommunicator;
import model.Bodroot;
import view.Finestra;

public class MainSpace
{
	public static void main(String[] args)throws Exception
	{
		Finestra f=new Finestra();
		ApiCommunicator api=new ApiCommunicator();
		GestoreEventi gest=new GestoreEventi(f,api);
		
		
		//ApiCommunicator rc=new ApiCommunicator();
		//System.out.println((rc.makeBodies("mars").getBodies().get(0).getAroundPlanet().getContent().get(0))); //null
		//System.out.println(((JAXBElement)rc.makeBodies("mars").getBodies().get(0).getMass().getContent().get(0)).getValue()); //val
		/*System.out.println(rc.makeBody("terre",true).getEnglishName());
		Bodies.Body.Moons lune = rc.makeBody("mars",true).getMoons();
		for (int i = 0; i < lune.size(); i++) 
		{
			System.out.println(lune.get(i).getRel());
			System.out.println(rc.makeBody(lune.get(i).getRel(), false).getEnglishName());
		}
		System.out.println(rc.makeBody("terre",true).getDensity());
		System.out.println(rc.makeBody("terre",true).getBodyType());*/
	}
}
