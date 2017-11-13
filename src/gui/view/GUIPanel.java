package gui.view;

import gui.controller.GUIAppController;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SpringLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		setupLayout();
		setupListeners();
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
		baseLayout.putConstraint(SpringLayout.NORTH, firstButton, 129, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstButton, 0, SpringLayout.WEST, this);
	}
	
	/**
	 * this helper method is used to link any GUi components to the associated listeners.
	 */
	private void setupListeners()
	{
		//FirstButton.addAcitonListener Attaches a Listener to the button
		firstButton.addActionListener(new ActionListener()
		{
			//public void actionPerformed execute this code when the button is clicked
			public void actionPerformed(ActionEvent click)
			{
				changeBackgroundColor();
			}
		});
	}
	
	private void changeBackgroundColor()
	{
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		
		this.setBackground(new Color(red, green, blue));
	}
}
