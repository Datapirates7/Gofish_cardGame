/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author Muskan
 */
public enum ValueOfCard {//make the value of card class enum
    ACE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(11),
    QUEEN(12),
    KING(13);

    private final int numberValue; //make the constructor private
    
    public int getCardValue() {//GETTING VALUES FROM THE CARD
        return numberValue;
    }

    private ValueOfCard(int numberValue) {
        this.numberValue = numberValue;
    }

}
