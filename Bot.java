/**
 * Project 2.5.11
 *
 * Bot Class for the Game of Nim
*/
public class Bot {
    // Ask the player for number of paperclips to take
    public int askForPaperclipsToTake(int currentPaperclips) {
        System.out.println("The bot is thinking...");

        int maxPaperclipsToTake = (currentPaperclips / 2) == 0 ? 1 : (currentPaperclips / 2);

        int optimalPaperclips = calculateOptimalPaperclips(currentPaperclips);

        int paperclipsToTake = Math.min(optimalPaperclips, maxPaperclipsToTake);

        System.out.println("The bot decided to take " + paperclipsToTake + " paperclips.");

        return paperclipsToTake;
    }

    // Calculate the optimal number of paperclips to take
    private int calculateOptimalPaperclips(int currentPaperclips) {
        int targetMultiple = 0;

        if (currentPaperclips <= 7) {
            targetMultiple = 3;
        } else if (currentPaperclips <= 15) {
            targetMultiple = 7;
        } else if (currentPaperclips <= 31) {
            targetMultiple = 15;
        } else {
            targetMultiple = 31;
        }

        int remainder = currentPaperclips % targetMultiple;
        int optimalPaperclips = remainder == 0 ? targetMultiple : remainder;

        return optimalPaperclips;
    }
}