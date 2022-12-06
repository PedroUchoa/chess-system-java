package boardgame;

public class Board {

    private int rown;
    private int columns;
    private Piece[][] pieces;

    public Board(int rown, int columns) {
        this.rown = rown;
        this.columns = columns;
        pieces = new Piece[rown][columns];
    }

    public int getRown() {
        return rown;
    }

    public void setRown(int rown) {
        this.rown = rown;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }
    
    public Piece piece(int row, int column) {
    	return pieces[row][column];
    }
    
    public Piece pice(Position position) {
    	return pieces[position.getRow()][position.getCollumn()];
    }
    
}
