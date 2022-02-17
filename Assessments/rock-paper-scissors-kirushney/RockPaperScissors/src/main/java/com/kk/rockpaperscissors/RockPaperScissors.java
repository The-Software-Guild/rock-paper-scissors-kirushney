/**
 *@author Kirushney Kalamohan
 *email: kirushney@hotmail.co.uk
 *date: 17/02/22
 *purpose: Assessment 1: Rock, Paper, Scissors
 */
package com.kk.rockpaperscissors;

import java.util.Scanner;

public class RockPaperScissors {
    
    public static void main(String[] args) {
        
        // Declaring number of rounds variable 
        int numRounds;

        // Initialising Scanner and printing out a welcome message
        Scanner newReader = new Scanner(System.in);
        System.out.println("Welcome to Rock, Papers, Scissors!");
        
        // Creating a while(true) loop, with a break if the user input
        // number is not between the range 1 - 10 rounds
        // Then another if loop that breaks if the user does not want to play again
        while(true) {
            
            System.out.println("How many rounds do you want to play?");
            numRounds = newReader.nextInt();
        
            // if loop to clarify the range
            if(numRounds > 10 || numRounds < 0) {
                System.out.print("Error, number not in range. ");
                break;
            } else if(numRounds < 10 || numRounds > 0) {
                System.out.println("Okay. Let's begin!");
                rounds(numRounds);
            }
            
            Scanner secondReader = new Scanner(System.in);
            System.out.println("Do you want to play again? y/n");
            String newGame = secondReader.nextLine();
            // Only one if statement declared, so if user inputs anything
            // other than n, then the game will continue
            // To remedy this, I would create another if statement
            if(newGame.equals("n")) {
                System.out.println("Thanks for playing!");
                break;
            }
        }
    }
    
    // Creating a method to 'play' game
    public static void rounds(int numRounds) {
        // Initialising Scanner and declaring variables for this method
        Scanner newReader = new Scanner(System.in);
        int numMove;
        String yourMove = "";
        int ties = 0;
        int userWins = 0;
        int computerWins = 0;
                // Making sure the program plays for the specified number of rounds
                // Asking user for their choice
                for (int currentRound = 1; currentRound <= numRounds; currentRound++) {
                    System.out.println("***** Start of round " + currentRound + " ***** ");
                    System.out.print("What is your choice?");
                    System.out.println(" Rock, Paper or Scissors?");
                    System.out.println("Remember: Rock = 0, Paper = 1, Scissors = 2");
                    System.out.println("Please enter a number.");
                    numMove = newReader.nextInt();
                
                // Converting numbers into Strings to print out
                switch (numMove) {
                    case 0 -> yourMove = "Rock";
                    case 1 -> yourMove = "Paper";
                    case 2 -> yourMove = "Scissors";
                }
 
                System.out.println("Your move is: " + yourMove);
                
                // Creating random number between 0 and 3
                // so that the computer can make a move that is 0, 1 or 2
                // Then printing the result of the round
                
                int computerMove = (int)(Math.random()*3);
                String compMove = "";
                
                switch(computerMove) {
                    case 0 -> compMove = "Rock";
                    case 1 -> compMove = "Paper";
                    case 2 -> compMove = "Scissors";
                }
                    System.out.println("Computer move is: " + compMove);
                    
                // Keeping track of how many rounds are tie, user wins, comp wins
                // Writing out the if loop parameters and printing the results
                
                if(computerMove == numMove) {
                    ties++;
                    System.out.println("It's a tie!");
                } else if((computerMove == 0 && numMove == 1) ||
                        (computerMove == 1 && numMove == 2) ||
                        (computerMove == 2 && numMove == 0)) {
                    userWins++;
                    System.out.println("You Win!");
                } else if((computerMove ==1 && numMove ==0) ||
                        (computerMove == 0 && numMove == 2) ||
                        (computerMove == 2 && numMove == 1)) {
                    computerWins++;
                    System.out.println("Computer Wins!");
                    }
                }
                
                // Printing out the total number of ties, user wins and comp wins
                // Declaring the overall winner 
                System.out.println("Number of ties " + ties);
                System.out.println("Number of times you won " + userWins);
                System.out.println("Number of times Computer won " + computerWins);

                if(userWins>computerWins) {
                    System.out.println("The overall winner is....You!");  
                } else if(userWins<computerWins) {
                    System.out.println("The overall winner is....Computer!");
                } else if(userWins==computerWins) {
                    System.out.println("The overall winner is....no one! It's a tie!");
                }  
            }
}
