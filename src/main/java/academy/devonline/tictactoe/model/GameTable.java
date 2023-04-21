package academy.devonline.tictactoe.model;

import java.util.Arrays;

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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GameTable{");
        sb.append("table=");
        for (int i = 0; i < table.length; i++) {
            sb.append(Arrays.toString(table[i]));
            if (i < table.length - 1)
                sb.append(';');
        }
        sb.append('}');
        return sb.toString();
    }

    public char getSign(final Cell cell) {
        return table[cell.getRow()][cell.getColumn()];
    }

    public void setSign(final char sign, Cell cell) {
        table[cell.getRow()][cell.getColumn()] = sign;
    }
}
