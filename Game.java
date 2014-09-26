public class Game
{
    private Board board;

    public Game()
    {
	this.board = new Board();
    }

    public void startNewGame()
    {
	Player	p1;
	Player	p2;
	int	i;

	i = 0;
	this.board.resetBoard();
	p1 = new Player("Roger");
	p2 = new Player("Raymond");
	this.addPlayer(p1);
	this.addPlayer(p2);
	while (i++ < 10)
	    playTurn(p1, throwDie() + throwDie());
    }

    public void playTurn(Player p, int diceThrow)
    {
	int	index;

	p.setWaitTurns(p.getWaitTurns() - 1);
	if (p.getCell().canBeLeftNow())
	    {
		index = p.getCell().getIndex() + diceThrow;
		index = (index >= this.board.getBoardSize()) ? this.board.getBoardSize() - (diceThrow % this.board.getBoardSize()): index;
		index = this.board.getCell(index).handleMove(diceThrow);
		this.board.getCell(index).welcome(p);
		System.out.println("dicethrow: " + diceThrow + ";index: " + index);
	    }
	else
	    System.out.println(p.getName() + " can't move this turn");
    }

    public void addPlayer(Player p)
    {
	p.setCell(this.board.getCell(0));
	this.board.getCell(0).welcome(p);
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