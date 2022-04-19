/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you
 * might want to subclass this more than once. The group of cards has a maximum
 * size attribute which is flexible for reuse.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 * @modifier Muskan Muskan
 */
public class GroupOfCards {

    //The group of cards, stored in an ArrayList
    private ArrayList<FishCard> cards = new ArrayList();
    private int size;//the size of the grouping

    

    /**
     * A method that will get the group of cards as an ArrayList
     *
     * @return the group of cards.
     */
    public ArrayList<FishCard> getCards() {
        return cards;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return cards.size();
    }
    
    public void setCards(ArrayList<FishCard> cards) {
        this.cards = cards;
    }
      public FishCard getCard(int pointer) {
        return cards.get(pointer);
    }


    public void addCard(FishCard c) {
        cards.add(c);
    }

    public FishCard removeCard(int pointer) {
        return cards.remove(pointer);
    }

    public boolean isEmpty() {
        return cards.isEmpty();
    }

    public void displayCards() {
        for (int i = 0; i < getSize(); i++) {
            System.out.println(getCard(i));
        }
    }

    public boolean removeCard(FishCard c) {
        return cards.remove(c);
    }
}


