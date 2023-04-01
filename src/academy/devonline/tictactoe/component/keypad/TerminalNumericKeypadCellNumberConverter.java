package academy.devonline.tictactoe.component.keypad;

import academy.devonline.tictactoe.model.Cell;

/**
 * @author GwynWolf
 */
public class TerminalNumericKeypadCellNumberConverter implements CellNumberConverter {
    private final char[][] mapping = {
            {'1', '2', '3'},
            {'4', '5', '6'},
            {'7', '8', '9'}
    };

    @Override
    public Cell charToCell(char number) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (number == mapping[i][j])
                    return new Cell(i, j);
            }
        }
        return null;
    }

    @Override
    public char cellToChar(Cell cell) {
        return mapping[cell.getColumn()][cell.getRow()];
    }
}
