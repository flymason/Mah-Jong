
abstract public class RankTile extends Tile
{
	protected int rank;
	
	public RankTile(int rank)
	{
		this.rank = rank;
	}
	public boolean matches(Tile other)
	{
		if(!super.matches(other))
			return false;
		RankTile otherObject = (RankTile) other;
		return rank == otherObject.rank;
	}
}
