public class TrapCell extends AbstractCell
{
    public TrapCell(int index)
    {
	super(index);
    }

    public boolean canBeLeftNow()
    {
	return (false);
    }

    public boolean isRetaining()
    {
	return (true);
    }

    public int handleMove(int diceThrow)
    {
	return (index);
    }

    public String toString()
    {
	return ("Trap cell " + index + " can't move until free'd");
    }
}