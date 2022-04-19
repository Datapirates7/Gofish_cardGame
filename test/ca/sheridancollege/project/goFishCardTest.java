/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ca.sheridancollege.project;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Muskan
 */
public class goFishCardTest {
    
    public goFishCardTest() {
    }
    
    @BeforeEach
    public void setUp() {
    }

    /**
     * Test of play method, of class goFishCard.
     */
    @Test
    public void testPlay() {
        System.out.println("play");
        goFishCard instance = null;
        instance.play();
       
    }


 /**
     * Test of generateRandomNumberGood method, of class GoFish.
     */
    @Test
    public void testGenerateRandomNumberGood() {
        System.out.println("generateRandomNumberGood");
        int maxVal = (int) (Math.random() * 13);
        goFishCard instance = new goFishCard("*");
        instance.generateRandomNumber(maxVal);

    }

    /**
     * Test of generateRandomNumberBad method, of class GoFish.
     */
    @Test
    public void testGenerateRandomNumberBad() {
        System.out.println("generateRandomNumberBad");
        int maxVal = (int) (Math.random() * 12);
        goFishCard instance = new goFishCard("*");
        instance.generateRandomNumber(maxVal);

    }
   
    
}
