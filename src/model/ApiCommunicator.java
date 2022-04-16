package model;
import java.io.BufferedReader;
import java.io.File;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.json.JSONObject;
import org.json.XML;

/**
 * Abilita la comunicazione con l'API
 * @author Alberti Lorenzo, Bertelli Tommaso
 * @version 1.0.0
 * @since 1.0
 */
public class ApiCommunicator 
{
	public ApiCommunicator(){}
	
	/***
	 * Permette di inviare richieste all'api e ottenere l'oggetto richiesto facendo la conversione da json ad xml e la sucessiva
	 * conversione ad oggetto
	 * 
	 * @param urlB Stringa contenente il nome del Body per cui filtrare la richiesta all'api, con possibili filtri
	 * @return un oggetto Bodroot contenente i Bodies con i dati richiesti all'API
	 */
	public Bodroot makeBodies(String urlB)
	{
		String xml="";
		String urlA="https://api.le-systeme-solaire.net/rest/bodies/";
		urlA+=urlB;
		
		Bodroot bod = new Bodroot();
		try 
		{
			URL url = new URL(urlA);  
	        HttpURLConnection conn = (HttpURLConnection) url.openConnection( );   
	        conn.setRequestMethod("GET");
	        conn.setRequestProperty("Content-length", "0");
	        conn.setUseCaches(false);
	        conn.setAllowUserInteraction(false);
	        conn.setConnectTimeout(10000);
	        conn.setReadTimeout(10000);
	        conn.connect();
	        
	        String responseString=""; 
			if (conn.getResponseCode()==200) 
			{
				InputStream response = conn.getInputStream();
				responseString = convertStreamToString(response);
			}
			else
				System.out.println("Error 200");
			
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
			
			//creazione di un oggetto di tipo Bodroot (oggetto radice)
			JAXBContext context = JAXBContext.newInstance(Bodroot.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			bod = (Bodroot) unmarshaller.unmarshal(f);
			f.delete();
			
		}
		catch (Exception e) 
		{
			System.out.println("Connection Error");
			e.printStackTrace();
		}
		return bod;
	}
	
	/**
	 * Converte un InputStream in una stringa
	 * @param is InputStream da convertire
	 * @return la stringa ottenuta dalla conversione
	 */
	private static String convertStreamToString(InputStream is)
	{

		BufferedReader reader = new BufferedReader(new InputStreamReader(is));
		StringBuilder sb = new StringBuilder();

		String line = null;
		try
		{
		    while ((line = reader.readLine()) != null)
		    {
		        sb.append(line + "\n");
		    }
		}
		catch (IOException e)
		{
		    e.printStackTrace();
		}
		finally
		{
		    try
		    {
		        is.close();
		    }
		    catch (IOException e)
		    {
		        e.printStackTrace();
		    }
		}
		return sb.toString();
	}
}
