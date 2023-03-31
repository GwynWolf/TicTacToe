package academy.devonline.tictactoe.model;

/**
 * @author GwynWolf
 */
public class GameTable {
    private final char[][] table = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}};

    public boolean isEmpty(final Cell cell) {
        return table[cell.getRow()][cell.getColumn()] == ' ';
    }

    public char getSign(final Cell cell) {
        return table[cell.getRow()][cell.getColumn()];
    }

    public void setSign(final char sign, Cell cell) {
        table[cell.getRow()][cell.getColumn()] = sign;
    }
}
