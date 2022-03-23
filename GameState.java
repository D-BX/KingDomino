import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.util.*;
import javax.swing.JPanel;

public class GameState extends JPanel implements KeyListener
{
	
	private BufferedImage dom;
	private int r;
	
	public static void main (String args[])
	{
			
	}
	
	public GameState()
	{
		addKeyListener(this);
		
	}
	
	public void keyPressed(KeyEvent e)
	{
			int key = e.getKeyCode();
			
			if(key == KeyEvent.VK_R);
			{
				rotate();
			}
	}
	
	// commented this out since Yuqian made her own rotate method
	/*private void rotate(int rot) {
		
		BufferedImage i = getDomino();
		int width = i.getWidth();
		int height = i.getHeight();
		
		BufferedImage rotated = new BufferedImage(height, width, i.getType());
		
		
		if(rot==1)
		{
			// 90 degrees
			 Graphics2D graphics2D = rotated.createGraphics();
			   	graphics2D.translate((height - width) / 2, (height - width) / 2);
			    graphics2D.rotate(Math.PI / 2, height / 2, width / 2);
			    graphics2D.drawRenderedImage(i, null);

		}else if(rot==2)
		{
			// 180 degrees
			Graphics2D graphics2D = rotated.createGraphics();
		   	graphics2D.translate((height - width) / 2, (height - width) / 2);
		    graphics2D.rotate(Math.PI , height / 2, width / 2);
		    graphics2D.drawRenderedImage(i, null);
		}else if(rot==3)
		{
			// 270 degrees
			Graphics2D graphics2D = rotated.createGraphics();
		   	graphics2D.translate((height - width) / 2, (height - width) / 2);
		    graphics2D.rotate(3 * Math.PI / 2 , height / 2, width / 2);
		    graphics2D.drawRenderedImage(i, null);
		}else if(rot==4)
		{
			// 360 degrees
			Graphics2D graphics2D = rotated.createGraphics();
		   	graphics2D.translate((height - width) / 2, (height - width) / 2);
		    graphics2D.rotate(2 * Math.PI , height / 2, width / 2);
		    graphics2D.drawRenderedImage(i, null);
		}*/
	

	public void keyTyped(KeyEvent e) {}
	public void keyReleased(KeyEvent e) {}
}
