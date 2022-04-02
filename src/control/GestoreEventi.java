package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferStrategy;
import java.util.Collections;

import javax.swing.JOptionPane;

import model.ApiCommunicator;
import view.Finestra;

public class GestoreEventi implements ActionListener
{
	private Finestra f;
	private ApiCommunicator api;
	public GestoreEventi(Finestra f,ApiCommunicator api)
	{
		this.f=f;
		this.api=api;
		
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		
	}

}
