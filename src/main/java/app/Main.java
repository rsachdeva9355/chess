package app;

/**
 * The main class to run the application.
 */
public class Main {

    public static void main(String args[]) {
        // There are only interfaces in the project. So this class just contains imaginary code which eventually should
        // compile, run and able people to enjoy this glorious game.

        /*
          // these won't be factories but guice/spring modules.
          Player deepak = PlayerFactory.get("deepak", Color.WHITE); // first chance, yayy.
          Player raghav = PlayerFactory.get("mrsood", Color.BLACK);

          Board board = BoardFactory.withInitialState();
          BoardPrinter boardPrinter = BoardPrinterFactory.get()

          Game game = GameFactory.new(board, deepak, raghav);

          // all set, let the game begin.
          boardPrinter.print();
          while (!game.hasEnded()) {
              game.makeMove();
              boardPrinter.print();
          }
          Player winner = game.getWinner();
          System.out.println("The winner of the game is: " + winner.getName());
        */

        System.out.println("Sorry for the inconvenience! Try to live with chess.com for now. Sorry for the heartbreak");
    }
}
