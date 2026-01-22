/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 * @student tchow
 * @number 991816282
 */

// imports
import java.util.Random;
import java.util.Scanner;

public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random r_num = new Random(); // random number
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(r_num.nextInt(13) + 1); // 13 cards per suit and there are no cards with value 0
            c.setSuit(Card.SUITS[r_num.nextInt(4)]); // 4 suits per deck, output message only goes from 0-3
            magicHand[i] = c; // returns card value from hand
            System.out.println(c.getSuit() + c.getValue()); // output message
            
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        // add one luckcard hard code 2,clubs
        
        // user input
        Scanner u_input = new Scanner(System.in);
        // value for card number
        System.out.print("Pick a card value (1-13): ");
        int c_val = u_input.nextInt(); // card number 
        // card suit
        System.out.print("Enter a suit (0-3 where 0=Hearts, 1=Diamonds, 2=Spades, 3=Clubs): ");
        int c_suit = u_input.nextInt(); // card suit
        
        // set new card values to user input
        Card userCard = new Card(); // new card obj to store user input
        userCard.setValue(c_val); // card value
        userCard.setSuit(Card.SUITS[c_suit]); // card suit
        System.out.println("User Card: " + userCard.getSuit() + " " + userCard.getValue()); // message conf
        
        // luckyCard - hard-coded card obj
        Card luckyCard = new Card;
        luckyCard.setValue(3);
        luckyCard.setSuit("Clubs");

        // verify lucky card is found
        boolean luckyFound = false; // boolean to output final message
        for (Card c : magicHand) {
            // checks all cards in magicHand to see if userCard exists in magicHand
            if (c.getValue() == userCard.getValue() && c.getSuit().equalsIgnoreCase(userCard.getSuit())) {
                luckyFound = true;
                break;
            }
        }
        // output messages for lucky card
        if (luckyFound) {
            System.out.println("You found the lucky card!");
        }
        else {
            System.out.println("The lucky card is not in the magic hand. Better luck next time!");
        }
        
        // search for card that matches user input
        boolean foundCard = false; // boolean to output final message
        for (Card c : magicHand) {
            // checks all cards in magicHand to see if userCard exists in magicHand
            if (c.getValue() == userCard.getValue() && c.getSuit().equalsIgnoreCase(userCard.getSuit())) {
                foundCard = true;
                break;
            }
        }
        // output messages
        if (foundCard) {
            System.out.println("Congratulations! Your card is in the magic hand!");
        }
        else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }
        
    }
    
}
