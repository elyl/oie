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
	return (index + diceThrow);
    }    
}