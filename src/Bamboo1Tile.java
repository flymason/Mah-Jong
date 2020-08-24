import java.awt.*;

import javax.swing.*;


public class Bamboo1Tile extends PictureTile
{
	private ImageIcon image;
	public Bamboo1Tile()
	{
		super("Bamboo 1");
	}
	public String toString()
	{
		return "Bamboo 1";
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		image = new ImageIcon("images/Sparrow.png");
		//image = image.getScaledInstance((int)(image.getWidth(this) * 1.5), -1, Image.SCALE_SMOOTH);
		image = new ImageIcon(image.getImage().getScaledInstance((int)(image.getIconWidth() * .9), -1, Image.SCALE_REPLICATE));

		image.paintIcon(this, g, 50 - image.getIconWidth() / 2, 37 - image.getIconHeight() / 2);
		//g.drawImage(image, 50 - image.getWidth(this)/2, 40 - image.getHeight(this)/2, this);
		
	}
}
