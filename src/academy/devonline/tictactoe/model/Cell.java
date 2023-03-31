package academy.devonline.tictactoe.model;

/**
 * @author GwynWolf
 */
public class Cell {
    private final int row;
    private final int column;

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public Cell(final int row, final int column) {
        this.row = row;
        this.column = column;
    }
}
