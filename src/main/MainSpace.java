package main;

import control.GestoreEventi;
import model.ApiCommunicator;
import view.Finestra;

/**
 * Contiene il Main
 * @author Alberti Lorenzo, Bertelli Tommaso
 * @version 1.0.0
 * @since 1.0
 */
public class MainSpace
{
	public static void main(String[] args) throws Exception
	{
		Finestra f=new Finestra();
		ApiCommunicator api=new ApiCommunicator();
		new GestoreEventi(f,api);
	}
}