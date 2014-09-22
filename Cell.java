public interface Cell
{
    public boolean canBeLeftNow();
    public boolean isRetaining();
    public boolean isBusy();

    public int handleMove(int diceThrow);
    public int getIndex();
    
    public Player getPlayer();

    public void welcome(Player player);
}