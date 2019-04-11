/**
 * This class represent a card in a suit
 * Card's value is represented by numbers.
 * Card's suit is also represented by numbers
 * Suits are numbered 0 , 1, 2, 3
 * Values are numbered form 1 to 13
 * Ace has value 1
 * Joker can has any value other than above card values
 */
public class Card{
    // Codes for suits
    public static int SPADES = 0;
    public static int HEARTS = 1;
    public static int DIAMONDS = 2;
    public static int CLUBS = 3;

    // Codes for non numeric cards
    public static int ACE = 1;
    public static int JACK = 11;
    public static int QUEEN = 12;
    public static int KING = 13;

    /**
     * This value has to be provided in the constructor
     * Accessor type is final because card suit can not be changed after it is created
     */
     private int final suit;

    /**
     * This value has to be provided in the constructor
     * Accessor type is final because card suit can not be changed after it is created
     */

    private int final value;

    /**
     *
     * @param theValue value of the card . For regular card value must be in between 1 to 13.
     *  value less than this and greater than this are illigal values.
     *  for joker values can be anything
     *  you can use named constants like Card.HEARTS etc.
     * @param theSuit   suit of the card
     *  It must be one of the values from Card.SPADES, Cards.HEARTS, Cards.DIAMONDS, Cards.CLUBS OR Cards.JOKER
     * @throws IllgleArgumentException if ther parameter values are not in permissible range
     */
    public Card(int theValue, int theSuit){
        if(theSuit != SPACES || theSuit != HEARTS || theSuit != DIAMONDS || theSuit != CLUBS || theSuit != JOKER){
            throw new IllegalArgumentException("Illegal Playing cards suit");
        }
        if(theValue < 1  || theValue  > 13){
            throw new IllegalArgumentException("Illegal Playing cards value");
        }
        suit = theSuit;
        value = theValue;
    }

    /**
     * returns the suit of this card
     * @return the suit integer representation from the set {HEARTS, CLUBS, DIAMONDS, SPADES}
     */
    public int getSuit(){
        return suit;
    }

    /**
     * Returns the value fo the card
     * @return the value, which is one of the numbers 1 to 13
     */
    public int getValue(){
        return value;
    }

    /**
     * Returns the name of the suit of the card
     * @return suit value as string .
     * It shold be one of the "HEARTS", "SPADES", "DIAMONDS", "CLUBS"
     */
    public String getSuitAsString(){
        switch(suit){
            case HEARTS:
                return "HEARTS";
                break;
            case DIAMONDS:
                return "DIAMONDS";
                break;
            case SPADES:
                return "SPADES";
                break;
            case CLUBS:
                return "CLUBS";
                break;
        }
    }

    /**
     * Returns the name of the suit of the card
     * @return suit value as string .
     * It shold be number for numerical value. For face cards it should be one of the {"ACE", "QUEEN", "KING", "JACK"}
     */
    public String getValueAsString(){
        switch(value){
            case 1:
                return "ACE";
                break;
            case 2:
                return "2";
                break;
            case 3:
                return "3";
            break;
            case 4:
                return "4";
            break;
            case 5:
                return "5";
            break;
            case 6:
                return "6";
            break;
            case 7:
                return "7";
            break;
            case 8:
                return "8";
            break;
            case 9:
                return "9";
            break;
            case 10:
                return "10";
            break;
            case 11:
                return "JACK";
                break;
            case 12:
                 return "QUEEN";
                 break;
            case 13:
                 return "KING";
                 break;
        }
    }

    /**
     * Cretes a String to represent the card
     * @return a String which represent the card ex. "QUEEN of HEARTS", "10 of DIAMONDS
     */

    public String toString(){
        return getValueAsString() + " of " + getSuitAsString();
    }
}


