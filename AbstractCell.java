public abstract class AbstractCell implements Cell
{
    protected int		index;
    protected Player		player;

    public AbstractCell(int index)
    {
	this.index = index;
	this.player = null;
    }

    public boolean isBusy()
    {
	return (this.player != null);
    }

    public int getIndex()
    {
	return (this.index);
    }
    
    public Player getPlayer()
    {
	return (this.player);
    }

    public void movePlayer(Player p)
    {
	this.player = null;
    }

    public void welcome(Player player)
    {
	System.out.print(player + " is on " + player.getCell());
	this.player = player;
	player.setCell(this);
	System.out.println(", moves to " + this.toString());
    }

    public String toString()
    {
	return ("cell " + index);
    }
}