/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author Muskan
 */
public enum Suit {// make the suit class an enum
    CLUBS("Clubs"),
    SPADES("Spades"),
    DIAMONDS("Diamonds"),
    HEARTS("Hearts");
    
    
    private final String cardValue;
     
    
     public String getCardValue() {
        return cardValue;
    }
     
    private Suit(String cardValue) {
        this.cardValue = cardValue;
    }
    
   
}
