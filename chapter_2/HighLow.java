package Game;

import java.util.Scanner;

/**
 * This is the game of HighLow
 * Program starts with an instruction of the game.
 * After user plays several games. User average score is shown to the user
 */


public class HighLow{
    Scanner keyboard = Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Game will start with showing user one card");
        System.out.println("User should guess whether next card will be higher or lower than current card");
        System.out.println("If user guess is correct then drawn card becomes new current card and user continue guessing");
        System.out.println("If user guesses incorrect then game is over");
        System.out.println("For every correct guess player gets one point");

        //CUrrent score of the current game
        int currentScore = 0;

        //Total score after game is finished.
        int totalScore = 0;

        // Does player want to play again
        boolean playAgain = true;

        // Number of games played by the player
        int gamesPlayed = 0

        // Average score in one game
        double avgScore = 0.0;


        // Play a game till player guess wrong card
        do{
            int scoreThisGame = 0;
            scoreThisGame = play();
            totalScore += scoreThisGame;
            gamesPlayed++;
            System.out.println("Want to play again?");
            playAgain = keyboard.nextBoolean();
        }while(playAgain);

        avgScore = (double)totalScore / gamesPlayed;

    }
}