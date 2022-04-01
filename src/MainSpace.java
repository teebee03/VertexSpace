import java.util.List;

/*import control.GestoreEventi;
import model.Biblioteca;*/
import view.Finestra;

public class MainSpace
{
	public static void main(String[] args)throws Exception
	{
		
		apiCommunicator rc = new apiCommunicator();
		//Finestra f=new Finestra();
		/*Biblioteca b=new Biblioteca();
		GestoreEventi gest=new GestoreEventi(f,b);*/
		
		
		
		System.out.println(rc.makeBody("terre",true).getEnglishName());
		List<Body.Moons> lune = rc.makeBody("mars",true).getMoons();
		for (int i = 0; i < lune.size(); i++) 
		{
			System.out.println(lune.get(i).getRel());
			System.out.println(rc.makeBody(lune.get(i).getRel(), false).getEnglishName());
		}
		System.out.println(rc.makeBody("terre",true).getDensity());
		System.out.println(rc.makeBody("terre",true).getBodyType());
	}
}
