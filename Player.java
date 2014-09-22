public class Player
{
    String	name;
    Cell	cell;

    public Player(String name)
    {
	this.name = name;
	this.cell = null;
    }

    public void setCell(Cell newCell)
    {
	this.cell = newCell;
    }

    public String toString()
    {
	return (this.name);
    }
}