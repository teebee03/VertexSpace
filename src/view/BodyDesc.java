package view;

import java.awt.Color;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.net.URL;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

import model.Bodroot;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.BorderLayout;

/**
 * Crea un pannello che contiene i dati relativi a un Body
 * @author Alberti Lorenzo, Bertelli Tommaso
 * @version 1.0.0
 * @since 1.0
 */
public class BodyDesc extends JPanel
{
	
	private Image img;
	private JPanel componentsContainter1;
	private JTable tableBodyDesc;
	private JScrollPane scrollPane;
	private JPanel componentsContainter2;
	private JLabel lblBodyImage;
	private JButton btnBack;
	private JLabel lblWarning;
	
	
	/**
	 * Create the panel.
	 */
	public BodyDesc(Bodroot body)
	{
		URL imageUrlBg=ClassLoader.getSystemResource("images/spaceBg.jpg");
		img=Toolkit.getDefaultToolkit().createImage(imageUrlBg);
		UsefulMethods.loadImage(img,this);
		setBounds(0, 0, 1170, 861);
		setLayout(new GridLayout(1, 2, 0, 0));
		
		componentsContainter1 = new JPanel();
		add(componentsContainter1);
		componentsContainter1.setLayout(null);
		componentsContainter1.setOpaque(false);
		
		lblBodyImage = new JLabel();
		if(body!=null)
		{
			URL imageUrl=ClassLoader.getSystemResource("images/planets/"+body.getBodies().get(0).getEnglishName()+".png");
			Icon icon = new ImageIcon(imageUrl);
			lblBodyImage.setIcon(icon);
		}
		lblBodyImage.setBounds(36, 174, 512, 512);
		lblBodyImage.setHorizontalAlignment(SwingConstants.CENTER);
		
		componentsContainter1.add(lblBodyImage);
		
		btnBack=UsefulMethods.backButton();
		componentsContainter1.add(btnBack);
		
		
		componentsContainter2 = new JPanel();
		add(componentsContainter2);
		componentsContainter2.setOpaque(false);
		
		tableBodyDesc = new JTable(){
			private static final long serialVersionUID = 1L;

			@Override
			public boolean isCellEditable ( int row, int col)
			{
				return false;
			}
		};
		tableBodyDesc.setRowSelectionAllowed(false);
		tableBodyDesc.setFocusable(false);
		tableBodyDesc.setRowHeight(27);
		tableBodyDesc.setShowVerticalLines(false);
		tableBodyDesc.setFont(new Font("Tahoma", Font.BOLD, 19));
		tableBodyDesc.setForeground(Color.ORANGE);
		tableBodyDesc.setOpaque(false);
		((DefaultTableCellRenderer)tableBodyDesc.getDefaultRenderer(Object.class)).setOpaque(false);
		componentsContainter2.setLayout(new BorderLayout(0, 0));
		componentsContainter2.add(tableBodyDesc,BorderLayout.NORTH);
		
		lblWarning = new JLabel("Some data may not be provided!");
		lblWarning.setFont(new Font("Tahoma", Font.ITALIC, 21));
		lblWarning.setForeground(Color.WHITE);
		lblWarning.setHorizontalAlignment(SwingConstants.CENTER);
		componentsContainter2.add(lblWarning, BorderLayout.CENTER);
	}
	
	public JTable getTableBodyDesc() {
		return tableBodyDesc;
	}
	
	public void setTableBodyDesc(JTable tableBodyDesc) {
		this.tableBodyDesc = tableBodyDesc;
	}
	
	public JScrollPane getScrollPane() {
		return scrollPane;
	}
	
	public void setScrollPane(JScrollPane scrollPane) {
		this.scrollPane = scrollPane;
	}
	
	public JPanel getComponentsContainter1() {
		return componentsContainter1;
	}
	
	public void setComponentsContainter1(JPanel componentsContainter1) {
		this.componentsContainter1 = componentsContainter1;
	}
	
	public JPanel getComponentsContainter2() {
		return componentsContainter2;
	}
	
	public void setComponentsContainter2(JPanel componentsContainter2) {
		this.componentsContainter2 = componentsContainter2;
	}
	
	public JLabel getLblBodyImage() {
		return lblBodyImage;
	}
	
	public void setLblBodyImage(JLabel lblBodyimage) {
		this.lblBodyImage = lblBodyimage;
	}
	
	public JButton getBtnBack() {
		return btnBack;
	}
	
	public void setBtnBack(JButton btnBack) {
		this.btnBack = btnBack;
	}
	
	@Override
	protected void paintComponent(Graphics g)
	{
	    setOpaque(false);
	    g.drawImage(img, 0, 0, null);
	    super.paintComponent(g);
	}
}
