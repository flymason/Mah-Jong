import java.awt.*;
import javax.swing.*;

public class MahJongTest extends JFrame{
	
	public MahJongTest ()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(new MahJongBoard());
		
		setSize(1000, 750);
		setVisible(true);
	}
	
	public class TestPanel extends JPanel
	{
		public TestPanel()
		{
			setLayout(null);
			
			Tile t;
			t = new SeasonTile("Spring");
			t.setLocation(180, 120);
			add(t);
			
			
			
			t = new SeasonTile("Fall");
			t.setLocation(160, 140);
			add(t);
			
			t = new SeasonTile("Winter");
			t.setLocation(140, 160);
			add(t);
			t = new SeasonTile("Summer");
			t.setLocation(200, 160);
			add(t);
		}	
	}
	
	public static void main(String[] args)
	{
		new MahJongTest();
	}
}















