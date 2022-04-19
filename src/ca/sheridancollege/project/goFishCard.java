/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Muskan
 */
public class goFishCard extends Game {

    int cardPlay = 0;
    private static final int HAND_NUM = 7;
    int cardcom = 0;

    public goFishCard(String Name) {
        super(Name);
    }

    @Override
    public void play() {
        Scanner sc = new Scanner(System.in);
        // Genereate a deck of 52 cards
        CardDeck deck = new CardDeck();

        System.out.println("-----------------------------------------------");
        System.out.println("-----------------------------------------------");
        // It generate 7 cards for the player
        CardHand player = new CardHand(HAND_NUM);
        player.generateCards(deck);

        // It generate 7 cards for the computer
        CardHand com = new CardHand(HAND_NUM);
        com.generateCards(deck);

        boolean keepGaming = true;
        while (keepGaming) { // while loop runs untill we get the one go fish card
            boolean playerTurn = true;
            boolean computerTurn = true;

            // player's turn
            while (playerTurn) {

                System.out.println("Your Turn\n");

                // player's action when a book forms
                if (player.checkCards() > 0) {
                    System.out.println("You have these cards in your player  " + player.checkCards());
                    player.addCards(player.checkCards());
                }

                // if player's empty
                if (player.isEmpty()) {
                    player.drawCards(deck);
                    System.out.println("Your player is empty! Shffule the deck and draw one card!");
                }

                cardPlay++;
                displayBook();
                System.out.println("Now your player is: ");
                player.displayCards();

                //To check the card has same value or different
          
                boolean inputCheckFlag = false;
                int Value = 0;
                while (!inputCheckFlag) {
                    System.out.println("\nPlease enter the value of Card( for example, 1,11,8...*): ");
                    Value = sc.nextInt();
                    if (player.sameCard(Value)) {
                        inputCheckFlag = true;
                    } else {
                        System.out.println("You don't have a card with that value!");
                    }
                }

                if (com.sameCard(Value)) {
                    System.out.println("Your opponent has " + Value);
                    player.getCards(com, Value);
                    if (player.checkCards() > 0) {
                        System.out.println("You have a Book of " + Value);
                        player.addCards(Value);
                        cardPlay++;
                        displayBook();
                        if (cardPlay + cardcom == 13) {
                            break;
                        }
                    }
                    System.out.println("Now your player is: ");
                    player.displayCards();

                    System.out.println("You gain another turn.\n");
                } else {
                    System.out.println("Your oppoent doesn't have the card you asked!");
                    System.out.println("Go Fish!");
                    player.drawCards(deck);
                    if (player.checkCards() > 0) {
                        System.out.println("You have these cards " + player.checkCards());
                        player.addCards(player.checkCards());
                        cardPlay++;
                        displayBook();
                        if (cardPlay + cardcom == 13) {
                            break;
                        }
                    } else {
                        playerTurn = false;
                    }

                }

            }

            if (cardPlay + cardcom == 13) {
                System.out.println("Game Ends!");
                keepGaming = false;
                break;
            }

            System.out.println("Now you have these cards: ");
            player.displayCards();
            System.out.println(
                    "Your opponent does not have the card you asked for so you lose chance to draw a card again");

            System.out.println("-----------------------------");

       //checking for computer
            while (computerTurn) {
                System.out.println("Your Opponent's Turn\n");

                if (com.isEmpty()) {
                    com.drawCards(deck);
                    System.out.println("Your opponent's player is empty!Shffule the deck and draw one card!");
                } 

               
                if (com.checkCards() > 0) {
                    System.out.println("Your opponent has a Book of " + com.checkCards());
                    com.addCards(com.checkCards());
                    cardcom++;
                    displayBook();
                } 
                
                
                int ChosenCard;
                ChosenCard = com.getCard(generateRandomNumber(com.getSize())).getValue();
                System.out.println("Your opponent wants " + ChosenCard);
                if (player.sameCard(ChosenCard)) {
                    System.out.println("You have " + ChosenCard);
                    com.getCards(player, ChosenCard);
                    if (com.checkCards() > 0) {
                        System.out.println("Your opponent has these cards" + ChosenCard);
                        com.addCards(ChosenCard);
                        cardcom++;
                        displayBook();
                        if (cardPlay + cardcom == 13) {
                            System.out.println("Game Ends!");
                            keepGaming = false;
                            break;
                        }
                    }
                    System.out.println("Your opponent gains another turn.\n");
                } 
               
                else {
                    System.out.println("You don't have " + ChosenCard + "!");
                    System.out.println("Go Fish!");
                    com.drawCards(deck);
                    if (com.checkCards() > 0) {
                        System.out.println("Your opponent has a Book of " + com.checkCards());
                        com.addCards(com.checkCards());
                        cardcom++;
                        displayBook();
                        if (cardPlay + cardcom == 13) {
                            System.out.println("Game Ends!");
                            keepGaming = false;
                            break;
                        }
                    } else {
                        computerTurn = false;
                    }
                    System.out.println("Your opponent's turn is over.");
                }
            }
            System.out.println("***********************");

        }
        Winner();
    }

    //it generate the random cards
    public int generateRandomNumber(int i) {
        Random r = new Random();
        return r.nextInt(i);
    }

    //this method display the number of books for player and computer
    public void displayBook() {
        System.out.println("Your Book: " + cardPlay);
        System.out.println("Opponent Book: " + cardcom);
    }
  
    //this method dispaly the winner between computer and player and print the message of congratulation otherwise you lose the game, try again
    @Override
    public void Winner() {
        if (cardPlay > cardcom) {
            System.out.println("Congratulations you won!" + getPlayers());
        } else {
            System.out.println("Play again,You Lose!");
        }
    }

}
