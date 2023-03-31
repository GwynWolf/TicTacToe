package academy.devonline.tictactoe;


import java.util.Random;

/**
 * @author GwynWolf
 */
public class Game {
    private final DataPrinter dataPrinter;
    private final ComputerMove computerMove;

    public Game(final DataPrinter dataPrinter,
                final ComputerMove computerMove,
                final UserMove userMove,
                final WinnerVerifier winnerVerifier,
                final DrawVerifier drawVerifier) {
        this.dataPrinter = dataPrinter;
        this.computerMove = computerMove;
        this.userMove = userMove;
        this.winnerVerifier = winnerVerifier;
        this.drawVerifier = drawVerifier;
    }

    private final UserMove userMove;
    private final WinnerVerifier winnerVerifier;
    private final DrawVerifier drawVerifier;

    public void play() {
        System.out.println("Use the following mapping table to specify a cell using numbers from 1 to 9:");
        dataPrinter.printMappingTable();
        final GameTable gameTable = new GameTable();
        if (new Random().nextBoolean()) {
            computerMove.make(gameTable);
            dataPrinter.printGameTable(gameTable);
        }
        while (true) {
            userMove.make(gameTable);
            dataPrinter.printGameTable(gameTable);
            if (winnerVerifier.isUserWin(gameTable)) {
                System.out.println("YOU WIN!");
                break;
            } else if (drawVerifier.isDraw(gameTable)) {
                System.out.println("Sorry, DRAW!");
                break;

            }
            computerMove.make(gameTable);
            dataPrinter.printGameTable(gameTable);
            if (winnerVerifier.isComputerWin(gameTable)) {
                System.out.println("YOU LOSE!");
                break;
            } else if (drawVerifier.isDraw(gameTable)) {
                System.out.println("Sorry, DRAW!");
                break;
            }
        }
        System.out.println("GAME OVER!");
    }
}
