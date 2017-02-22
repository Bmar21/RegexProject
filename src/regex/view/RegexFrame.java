package regex.view;

import javax.swing.JFrame;
import java.awt.Dimension;
import regex.controller.RegexController;

public class RegexFrame extends JFrame 
{
	private RegexController baseController;
	private RegexPanel appPanel;
	
	public RegexFrame(RegexController baseController)
	{
		super();
		this.baseController = baseController;
		this.appPanel = new RegexPanel(baseController);
		
		this.setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("Regex Project");
		this.setSize(new Dimension(600, 400));
		this.setVisible(true);
	}
	
}
