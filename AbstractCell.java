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

    public void welcome(Player player)
    {
	this.player = player;
    }
}