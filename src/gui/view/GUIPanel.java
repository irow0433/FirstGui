package gui.view;

import gui.controller.GUIAppController;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SpringLayout;

//"extends" is the word that inherits things (java)
public class GUIPanel extends JPanel
{
	private GUIAppController appController;
	private JButton firstButton;
	private SpringLayout baseLayout;
	
	//Below is a constructor
	
	public GUIPanel(GUIAppController appController) 
	{
		//first line that uses extends is super();
		super();
		this.appController = appController;
		firstButton = new JButton("Look a button");
		baseLayout = new SpringLayout();
		
		setupPanel();
	}
	
	/**
	 * Used to add all components to the subclass of JPanel
	 * this installs them into the panel so they are seen in the GUI
	 */
	//need to call it "setupPanel();
	private void setupPanel()
	{
		this.setBackground(Color.GREEN);
		this.setLayout(baseLayout);
		this.add(firstButton);
	}
	/**
	 * this is used to hold all the layout and arrangement code for the SpringLayout
	 */
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}
