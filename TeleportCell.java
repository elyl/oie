public class TeleportCell extends AbstractCell
{
    private int	destination;

    public TeleportCell(int index, int destination)
    {
	super(index);
	this.destination = destination;
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
	return (destination);
    }

    public String toString()
    {
	return ("Teleport cell, teleports to " +  destination);
    }
}