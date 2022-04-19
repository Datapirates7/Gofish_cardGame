/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author Muskan
 */
class CardDeck extends GroupOfCards{ // Main class CardDeck extend from group of cards

    /**
     * CardDeck() constructor 
     */
   public CardDeck() {// constructor CardDeck 
      super();//reference variable which is used to refer immediate parent class object
        generateDeck();// generate deck of card
        super.shuffle();// shuffle the deck of cards
    }
   
    public void generateDeck() {// method that will generate the deck of cards
        Suit suit = Suit.CLUBS;
        ValueOfCard value = ValueOfCard.ACE;// Value of the card

        for (Suit s : suit.values()) {// for loop to iterate through suit to get the card

            for (ValueOfCard v : value.values()) {// for loop to get the value of the card

                FishCard card = new FishCard(s.getCardValue(), v.getCardValue());
                addCard(card);// add the cards to the deck
            }
        }
    }
    
}
