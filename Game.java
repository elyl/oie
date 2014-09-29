import java.util.List;
import java.util.ArrayList;

public class Game
{
    private Board		board;
    private List<Player>	playerList;
    private int			nextPlayer;

    public Game()
    {
	this.board = new Board();
	this.playerList = new ArrayList<Player>();
	this.nextPlayer = 0;
    }

    public void startNewGame()
    {
	this.board.resetBoard();
	this.addPlayer(new Player("Roger"));
	this.addPlayer(new Player("Raymond"));
	while (!isGameFinished())
	    playTurn(nextPlayer(), throwDie() + throwDie());
    }

    public void playTurn(Player p, int diceThrow)
    {
	int	index;
	Cell	cell;

	p.setWaitTurns(p.getWaitTurns() - 1);
	if (p.getCell().canBeLeftNow())
	    {
		index = verifyIndex(p.getCell().getIndex() + diceThrow);
		cell = this.board.getCell(verifyIndex(this.board.getCell(index).handleMove(diceThrow)));
		if (cell.isBusy())
		    p.getCell().welcome(cell.getPlayer());
		cell.welcome(p);
		System.out.println("dicethrow: " + diceThrow + "; index: " + index);
	    }
	else
	    System.out.println(p.getName() + " can't move this turn");
    }

    public int verifyIndex(int index)
    {
	return ((index < this.board.getBoardSize()) ? index : index % this.board.getBoardSize());
    }

    public Player nextPlayer()
    {
	if (this.nextPlayer == this.playerList.size())
	    this.nextPlayer = 0;
	return (this.playerList.get(this.nextPlayer++));
    }

    public boolean isGameFinished()
    {
	return (this.board.getCell(this.board.getBoardSize() - 1).getPlayer() != null);
    }

    public void addPlayer(Player p)
    {
	p.setCell(this.board.getCell(0));
	this.board.getCell(0).welcome(p);
	this.playerList.add(p);
    }

    public static int throwDie()
    {
	return ((int)((Math.random() * 10) % 6) + 1);
    }

    public static void main(String args[])
    {
	Game g;

	g = new Game();
	g.startNewGame();
    }
}