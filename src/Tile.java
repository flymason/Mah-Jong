import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

abstract public class Tile extends JPanel
{
	private boolean visible;
	
	public Tile()
	{
		setSize(new Dimension(80, 100));
		setPreferredSize(new Dimension(80, 100));
		setOpaque(false);
		setVisible(true);
		
		repaint();
	}
	
	public boolean isVisible()
	{
		return visible;
	}
	public void setVisible(boolean v)
	{
		visible = v;
	}
	
	public boolean matches(Tile other)
	{
		if (this == other)
			return true;
		if (other == null)
			return false;
		if (getClass() != other.getClass())
			return false;
		else
			return true;
	}
	public void draw()
	{
	//	Graphics g = new Graphics();
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		
		Color top1 = Color.decode("#FFFACD"); 
		Color top2 = Color.decode("#EEDC82");
		Color side1 = Color.decode("#9E9257");
		Color side2 = Color.decode("#D1C16F");
		Color side3 = Color.decode("#008B00");
		Color side4 = Color.decode("#014501");
		
		g.drawRect(20, 0, 59, 79);
		
		Graphics2D	g2 = (Graphics2D)g;
		
		GradientPaint	grad = new GradientPaint(50, 0, top1,
				50, 80, top2);
		g2.setPaint(grad);
		g.fillRect(21, 1, 58, 78);		// top of tile

		GradientPaint	grad0 =	new GradientPaint(15, 5, side1,
						15, 85, side2);
		Polygon		p0 = new Polygon();	// left side top level
		p0.addPoint(20, 0);
		p0.addPoint(10, 10);
		p0.addPoint(10, 89);
		p0.addPoint(20, 79);
		g2.setPaint(grad0);
		g2.fill(p0);
		
		GradientPaint	grad1 =	new GradientPaint(5, 10, side4,
				5, 95, side3);
		Polygon		p1 = new Polygon();		//left side bottom level
		p1.addPoint(10, 10);
		p1.addPoint(0, 20);
		p1.addPoint(0, 99);
		p1.addPoint(10, 89);
		g2.setPaint(grad1);
		g2.fill(p1);
		
		GradientPaint	grad2 =	new GradientPaint(15, 85, side2,
				75, 85, side1);
		Polygon		p2 = new Polygon();			//front top level
		p2.addPoint(10, 89);
		p2.addPoint(20, 79);
		p2.addPoint(80, 79);
		p2.addPoint(70, 89);
		g2.setPaint(grad2);
		g2.fill(p2);

		GradientPaint	grad3 =	new GradientPaint(5, 95, side3,
		65, 95, side4);
		Polygon		p3 = new Polygon();			//front bottom level
		p3.addPoint(10, 89);
		p3.addPoint(0, 99);
		p3.addPoint(60, 99);
		p3.addPoint(70, 89);
		g2.setPaint(grad3);
		g2.fill(p3);
		g2.setColor(Color.BLACK);
		
		g2.draw(p0);		//draw outlines
		g2.draw(p1);
		g2.draw(p2);
		g2.draw(p3);
	}
	
	public static void main(String[] args)
	{
		JFrame	frame = new JFrame();

		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Tile");

		frame.add(new Tile());

		frame.pack();
		frame.setVisible(true);
	}
}
