package gui.view;

import gui.controller.GUIAppController;
import javax.swing.JFrame;

//private is only for getters and setters	
//"extends" is the word at inherits things
public class GUIFrame extends JFrame
{
	private GUIAppController appController;
	private GUIPanel firstPanel;
	
	public GUIFrame(GUIAppController appController)
	{
		//super calls the parent constructor
		super();
		this.appController  = appController;
		this.firstPanel = new GUIPanel(appController);
		
		setupFrame();
	}
	//belongs to frame class and handles the components for the gui
	private void setupFrame()
	{
		//requires all that is below in setupFrame
		//this is also what a basic frame looks like
		this.setContentPane(firstPanel);
		this.setTitle("The Window title");
		this.setSize(500, 500);
		this.setVisible(true);
	}
}
