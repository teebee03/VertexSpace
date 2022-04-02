package view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;
import java.awt.BorderLayout;

public class Finestra extends JFrame implements WindowListener {

	private JPanel contentPane;
	private FirstPage fp;
	private BodiesSelection bs;
	private PlanetSelection ps;
	private BodyDesc bd;
	private MoonsListPanel ml;

	/**
	 * Create the frame.
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	public Finestra() throws InterruptedException, IOException {
		setTitle("Vertex Space");
		setResizable(false);
		addWindowListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1180,900);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		


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
		
		bd=null;
		ml=null;
		
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



	public MoonsListPanel getMl() {
		return ml;
	}



	public void setMl(MoonsListPanel ml) {
		this.ml = ml;
	}



	@Override
	public void windowOpened(WindowEvent e) {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		fp.setVisible(false);
		
	}

	@Override
	public void windowClosing(WindowEvent e)
	{
		int check=JOptionPane.showConfirmDialog(this,"Sei sicuro di volere uscire?","Conferma",JOptionPane.YES_NO_OPTION);
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
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
}
