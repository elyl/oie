public class Player
{
    private String	name;
    private Cell	cell;
    private int		waitTurns;

    public Player(String name)
    {
	this.name = name;
	this.cell = null;
    }

    public void setCell(Cell newCell)
    {
	this.cell = newCell;
    }

    public Cell getCell()
    {
	return (this.cell);
    }

    public void setWaitTurns(int nb)
    {
	this.waitTurns = nb;
    }

    public int getWaitTurns()
    {
	return (this.waitTurns);
    }

    public String getName()
    {
	return (this.name);
    }

    public String toString()
    {
	return (this.name);
    }
}