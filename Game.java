/**
 * Project 2.5.11
 *
 * Game Class for the Game of Nim
*/
public class Game
{
    private int numberOfPaperclips = 0;
    private Player player;
    private Bot bot;
    private String currentPlayer = "player";

    public Game() {
        numberOfPaperclips = (int)(Math.random() * 41) + 10;
        player = new Player();
        bot = new Bot();
    }

    // Play the game
    public void play() {
        System.out.println("_________________________");
        System.out.println("Welcome to Game of Nim");
        System.out.println("_________________________");
        System.out.println("Instructions:");
        System.out.println("When it is your turn, you must take between 1 paperclip to 50% of the paperclips.");
        System.out.println("The player who takes the last paperclip loses.");
        System.out.println("There are " + numberOfPaperclips + " paperclips. (Randomly generated 1-50 inclusive)");
        System.out.println("_________________________");

        // Randomly choose who goes first
        currentPlayer = (int)(Math.random() * 2) == 0 ? "player" : "bot";

        // Continue playing until there are no more paperclips
        while (numberOfPaperclips > 0) {
            System.out.println("Game Status:");
            System.out.println("There are " + numberOfPaperclips + " paperclips.");
            System.out.println("_________________________");
            if (currentPlayer.equals("player")) {
                System.out.println("Play by " + player.getName() + ":");
                numberOfPaperclips -= player.askForPaperclipsToTake(numberOfPaperclips);
                currentPlayer = "bot";
            } else {
                System.out.println("Play by bot:");
                numberOfPaperclips -= bot.askForPaperclipsToTake(numberOfPaperclips);
                currentPlayer = "player";
            }

            System.out.println("_________________________");
        }


        // Print the winner
        if (currentPlayer.equals("player")) {
            System.out.println("Game Over:");
            System.out.println("\u001B[32m" + "You won " + player.getName() + "!" + "\u001B[0m");
        } else {
            System.out.println("Game Over:");
            System.out.println("\u001B[31m" + "The bot won!" + "\u001B[0m");
        }
    }
}