/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author Muskan
 */
public class FishCard extends Card {

        public FishCard(String suit, int value) {
        setSuit(suit);
        setValue(value);
    }

    @Override
    public String toString() {//overide toString method
        return getSuit() + "  " + getValue();
    }
     
}
