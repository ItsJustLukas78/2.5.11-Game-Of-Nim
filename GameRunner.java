/**
 * Project 2.5.11
 *
 * GameRunner Class for the Game of Nim 
*/

import java.util.Scanner;

public class GameRunner
{
  public static void main(String[] args)
  {
    // Create a new game each time the player wants to play again
    while (true) {
      Game nim = new Game();
      nim.play();

      System.out.println("Would you like to play again? (y/n)");

      Scanner scan = new Scanner(System.in);
      String response = scan.nextLine();

      if (response.equals("y")) {
        continue;
      } else {
        System.out.println("Thanks for playing!");
        break;
      }
    }
  }
}