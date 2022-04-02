package model;
import java.io.File;
import java.io.FileWriter;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;
 
public class ApiCommunicator 
{
	public ApiCommunicator(){}
	
	public Bodroot makeBodies(String urlB)
	{
		String xml="";
		String urlA="https://api.le-systeme-solaire.net/rest/bodies/";
		urlA+=urlB;
		
		Bodroot bod = new Bodroot();
		try 
		{
			HttpRequest request = HttpRequest.newBuilder().GET().uri(URI.create(urlA)).header("accept", "application/json").build();
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
			if(urlB.charAt(0)!='?')
				xml = String.join("", "<bodroot><bodies>", xml, "</bodies></bodroot>");
			else
				xml = String.join("", "<bodroot>", xml, "</bodroot>");
			File f = new File("body.xml");
			FileWriter fo = new FileWriter(f);
			fo.write(xml);
			fo.close();
			JAXBContext context = JAXBContext.newInstance(Bodroot.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			bod = (Bodroot) unmarshaller.unmarshal(f);
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
