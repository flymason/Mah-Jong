import java.awt.*;

import javax.swing.*;

public class BambooTile extends RankTile
{
	private Color myGreen = Color.decode("#008B00");
	
	public BambooTile(int rank)
	{
		super(rank);
		setToolTipText(toString());
	}
	public String toString()
	{
		return "Bamboo " + rank;
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		switch(rank)
		{
			case 2:
				drawStick(g, 50, 27, Color.BLUE);
				drawStick(g, 50, 53, myGreen);
				break;
			case 3:
				drawStick(g, 35, 52, myGreen);
				drawStick(g, 50, 25, Color.BLUE);
				drawStick(g, 64, 52, myGreen);
				break;
			case 4:
				drawStick(g, 36, 27, Color.BLUE);
				drawStick(g, 64, 27, myGreen);
				drawStick(g, 36, 53, myGreen);
				drawStick(g, 64, 53, Color.BLUE);
				break;
			case 5:
				drawStick(g, 35, 53, Color.BLUE);
				drawStick(g, 50, 40, Color.RED);
				drawStick(g, 65, 27, Color.BLUE);
				drawStick(g, 35, 27, myGreen);
				drawStick(g, 65, 53, myGreen);
				break;
			case 6:
				
				drawStick(g, 35, 27, myGreen);				
				drawStick(g, 50, 27, myGreen);
				drawStick(g, 65, 27, myGreen);
				drawStick(g, 35, 53, Color.BLUE);
				drawStick(g, 50, 53, Color.BLUE);
				drawStick(g, 65, 53, Color.BLUE);
				
				break;
			case 7:
				drawStick(g, 50, 14, Color.RED);
				drawStick(g, 35, 39, myGreen);				
				drawStick(g, 50, 39, Color.BLUE);
				drawStick(g, 65, 39, myGreen);
				drawStick(g, 35, 64, myGreen);
				drawStick(g, 50, 64, Color.BLUE);
				drawStick(g, 65, 64, myGreen);
				break;
			case 8:
				drawStick(g, 28, 14, myGreen);
				drawStick(g, 72, 14, myGreen);
				drawStick(g, 28, 64, Color.BLUE);
				drawStick(g, 72, 64, Color.BLUE);
				
				Graphics2D g2 = (Graphics2D) g;
				g2.rotate(Math.PI/3.9, 50, 40);
				drawStick(g, 66, 39, Color.BLUE);
				drawStick(g, 34, 39, myGreen);
				
				g2.rotate(-Math.PI/2, 50, 40);
				drawStick(g, 66, 39, Color.BLUE);
				drawStick(g, 34, 39, myGreen);
				break;
			case 9:
				drawStick(g, 32, 14, Color.RED);
				drawStick(g, 50, 14, Color.BLUE);
				drawStick(g, 68, 14, myGreen);
				
				drawStick(g, 32, 39, Color.RED);
				drawStick(g, 50, 39, Color.BLUE);
				drawStick(g, 68, 39, myGreen);
			
				drawStick(g, 32, 64, Color.RED);
				drawStick(g, 50, 64, Color.BLUE);
				drawStick(g, 68, 64, myGreen);
				break;
		}
	}
	
	private void drawStick(Graphics g, int centerX, int centerY, Color color)
	{
		g.setColor(color);
		int x = centerX - 5;
		int y = centerY - 10;
		
		g.fillRoundRect(x, y, 10, 4, 2, 2);		
		g.fillRoundRect(x, y+10, 10, 4, 2, 2);
		g.fillRoundRect(x, y+20, 10, 4, 2, 2);
		
		g.fillRect(x+2, y, 6, 24);	//column
		
		g.setColor(Color.WHITE);
		g.drawLine(x+6, y+4, x+6, y+9);		//white lines
		g.drawLine(x+6, y+14, x+6, y+19);
	}

	public static void main(String[] args)
	{
		JFrame	frame = new JFrame();
	
		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Bamboo Tiles");
	
		frame.add(new BambooTile(2));
		frame.add(new BambooTile(3));
		frame.add(new BambooTile(4));
		frame.add(new BambooTile(5));
		frame.add(new BambooTile(6));
		frame.add(new BambooTile(7));
		frame.add(new BambooTile(8));
		frame.add(new BambooTile(9));
	
		frame.pack();
		frame.setVisible(true);
	}
}























