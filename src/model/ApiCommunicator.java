package model;
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
/***
 *Classe che abilita la comunicazione con l'api 
 * @author tommaso bertelli, lorenzo alberti
 *
 */
public class ApiCommunicator 
{
	public ApiCommunicator(){}
	
	/***
	 * Metodo che permette di inviare richieste all'api e ottenere l'oggetto richiesto facendo la conversione da json ad xml e la sucessiva
	 * conversione ad oggetto
	 * 
	 * @param urlB stringa contenente il nome del corpo per cui filtrare la richiesta all'api, con possibili filtri
	 * @return i corpi richiesti dall'api
	 */
	public Bodroot makeBodies(String urlB)
	{
		String xml="";
		String urlA="https://api.le-systeme-solaire.net/rest/bodies/";
		urlA+=urlB;
		
		Bodroot bod = new Bodroot();
		try 
		{
			//richieste all'api
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
			//creazione di un oggetto json
			JSONObject json = new JSONObject(responseString);
			//conversione da json ad xml e correzione
			xml = XML.toString(json);
			if(urlB.charAt(0)!='?')
				xml = String.join("", "<bodroot><bodies>", xml, "</bodies></bodroot>");
			else
				xml = String.join("", "<bodroot>", xml, "</bodroot>");
			File f = new File("body.xml");
			FileWriter fo = new FileWriter(f);
			fo.write(xml);
			fo.close();
			//creazione di un oggetto di tipo bodroot (oggetto radice)
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
