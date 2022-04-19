/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.Scanner;

/**
 *
 * @author Muskan
 */
public class Main {//main class
    public static void main(String[] args) {
        System.out.println("Please Enter your name, Game is about to start ??");
        Scanner scan = new Scanner(System.in);

        String playerName = scan.nextLine();
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Press * to begin");
        String start = sc.next();

        goFishCard game = new goFishCard(start);
        System.out.println("You can start the GoFish game");

        game.play();
    }
}
