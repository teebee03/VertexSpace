import java.util.List;

public class MainSpace
{
	public static void main(String[] args)throws Exception
	{
		
		apiCommunicator rc = new apiCommunicator();
		System.out.println(rc.getBody("terre",true).getName());
		List<Body.Moons> lune = rc.getBody("mars",true).getMoons();
		for (int i = 0; i < lune.size(); i++) 
		{
			//System.out.println(lune.get(i).getRel());
			System.out.println(rc.getBody(lune.get(i).getRel(), false).getEnglishName());
		}
		System.out.println("fork test");
	}
}
