/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author Muskan
 */
public class CardHand extends GroupOfCards {

    private int initialHandSize;// initial number of the cards when game starts

    public CardHand(int size) {// constructor  CardHard
        super();//  reference variable which is used to refer immediate parent class object
        initialHandSize = size;
    }

//it helps to generate card from the deck
    public void generateCards(CardDeck deck) {
        for (int i = 0; i < initialHandSize; i++) {
            drawCards(deck);
        }
    }

//draw the card from the deck
    public void drawCards(CardDeck deck) {
        FishCard temp = deck.getCard(0);
        deck.removeCard(0);
        addCard(temp);

    }

    /**
     *
     * @return the value of the card be checking the card first
     */
    public int checkCards() {
        int value = 0;
        for (int i = 0; i < getSize(); i++) {// for loop to get the value the card
            value = getCard(i).getValue();
            if (increaseCardValue(value) == 4) {
                return value;
            }
        }
        return -1;
    }

    /**
     *
     * the card which already made books remove those card
     */
    public void addCards(int value) {
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < getSize(); i++) {
                if (getCard(i).getValue() == value) {
                    removeCard(getCard(i));
                    break;
                }
            }
        }
    }

    /**
     * (
     *
     * @param value
     * @return this method return whether the card that the player is having
     * have the same value
     */
    public boolean sameCard(int value) {
        for (int i = 0; i < getSize(); i++) {
            if (getCard(i).getValue() == value) {
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @param handAI
     * @param pInputValue this method i used to get the card
     */
    void getCards(CardHand handAI, int pInputValue) {
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < handAI.getSize(); i++) {
                if (handAI.getCard(i).getValue() == pInputValue) {
                    FishCard temp = handAI.getCard(i);
                    addCard(temp);
                    handAI.removeCard(temp);
                    break;
                }
            }
        }
    }

    /**
     *
     * @param value
     * @return it counts the player cards tat are increase
     */
    public int increaseCardValue(int value) {
        int count = 0;
        for (int i = 0; i < getSize(); i++) {
            if (getCard(i).getValue() == value) {
                count++;
            }
        }
        return count;
    }

}
