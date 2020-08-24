import java.awt.*;
import javax.swing.*;

public class MahJongBoard extends JPanel{

	private MahJongModel model;
	
	public MahJongBoard()
	{
		setLayout(null);
		int yOffset = 10;
		int xOffset = 0;
		model = new MahJongModel();
		
		Tile t;
		
		t = model.getTile(6, 3, 0);					//right-inner Tile
		t.setLocation((int)(6.5*60 + 80), (int) (yOffset + 3.5*80 - 80));
		add(t);
		
		for(int z = 1; z < 5; z++)
		{
			for(int x = 0; x < 13; x++)
			{
				for(int y = 7; y >= 0; y--)
				{
					if(x == 0 && y == 3 && z == 4)		//for left-most tile
					{
						t = model.getTile(0, 3, z);
						t.setLocation(0, (int) (yOffset + 3.5*80));
						add(t);
						continue;
					}
					try {
						t = model.getTile(x, y, z);
						t.setLocation((x*60)+(z-4)*(-20), yOffset + y*80 +(z-4)*(20));
						add(t);
					} catch(NullPointerException e) {}
				}
			}
		}
			
			t = model.getTile(13, 3, 4);					//right-inner Tile
			t.setLocation(13*60, (int) (yOffset + 3.5*80));
			add(t);
			
			t = model.getTile(14, 3, 4);					//right-most Tile
			t.setLocation(14*60, (int) (yOffset + 3.5*80));
			add(t);
			

	}
}






















