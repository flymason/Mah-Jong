import java.util.*;

public class RandomTileDeck {

	private ArrayList<Tile> deck;
	
	public RandomTileDeck()
	{
		deck = new ArrayList();
		int gameNumber = 144;
		Random rand = new Random(gameNumber);
		
		for(int i = 0; i < 4; i ++)
		{
			deck.add(new CharacterTile('1'));
			deck.add(new CharacterTile('2'));
			deck.add(new CharacterTile('3'));
			deck.add(new CharacterTile('4'));
			deck.add(new CharacterTile('5'));
			deck.add(new CharacterTile('6'));
			deck.add(new CharacterTile('7'));
			deck.add(new CharacterTile('8'));
			deck.add(new CharacterTile('9'));
			deck.add(new CharacterTile('N'));
			deck.add(new CharacterTile('E'));
			deck.add(new CharacterTile('S'));
			deck.add(new CharacterTile('W'));
			deck.add(new CharacterTile('C'));
			deck.add(new CharacterTile('F'));
			deck.add(new CircleTile(1));
			deck.add(new CircleTile(2));
			deck.add(new CircleTile(3));
			deck.add(new CircleTile(4));
			deck.add(new CircleTile(5));
			deck.add(new CircleTile(6));
			deck.add(new CircleTile(7));
			deck.add(new CircleTile(8));
			deck.add(new CircleTile(9));
			deck.add(new BambooTile(2));
			deck.add(new BambooTile(3));
			deck.add(new BambooTile(4));
			deck.add(new BambooTile(5));
			deck.add(new BambooTile(6));
			deck.add(new BambooTile(7));
			deck.add(new BambooTile(8));
			deck.add(new BambooTile(9));
			deck.add(new WhiteDragonTile());
			deck.add(new Bamboo1Tile());
		}
		
		deck.add(new FlowerTile("Chrysanthemum"));
		deck.add(new FlowerTile("Orchid"));
		deck.add(new FlowerTile("Plum"));
		deck.add(new FlowerTile("Bamboo"));
		deck.add(new SeasonTile("Spring"));
		deck.add(new SeasonTile("Summer"));
		deck.add(new SeasonTile("Fall"));
		deck.add(new SeasonTile("Winter"));
			
		Collections.shuffle(deck, rand);
	}
	
	public Tile deal()
	{
		Tile t = deck.get(0);
		deck.remove(0);
		return t;
	}	
	
	
	public static void main(String[] args)
	{
		new RandomTileDeck();
	}
}
