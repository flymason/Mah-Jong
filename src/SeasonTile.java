import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;


public class SeasonTile extends PictureTile
{
	private ImageIcon image;
	public SeasonTile(String name)
	{
		super(name);
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		image = new ImageIcon("images/" + this.toString() + ".png");
		
		image = new ImageIcon(image.getImage().getScaledInstance((int)(image.getIconWidth() * .9), -1, Image.SCALE_REPLICATE));

		image.paintIcon(this, g, 50 - image.getIconWidth() / 2, 40 - image.getIconHeight() / 2);
		
	}
}
