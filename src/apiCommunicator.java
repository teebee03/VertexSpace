import java.io.File;
import java.io.FileWriter;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.json.JSONObject;
import org.json.XML;
 
public class apiCommunicator 
{
	public apiCommunicator(){}
	
	public Body makeBody(String body,boolean isPlanet)
	{
		String xml="";
		String url="";
		if (isPlanet) 
		{
			url = "https://api.le-systeme-solaire.net/rest/bodies/"+body;
		}
		else 
		{
			url=body;
		}
		
		Body bod = new Body();
		try 
		{
			HttpRequest request = HttpRequest.newBuilder().GET().uri(URI.create(url)).header("accept", "application/json").build();
			HttpClient httpClient = HttpClient.newBuilder().version(HttpClient.Version.HTTP_2).build();
			HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
			
			String responseString = "";
			if (response.statusCode() == 200) 
			{
				responseString = response.body();
			}
			else 
			{
				System.out.println("Error 200 not ok");
			}
			JSONObject json = new JSONObject(responseString);
			xml = XML.toString(json);
			xml = String.join("", "<body>", xml, "</body>");
			File f = new File("body.xml");
			FileWriter fo = new FileWriter(f);
			fo.write(xml);
			fo.close();
			JAXBContext context = JAXBContext.newInstance(Body.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			bod = (Body) unmarshaller.unmarshal(f);
			f.delete();
			
		}
		catch (Exception e) 
		{
			System.out.println("Error");
			e.printStackTrace();
		}
		return bod;
	}
}
