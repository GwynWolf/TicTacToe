package academy.devonline.tictactoe.component;

import academy.devonline.tictactoe.model.Cell;
import academy.devonline.tictactoe.model.GameTable;

import java.util.Scanner;

/**
 * @author GwynWolf
 */
public class UserMove {
    private final char[][] mapping = {
            {'7', '8', '9'},
            {'4', '5', '6'},
            {'1', '2', '3'}};

    public void make(final GameTable gameTable) {
        while (true) {
            Cell userCell = getUserInput(gameTable);
            if (!gameTable.isEmpty(userCell))
                System.out.println("Can't make a move, because the cell is not free! Try again!");
            else {
                gameTable.setSign('X', userCell);
                break;
            }
        }

    }

    private Cell getUserInput(final GameTable gameTable) {
        while (true) {
            System.out.println("Please type number between 1 and 9:");
            char ch;
            String userInput;
            Scanner ent = new Scanner(System.in);
            userInput = ent.nextLine();
            if (userInput.length() == 1) {
                ch = userInput.charAt(0);
                if (ch <= '9' && ch >= '1')
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            if (mapping[i][j] == ch)
                                return new Cell(i, j);
                        }
                    }
            }
        }
    }

}