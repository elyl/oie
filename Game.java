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

	this.board.resetBoard();
	p1 = new Player("Roger");
	p2 = new Player("Raymond");
	p1.setCell(this.board.getCell(0));
	p2.setCell(this.board.getCell(0));
    }

    public void playTurn(Player p)
    {
	
    }

    public int throwDie()
    {
	return ((int)(Math.random() * 100) % 6 + 1 + (int)(Math.random() * 100) % 6 + 1);
    }

    public static void main(String args[])
    {
	Game g;

	g = new Game();
	g.startNewGame();
    }
}