/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the
 * code should remember to add themselves as a modifier.
 *
 * @author dancye
 * @modifier Muskan Muskan
 */
public abstract class Card {

    private String Suit;
    private int Value;

//getter and setter
    public String getSuit() {
        return Suit;
    }

    public void setSuit(String Suit) {
        this.Suit = Suit;
    }

    public int getValue() {
        return Value;
    }

    public void setValue(int Value) {
        this.Value = Value;
    }

    @Override
    public abstract String toString();

}
