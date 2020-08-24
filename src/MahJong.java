import java.awt.*;
import javax.swing.*;

public class MahJong extends JFrame{
	
	public MahJong ()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(new MahJongBoard());
		
		setSize(1000, 750);
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new MahJong();
	}
}















