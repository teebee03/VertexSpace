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
	}
}