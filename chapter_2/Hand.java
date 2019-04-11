package Game;
class Hand{
    /**
     * Constructor: creates an empty hand class
     * @precondition none
     * @postcondition Creates an empty hand object
     */
    Hand(){

    }

    /**
     * Remove all the cards from the hand
     * @precondition None
     * @postcondition hand becomes empty
     */
    public void clear(){

    }

    /**
     * @precondition Card should exist in hand
     * @postcondition If card exist in hand then card is removed else do nothing
     */
    public void removeCard(Card c){

    }

    /**
     * Adds one more card to the hand
     * @param c The card to be added
     * @precondition c is non null
     * @postcondition If c is non null then add the card to the hand
     * @throws NullpointerException is thrown if c is null
     */
    public void addCard(Card c){

    }

    /**
     * Remove card from the hand in given position
     * @param c position of the card to remove from the hand
     *  position starts from 0
     * @precondition position is valid and hand has more number of cards then position
     * @postcondition card from given position is removed. There is one less card in the hand.
     * @throws illigalArgumentException if position does not exist in the card.
     */
    public void removeCard(int position){

    }

    /**
     *
     * @return the number of cards in the hand
     * @precondition Hand should not be null
     * @postcondition state of the hand is unchanged.
     */
    public int getCardCount(){

    }

    /**
     * Return the card present in the given position
     * (Card is not removed from the hand)
     * @param position of the card in the hand.
     * @return Card the card at specified position
     * @throws IlligalArguments if position does not exist.
     * @precondtion: position is valid . Position is (r=0, size of the deck)
     * @postcondition: deck is  unchanged
      * @return
     */
    public Card getCard(int position){

    }

    /**
     * Sort the cards in the hand in suit order and then value order
     * Ace has lowest value i.e. 1
     * @precondition none
     * @postcondition cards are in sorted order according to the suits first then  value
     */
    public void sortBySuit(){

    }

    /**
     * sorts the cards in the hand in increasing value
     * cards with the same value are ordered by suit.
     * Ace has least value 1
     * @precondition Hand should not be empty
     * @postconditoin Cards are grouped by value first . Then by suits.
     */
    public void sortByValue(){

    }
}
