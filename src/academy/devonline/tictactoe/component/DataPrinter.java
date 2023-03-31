package academy.devonline.tictactoe.component;

import academy.devonline.tictactoe.model.Cell;
import academy.devonline.tictactoe.model.GameTable;

/**
 * @author GwynWolf
 */
/*
* -------------
| 7 | 8 | 9 |
-------------
| 4 | 5 | 6 |
-------------
| 1 | 2 | 3 |
-------------*/
public class DataPrinter {
    public void printMappingTable() {
        System.out.println("""
                -------------
                | 7 | 8 | 9 |
                -------------
                | 4 | 5 | 6 |
                -------------
                | 1 | 2 | 3 |
                -------------""");
    }

    public void printGameTable(final GameTable gameTable) {
        StringBuffer result = new StringBuffer("-------------\n");
        for (int i = 0; i < 3; i++) {
            result.append("|");
            for (int j = 0; j < 3; j++) {
                result.append(gameTable.getSign(new Cell(i, j)));
                if (j == 2)
                    result.append("|\n");
                else
                    result.append("|");
            }
            result.append("-------------\n");
        }
        System.out.println(result);
    }
}
