public class NormalCell extends AbstractCell
{
    public NormalCell(int index)
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
	return (index);
    }    
}