package academy.devonline.tictactoe.component;

import academy.devonline.tictactoe.model.Cell;
import academy.devonline.tictactoe.model.GameTable;

import java.util.Random;

/**
 * @author GwynWolf
 */
public class ComputerMove {
    public void make(final GameTable gameTable) {
        final Random rnd = new Random();
        int randRow = rnd.nextInt(3);
        int randCol = rnd.nextInt(3);
        while (!gameTable.isEmpty(new Cell(randRow, randCol))) {
            randRow = rnd.nextInt(3);
            randCol = rnd.nextInt(3);
        }
        gameTable.setSign('O', new Cell(randRow, randCol));
    }
}
