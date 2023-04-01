package academy.devonline.tictactoe.component.keypad;

import academy.devonline.tictactoe.model.Cell;

/**
 * @author GwynWolf
 */
public class TerminalNumericKeypadCellNumberConverter implements CellNumberConverter {

    @Override
    public Cell charToCell(char number) {
        final int val = number - '0' - 1;
        return new Cell(val / 3, val % 3);
    }

    @Override
    public char cellToChar(Cell cell) {
        return (char) ('0' + ((cell.getColumn() * 3) + cell.getRow() + 1));
    }
}
