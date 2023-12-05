/**
 * Project 2.5.11
 *
 * Player Class for the Game of Nim
*/

import java.util.Scanner;

public class Player
{
    private String name;
    public String getName()
    {
        return name;
    }

    public Player()
    {
        System.out.println("What is your name?");
        Scanner scan = new Scanner(System.in);
        String newName = scan.nextLine();

        name = newName;
    }


    public int askForPaperclipsToTake(int currentPaperclips) {
        System.out.println("How many paperclips would you like to take? (1 paperclip to 50%)");
        int numPaperclips = 0;

        while ((numPaperclips <= 0 || numPaperclips > (int) (currentPaperclips / 2))) {
            try {
                System.out.println("Please enter a valid number of paperclips to take.");
                Scanner scan = new Scanner(System.in);
                numPaperclips = scan.nextInt();

                if (currentPaperclips == 1) {
                    System.out.println("You must take the last paperclipm!!!!");
                    numPaperclips = 1;
                    break;
                }
            } catch (Exception e) {
                continue;
            }
        }

        return numPaperclips;
    }
}