package academy.devonline.tictactoe.component.keypad;

import academy.devonline.tictactoe.model.Cell;

/**
 * @author GwynWolf
 */
public class DesktopNumericKeypadCellNumberConverter implements CellNumberConverter {
    private final char[][] mapping = {
            {'7', '8', '9'},
            {'4', '5', '6'},
            {'1', '2', '3'}
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
