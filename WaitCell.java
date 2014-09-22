public class WaitCell extends AbstractCell
{
    public WaitCell(int index)
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
}