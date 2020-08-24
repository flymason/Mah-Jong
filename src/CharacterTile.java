import java.awt.*;
import java.util.*;
import javax.swing.*;

public class CharacterTile extends Tile
{
	protected char symbol;
	private	HashMap<Character, String>	characters = new HashMap<>();
	
	
	public CharacterTile(char symbol)		//constructor
	{
		this.symbol = symbol;
		
		characters.put('1', Character.toString('\u4E00'));
		characters.put('2', Character.toString('\u4E8C'));
		characters.put('3', Character.toString('\u4E09'));
		characters.put('4', Character.toString('\u56DB'));
		characters.put('5', Character.toString('\u4E94'));
		characters.put('6', Character.toString('\u516D'));
		characters.put('7', Character.toString('\u4E03'));
		characters.put('8', Character.toString('\u516B'));
		characters.put('9', Character.toString('\u4E5D'));
		characters.put('N', Character.toString('\u5317'));
		characters.put('E', Character.toString('\u6771'));
		characters.put('W', Character.toString('\u897F'));
		characters.put('S', Character.toString('\u5357'));
		characters.put('C', Character.toString('\u4E2D'));
		characters.put('F', Character.toString('\u767C'));
		characters.put('w', Character.toString('\u842C'));
		
		setToolTipText(toString());
	}
	
	public boolean matches(Tile other)
	{
		if(!super.matches(other))
			return false;
		CharacterTile otherObject = (CharacterTile) other;
		return symbol == otherObject.symbol;
	}
	
	public String toString()
	{
		if (symbol >= '0' && symbol <= '9')
			return "Character " + symbol;
		else
		{
			switch(symbol)
			{
				case 'N':
					return "North Wind";
				case 'E':
					return "East Wind";
				case 'W':
					return "West Wind";
				case 'S':
					return "South Wind";
				case 'C':
					return "Red Dragon";
				case 'F':
					return "Green Dragon";
				default:
					return "";
			}
		}
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		String englChar = Character.toString(symbol);
		
		Font	f = g.getFont().deriveFont(14F);
		g.setFont(f);
	
		g.setColor(Color.RED);
		g.drawString(englChar, 65, 17);
		
		String chineseChar = characters.get(symbol);
		
		if (symbol >= '0' && symbol <= '9')	//Number tiles
		{
			f = g.getFont().deriveFont(25F);
			g.setFont(f);
		
			FontMetrics		fm = g.getFontMetrics();
			int 			wid = fm.stringWidth(chineseChar);
			g.setColor(Color.BLACK);
			g.drawString(chineseChar, (getWidth() - wid )/2 + 10, 30);
			
			String wan = characters.get('w');
			
			f = g.getFont().deriveFont(25F);
			g.setFont(f);
		
			fm = g.getFontMetrics();
			wid = fm.stringWidth(wan);
			g.setColor(Color.RED);
			g.drawString(wan, (getWidth() - wid )/2 + 10, 65);
		}
		else	//Red and Green dragon tiles
		{
			f = g.getFont().deriveFont(50F);
			g.setFont(f);
		
			FontMetrics fm = g.getFontMetrics();
			int			wid = fm.stringWidth(chineseChar);
			g.setColor(Color.BLACK);
			if(symbol == 'C')
				g.setColor(Color.RED);
			if(symbol == 'F')
				g.setColor(Color.decode("#00CD00"));	//Green
			g.drawString(chineseChar, (getWidth() - wid )/2 + 10, 60);
		}
	}
	
	
	public static void main(String[] args)
	{
		JFrame		frame = new JFrame();
		JPanel		tiles = new JPanel();
		JScrollPane	scroller = new JScrollPane(tiles);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Character Tiles");
		frame.add(scroller);

		// Try something like this if your tiles don't fit on the screen.
		// Replace "tile width" and "tile height" with your values.
		//scroller.setPreferredSize(new Dimension(8 * 80, 40 + 100));

		tiles.add(new CharacterTile('1'));
		tiles.add(new CharacterTile('2'));
		tiles.add(new CharacterTile('3'));
		tiles.add(new CharacterTile('4'));
		tiles.add(new CharacterTile('5'));
		tiles.add(new CharacterTile('6'));
		tiles.add(new CharacterTile('7'));
		tiles.add(new CharacterTile('8'));
		tiles.add(new CharacterTile('9'));
		tiles.add(new CharacterTile('N'));
		tiles.add(new CharacterTile('E'));
		tiles.add(new CharacterTile('W'));
		tiles.add(new CharacterTile('S'));
		tiles.add(new CharacterTile('C'));
		tiles.add(new CharacterTile('F'));

		frame.pack();
		frame.setVisible(true);
	}
}



























