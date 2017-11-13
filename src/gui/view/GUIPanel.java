package gui.view;

import gui.controller.GUIAppController;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;

//"extends" is the word that inherits things (java)
public class GUIPanel extends JPanel
{
	private GUIAppController appController;
	private JButton firstButton;
	
	//Below is a constructor
	
	public GUIPanel(GUIAppController appController) 
	{
		//first line that uses extends is super();
		super();
		this.appController = appController;
		firstButton = new JButton("Look a button");
	}
	
}
