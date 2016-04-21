// FinalProject.java
// Student Version


import java.awt.*;
import java.applet.*;


public class FinalProject extends Applet
{
	Image img = Toolkit.getDefaultToolkit().createImage("testLevel.png");
	Image plank = Toolkit.getDefaultToolkit().createImage("plank.png");
	
	public void paint(Graphics g)
	{
		
		testLevel;
		g.drawImage(img, 0, 0, null);
		g.drawImage(plank, 0, 0, null);

	}

}


