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
	int	trapCells[] = {31, 52};
	int	gooseCells[] = {9, 18, 27, 36, 45, 54};
	int	waitCells[] = {19};
	int	teleportCells[] = {6, 42, 58};
	int	teleportCellsDestinations[] = {12, 30, 1};

	resetBoard(trapCells, gooseCells, waitCells, teleportCells, teleportCellsDestinations);
    }

    public void resetBoard(int trapCells[], int gooseCells[], int waitCells[], int teleportCells[], int teleportCellsDestinations[])
    {
	int	i;
	
	i = 1;
	while (i < this.boardSize)
	    {
		this.board[i] = new NormalCell(i);
		i++;
	    }
	setTrapCells(trapCells);
	setGooseCells(gooseCells);
	setWaitCells(waitCells);
	setTeleportCells(teleportCells, teleportCellsDestinations);
    }

    private void setTeleportCells(int cells[], int destinations[])
    {
	int	i;

	i = 0;
	while (i < cells.length)
	    {
		this.board[cells[i]] = new TeleportCell(cells[i], destinations[i]);
		i++;
	    }
    }

    private void setGooseCells(int cells[])
    {
	for (int c : cells)
	    this.board[c] = new GooseCell(c);
    }

    private void setWaitCells(int cells[])
    {
	for (int c : cells)
	    this.board[c] = new WaitCell(c);
    }

    private void setTrapCells(int cells[])
    {
	for (int c : cells)
	    this.board[c] = new TrapCell(c);
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