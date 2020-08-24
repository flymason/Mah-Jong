import javax.swing.*;
import java.awt.*;

public class CircleTile extends RankTile
{
	private Color myGreen = Color.decode("#008B00");
	public CircleTile(int rank)
	{
		super(rank);
		setToolTipText(toString());
		
	}
	public String toString()
	{
		return "Circle " + rank;
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		Circle c = new Circle();
		switch(rank)
		{
			case 1:
				c.pancake(g);
				break;
			case 2:
				c.draw(g, 50, 24, myGreen);
				c.draw(g, 50, 56, Color.RED);
				break;
			case 3:
				c.draw(g, 35, 15, Color.BLUE);
				c.draw(g, 50, 40, Color.RED);
				c.draw(g, 64, 64, myGreen);
				break;
			case 4:
				c.draw(g, 36, 24, Color.BLUE);
				c.draw(g, 64, 24, myGreen);
				c.draw(g, 36, 56, myGreen);
				c.draw(g, 64, 56, Color.BLUE);
				break;
			case 5:
				c.draw(g, 35, 15, Color.BLUE);
				c.draw(g, 50, 40, Color.RED);
				c.draw(g, 64, 64, Color.BLUE);
				c.draw(g, 35, 64, myGreen);
				c.draw(g, 64, 15, myGreen);
				break;
			case 6:
				c.draw(g, 35, 15, myGreen);
				c.draw(g, 64, 15, myGreen);
				c.draw(g, 35, 40, Color.RED);
				c.draw(g, 64, 40, Color.RED);
				c.draw(g, 35, 64, Color.RED);
				c.draw(g, 64, 64, Color.RED);
				break;
			case 7:
				c.draw(g, 31, 13, myGreen);
				c.draw(g, 50, 18, myGreen);
				c.draw(g, 68, 25, myGreen);
				
				c.draw(g, 35, 45, Color.RED);
				c.draw(g, 64, 45, Color.RED);
				c.draw(g, 35, 64, Color.RED);
				c.draw(g, 64, 64, Color.RED);
				break;
			case 8:
				c.draw(g, 35, 13, Color.BLUE);
				c.draw(g, 64, 13, Color.BLUE);
				c.draw(g, 35, 31, Color.BLUE);
				c.draw(g, 64, 31, Color.BLUE);
				c.draw(g, 35, 49, Color.BLUE);
				c.draw(g, 64, 49, Color.BLUE);
				c.draw(g, 35, 67, Color.BLUE);
				c.draw(g, 64, 67, Color.BLUE);
				break;
			case 9:
				c.draw(g, 32, 15, myGreen);
				c.draw(g, 50, 15, myGreen);
				c.draw(g, 68, 15, myGreen);
				
				c.draw(g, 32, 40, Color.RED);
				c.draw(g, 50, 40, Color.RED);
				c.draw(g, 68, 40, Color.RED);
				
				c.draw(g, 32, 64, Color.BLUE);
				c.draw(g, 50, 64, Color.BLUE);
				c.draw(g, 68, 64, Color.BLUE);
				break;
		}
	}
	
	public class Circle
	{		
		public void draw(Graphics g, int x, int y, Color color)
		{
			int diameter = 0;
			switch(rank)
			{
				case 2:
					diameter = 30;
					break;
				case 3:
				case 4:
					diameter = 27;
					break;
				case 5:
				case 6:	
					diameter = 22;
					break;
				case 7:
				case 8:
				case 9:
				case 1:
					diameter = 18;
					break;
		}
			g.setColor(color);
			g.fillOval(x-diameter/2, y-diameter/2, diameter, diameter);
			g.setColor(Color.WHITE);
			g.drawLine(x-diameter/4, y-diameter/4, x+diameter/4, y+diameter/4);
			g.drawLine(x+diameter/4, y-diameter/4, x-diameter/4, y+diameter/4);
		}
		
		public void pancake(Graphics g)
		{
			Graphics2D g2 = (Graphics2D) g;
			
			g.setColor(myGreen);
			g.fillOval(23, 13, 54, 54);
			g.setColor(Color.BLACK);
			g.drawOval(23, 13, 54, 54);
			draw(g, 50, 40, Color.RED);
			g.drawOval(41, 31, 18, 18);
			for(int i = 0; i < 12; i++)
			{
				g2.rotate(Math.PI/6, 50, 40);
				g.fillOval(50, 18, 5, 5);
			}
			
		}
	}

	public static void main(String[] args)
	{
		JFrame	frame = new JFrame();

		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Circle Tiles");

		frame.add(new CircleTile(1));
		frame.add(new CircleTile(2));
		frame.add(new CircleTile(3));
		frame.add(new CircleTile(4));
		frame.add(new CircleTile(5));
		frame.add(new CircleTile(6));
		frame.add(new CircleTile(7));
		frame.add(new CircleTile(8));
		frame.add(new CircleTile(9));

		frame.pack();
		frame.setVisible(true);
	}
}
