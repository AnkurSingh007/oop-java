package Game;

import java.util.Scanner;

import javax.smartcardio.Card;

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
        
        private static int play(){
        	// Get a new deck of cards
        	Deck deck = new Deck();
        	
        	// Current card that user can see
        	Card currentCard; 
        	
        	// User tries to predict next card from the deck
        	Card nextCard;
        	
        	// Number of times user guess correct
        	// User guesses whether next card is higher or lower than current card
        	int correctGuesses;
        	
        	// User input for high or low for next card
        	// 'H' for high and 'L' for low
        	char guess;
        	
        	// Shuffle the cards present in the deck 
        	// Random shuffling
        	deck.shuffle();
        	
        	correctGuesses = 0;
        	currentCard = deck.dealCard();
        	System.out.println("The first card is " + currentCard.toString());
        	
        	// Game continues till user predicts wrong
        	while(true){
        		// Prompt user for next input
        		System.out.println("Will the next card be higher(H) card or lower(L) card?");
        		do{
        			// Get 'H' or 'L'
        			guess = keyboard.next().charAt(0);
        			guess = Character.toUpperCase(guess);
        			
        			// User enter wrong character 
        			if(guess != 'H' or guess != 'L')
        				System.out.println("Please enter H or L for high or low respectively");
        		}while(guess != 'H' && guess != 'L');
        		
        		/* Get the next card and show to the user */
        		nextCard = deck.dealCard();
        		System.out.println("The next card is " + nextCard);
        		
        		/* Check the user's prediction */
        		
        		if(nextCard.getValue() == currentCard.getValue()){
        			System.out.println("Current Card has same value as next Card");
        			System.out.println("You loose on ties!");
        			break; // End the game
        		}
        		else if(nextCard.getValue() >  currentCard.getValue()){
        			if(guess == 'H'){
        				System.out.println('Your prediction is correct.');
        				correctGuesses++; // Increment the score
        			}
        			else{
        				Sysetem.out.println("Your prediction was wrong");
        				break; // End of the game
        			}
        		}
        		else{
        			if(guess == 'L'){
        				System.out.println("Your prediction is correct");
        				correctGuesses++;
        				// Win the game
        			}
        			else{
        				System.out.println("Your prediction is incorrect");
        				break;
        				// End of the game
        			}
        		}
        		
        		System.out.println("The game is over");
        		System.out.println("You made " + correctGuesses + " correct predictions");
        		System.out.println();
        		return correctGuesses;
        	}
        }
    }
}