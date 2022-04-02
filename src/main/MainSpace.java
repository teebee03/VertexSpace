package main;
import control.GestoreEventi;
import model.ApiCommunicator;
import view.Finestra;

public class MainSpace
{
	public static void main(String[] args)throws Exception
	{
		Finestra f=new Finestra();
		ApiCommunicator api=new ApiCommunicator();
		GestoreEventi gest=new GestoreEventi(f,api);
		
		
		//ApiCommunicator rc=new ApiCommunicator();
		//System.out.println(rc.makeBodies("?data=englishName").getBodies().get(0).getEnglishName());
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
