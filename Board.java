public class Board
{
    public static final int DEFAULT_BOARDSIZE = 64;

    private final int		boardSize;
    private Cell		board[];

    public Board()
    {
	this(Board.DEFAULT_BOARDSIZE);
    }

    public Board(int boardSize)
    {
	this.boardSize = boardSize;
	this.board = new Cell[boardSize];
	this.board[0] = new StartCell();
    }

    public void resetBoard()
    {
	int	i;
	
	i = 1;
	while (i < this.boardSize)
	    {
		if (i == 2 || i == 11)
		    this.board[i] = new TrapCell(i);
		else if (i == 3 || i == 22)
		    this.board[i] = new TeleportCell(i);
		else if (i == 4 || i == 33)
		    this.board[i] = new GooseCell(i);
		else if (i == 5 || i == 44)
		    this.board[i] = new WaitCell(i);
		else
		    this.board[i] = new NormalCell(i);
		i++;
	    }
    }

    public Cell getCell(int index)
    {
	return (this.board[index]);
    }

    public int getBoardSize()
    {
	return (this.boardSize);
    }
}