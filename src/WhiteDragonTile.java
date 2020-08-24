import java.awt.*;

public class WhiteDragonTile extends Tile
{
	public String toString()
	{
		return "White Dragon";
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(Color.BLUE);
		g.drawRect(28, 8, 44, 64);
		g.drawRect(38, 18, 24, 44);
		
		g.fillRect(28, 8, 11, 11);
		g.fillRect(51, 8, 12, 11);
		g.fillRect(38, 62, 11, 11);
		g.fillRect(62, 62, 11, 11);
		
		g.fillRect(28, 29, 11, 11);
		g.fillRect(28, 51, 11, 11);
		g.fillRect(62, 19, 11, 11);
		g.fillRect(62, 41, 11, 11);
		setToolTipText(toString());
	}
}
