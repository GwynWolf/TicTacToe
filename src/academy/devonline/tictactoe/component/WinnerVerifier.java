package academy.devonline.tictactoe.component;

import academy.devonline.tictactoe.model.Cell;
import academy.devonline.tictactoe.model.GameTable;

/**
 * @author GwynWolf
 */
public class WinnerVerifier {
    public boolean isUserWin(final GameTable gameTable) {
        return isWinner('X', gameTable);
    }

    public boolean isComputerWin(final GameTable gameTable) {
        return isWinner('O', gameTable);
    }

    private boolean isWinner(final char sign, final GameTable gameTable) {
        if (findColumn(sign, gameTable) || findRow(sign, gameTable) || findCrross(sign, gameTable))
            return true;
        return false;
    }


    private boolean findCrross(final char sign, final GameTable gameTable) {
        if (gameTable.getSign(new Cell(0, 0)) == sign)
            if (gameTable.getSign(new Cell(1, 1)) == sign)
                if (gameTable.getSign(new Cell(2, 2)) == sign)
                    return true;
        if (gameTable.getSign(new Cell(0, 2)) == sign)
            if (gameTable.getSign(new Cell(1, 1)) == sign)
                if (gameTable.getSign(new Cell(2, 0)) == sign)
                    return true;
        return false;
    }

    private boolean findColumn(char sign, GameTable gameTable) {
        for (int i = 0; i < 3; i++) {
            if (gameTable.getSign(new Cell(i, 0)) == sign)
                if (gameTable.getSign(new Cell(i, 1)) == sign)
                    if (gameTable.getSign(new Cell(i, 2)) == sign)
                        return true;
        }
        return false;
    }

    private boolean findRow(char sign, GameTable gameTable) {
        for (int i = 0; i < 3; i++) {
            if (gameTable.getSign(new Cell(0, i)) == sign)
                if (gameTable.getSign(new Cell(1, i)) == sign)
                    if (gameTable.getSign(new Cell(2, i)) == sign)
                        return true;
        }
        return false;
    }


}
