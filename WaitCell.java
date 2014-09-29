public class WaitCell extends AbstractCell
{
    private final int	nbTurns;

    public WaitCell(int index)
    {
	super(index);
	this.nbTurns = 2;
    }

    public boolean canBeLeftNow()
    {
	return (player.getWaitTurns() <= 0);
    }

    public boolean isRetaining()
    {
	return (true);
    }

    public int handleMove(int diceThrow)
    {
	return (index);
    }    

    public void welcome(Player p)
    {
	p.setWaitTurns(this.nbTurns);
	super.welcome(p);
    }

    public String toString()
    {
	return ("wait cell " + index + ", blocked for " + player.getWaitTurns() + " turns");
    }
}