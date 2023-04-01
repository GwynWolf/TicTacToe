package academy.devonline.tictactoe.component;

import academy.devonline.tictactoe.model.Cell;

/**
 * @author GwynWolf
 */
public class CellNumberConverter {
    private char[][] mapping = {
            {'7', '8', '9'},
            {'4', '5', '6'},
            {'1', '2', '3'}
    };

    public Cell charToCell(char number) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (number == mapping[i][j])
                    return new Cell(i, j);
            }
        }
        return null;
    }

    public char cellToChar(Cell cell) {
        return mapping[cell.getColumn()][cell.getRow()];
    }
}
