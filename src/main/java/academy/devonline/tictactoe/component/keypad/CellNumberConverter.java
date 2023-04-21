package academy.devonline.tictactoe.component.keypad;

import academy.devonline.tictactoe.model.Cell;

/**
 * @author GwynWolf
 */
public interface CellNumberConverter {
    Cell charToCell(char number);

    char cellToChar(Cell cell);
}
