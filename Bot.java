/**
 * Project 2.5.11
 *
 * Bot Class for the Game of Nim
*/
public class Bot {
    public int askForPaperclipsToTake(int currentPaperclips) {
        System.out.println("The bot is thinking...");

        int maxPaperclipsToTake = currentPaperclips / 2;
        int optimalPaperclips = calculateOptimalPaperclips(currentPaperclips);

        int paperclipsToTake = Math.min(optimalPaperclips, maxPaperclipsToTake);

        System.out.println("The bot took " + paperclipsToTake + " paperclips.");

        return paperclipsToTake;
    }

    private int calculateOptimalPaperclips(int currentPaperclips) {
        int targetMultiple = 3;

        int remainder = currentPaperclips % targetMultiple;
        int optimalPaperclips = (remainder == 0) ? 1 : remainder;

        return optimalPaperclips;
    }
}