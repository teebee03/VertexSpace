package view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.ColorUIResource;

import java.awt.Color;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;
import java.awt.BorderLayout;

public class Finestra extends JFrame implements WindowListener
{

	private JPanel contentPane;
	private FirstPage fp;
	private BodiesSelection bs;
	private PlanetSelection ps;
	private BodyDesc bd;
	private BodiesList bl;


	/**
	 * Creazione della finestra
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	public Finestra() throws InterruptedException, IOException
	{
		setTitle("Vertex Space");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1180,900);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		addWindowListener(this);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		putUIManagerDefault();
		
		fp = new FirstPage();
		fp.setBounds(0, 0, 1170, 861);
		contentPane.add(fp);
		
		bs = new BodiesSelection();
		bs.setBounds(0, 0, 1170, 861);
		contentPane.add(bs);
		
		ps=new PlanetSelection(null);
		ps.setBounds(0, 0, 1170, 861);
		ps.setVisible(false);
		contentPane.add(ps);
		
		bd=new BodyDesc(null);
		bd.setBounds(0, 0, 1170, 861);
		bd.setVisible(false);
		contentPane.add(bd);
		
		bl=new BodiesList();
		bl.setBounds(0, 0, 1170, 861);
		bl.setVisible(false);
		contentPane.add(bl);
		
		setVisible(true);
	}

	
	
	public FirstPage getFp() {
		return fp;
	}



	public void setFp(FirstPage fp) {
		this.fp = fp;
	}



	public BodiesSelection getBs() {
		return bs;
	}



	public void setBs(BodiesSelection bs) {
		this.bs = bs;
	}



	public PlanetSelection getPs() {
		return ps;
	}



	public void setPs(PlanetSelection ps) {
		this.ps = ps;
	}



	public BodyDesc getBd() {
		return bd;
	}



	public void setBd(BodyDesc bd) {
		this.bd = bd;
	}



	public BodiesList getBl() {
		return bl;
	}



	public void setBl(BodiesList bl) {
		this.bl = bl;
	}

	@Override
	public void windowOpened(WindowEvent e)
	{
		try{
			Thread.sleep(3000);
		}catch (InterruptedException e1){
			e1.printStackTrace();
		}
		fp.setVisible(false);
	}

	@Override
	public void windowClosing(WindowEvent e)
	{
		int check=JOptionPane.showConfirmDialog(this,"Are you sure you want to exit?","Confirm Exit",JOptionPane.YES_NO_OPTION);
		if(check==JOptionPane.YES_OPTION)
		{
			System.exit(0);
		}
		else
		{
			this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		}
	}

	@Override
	public void windowClosed(WindowEvent e) {}

	@Override
	public void windowIconified(WindowEvent e) {}

	@Override
	public void windowDeiconified(WindowEvent e) {}

	@Override
	public void windowActivated(WindowEvent e) {}

	@Override
	public void windowDeactivated(WindowEvent e) {}
	
	/**
	 * Stabilisce impostazioni di visualizzazione grafica (utile per modificare JOptionPane)
	 */
	private void putUIManagerDefault()
	{
		UIManager.put("OptionPane.background",Color.black);
		UIManager.put("Panel.background",Color.black);
		UIManager.put("OptionPane.messageForeground",Color.orange);
		UIManager.put("Button.background", Color.orange);
		UIManager.put("Button.foreground", Color.black);
		UIManager.put("Button.focus", new ColorUIResource(new Color(0, 0, 0, 0)));
	}
}
