import java.util.List;
import java.util.LinkedList;

public class StartCell extends AbstractCell
{
    private List<Player>	playerList;

    public StartCell()
    {
	super(0);
	this.playerList = new LinkedList<Player>();
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
	return (0);
    }

    public void welcome(Player p)
    {
	this.playerList.add(p);
    }

    public void movePlayer(Player p)
    {
	this.playerList.remove(p);
    }
}