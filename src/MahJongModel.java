
public class MahJongModel {

	private Tile[][][] TileBoard;
	
	public MahJongModel()
	{
		TileBoard = new Tile[15][8][5];
		RandomTileDeck deck = new RandomTileDeck();
		
		for(int i = 1; i <13; i++)					//level 4 - Bottom layer
		{
			TileBoard[i][0][4] = deck.deal();
			TileBoard[i][3][4] = deck.deal();
			TileBoard[i][4][4] = deck.deal();
			TileBoard[i][7][4] = deck.deal();	
		}
		for(int i = 2; i < 12; i++)
		{
			TileBoard[i][2][4] = deck.deal();
			TileBoard[i][5][4] = deck.deal();	
		}
		for(int i = 3; i < 11; i++)
		{
			TileBoard[i][1][4] = deck.deal();
			TileBoard[i][6][4] = deck.deal();	
		}
		for(int i = 4; i < 10; i++)					//level 3
		{
			for(int j = 1; j < 7; j++)
			{
				TileBoard[i][j][3] = deck.deal();
			}
		}
		for(int i = 5; i < 9; i++)					//level 2
		{
			for(int j = 2; j < 6; j++)
			{
				TileBoard[i][j][2] = deck.deal();
			}
		}
		for(int i = 6; i < 8; i++)					//level 1
		{
			for(int j = 3; j < 5; j++)
			{
				TileBoard[i][j][1] = deck.deal();
			}
		}
		TileBoard[6][3][0] = deck.deal();				//level 0 - top layer
		TileBoard[7][3][0] = TileBoard[6][3][0];		//represent top tile in four places
		TileBoard[6][4][0] = TileBoard[6][3][0];
		TileBoard[7][4][0] = TileBoard[6][3][0];
		
		TileBoard[0][3][4] = deck.deal();				//left-most tile
		TileBoard[0][4][4] = TileBoard[0][3][4];
		
		TileBoard[13][3][4] = deck.deal();				//right-inner tile
		TileBoard[13][4][4] = TileBoard[13][3][4];
		
		TileBoard[14][3][4] = deck.deal();				//right-most tile
		TileBoard[14][4][4] = TileBoard[14][3][4];	
	}
	
	public Tile getTile(int x, int y, int z)
	{
		try{
			return TileBoard[x][y][z];
		} catch(ArrayIndexOutOfBoundsException e) { System.out.println(x + " " + y + " " + z);}
		return null;
	}
	
	public boolean isTileOpen(int x, int y, int z)
	{
		try{
			if(TileBoard[x+1][y][z] != null && TileBoard[x-1][y][z] != null)		//tile to left or right?
			{
				if(TileBoard[x+1][y][z].isVisible() && TileBoard[x-1][y][z].isVisible())
				{
					return false;
				}
			}
		} catch(ArrayIndexOutOfBoundsException e) {}
		try{
			if(TileBoard[x][y][z-1] != null)										//tile above?
			{
				if(TileBoard[x][y][z-1].isVisible())
				{
					return false;
				}
			} 
		} catch(ArrayIndexOutOfBoundsException e) {}
		
		return true;
	}
	
}


















