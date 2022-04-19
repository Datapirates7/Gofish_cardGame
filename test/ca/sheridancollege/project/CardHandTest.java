/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ca.sheridancollege.project;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


/**
 *
 * @author Muskan
 */
public class CardHandTest {
    
    public CardHandTest() {
    }


    /**
     * Test of generateCard that are good
     */
    @Test
    public void testgenerateCardsGood() {
        System.out.println("generateCards");
        CardDeck CardDeck = new CardDeck();
        CardHand instance = new CardHand(7);
        instance.generateCards(CardDeck);

    }
    
    /**
     *Test of generateCard that are bad
     */
  
    @Test
    public void testgenerateCardsBad() {
        System.out.println("generateCardsBad");
        CardDeck CardDeck = new CardDeck();
        CardHand instance = new CardHand(6);
        instance.generateCards(CardDeck);

    }
     @Test
    public void testsameCard() {
        System.out.println("sameCard");
        int value = 0;
        CardHand instance = new CardHand(7);
        boolean expResult = false;
        boolean result = instance.sameCard(value);
        assertEquals(expResult, result);

    }


}
