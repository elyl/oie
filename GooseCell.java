public class GooseCell extends AbstractCell
{
    public GooseCell(int index)
    {
	super(index);
    }

    public boolean canBeLeftNow()
    {
	return (true);
    }

    public boolean isRetaining()
    {
	return (false);
    }

    public int handleMove(int diceThrow)
    {
	return (index + Game.throwDie() + Game.throwDie());
    }

    public String toString()
    {
	return ("Goose cell " + index + ", can throw the dice a second time");
    }
}