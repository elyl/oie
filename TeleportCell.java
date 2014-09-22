public class TeleportCell extends AbstractCell
{
    private int	teleportationDistance;

    public TeleportCell(int index)
    {
	super(index);
	this.teleportationDistance = 10;
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
	return (index + teleportationDistance);
    }

    public String toString()
    {
	return ("Teleport cell, teleports to " +  index + teleportationDistance);
    }
}