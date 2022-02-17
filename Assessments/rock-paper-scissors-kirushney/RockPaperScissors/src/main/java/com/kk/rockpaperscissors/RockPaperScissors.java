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
        String yourMove = "";

        // Initialising Scanner and printing out a welcome message
        Scanner newReader = new Scanner(System.in);
        System.out.println("Welcome to Rock, Papers, Scissors!");
        
        // Creating a while(true) loop, with a break if the user input
        // number is not between the range 1 - 10 rounds
        while(true) {
            
            System.out.println("How many rounds do you want to play?");
            numRounds = newReader.nextInt();
        
            if(numRounds > 10 || numRounds < 0) {
                System.out.print("Error, number not in range. ");
                break;
            } else if(numRounds < 10 || numRounds > 0) {
                System.out.println("Okay. Let's begin!");
                rounds(numRounds, yourMove);
            }
        }
    }               
    public static void rounds(int numRounds, String yourMove) {
        
        Scanner newReader = new Scanner(System.in);
        int numMove;
        
                for (int currentRound = 1; currentRound <= numRounds; currentRound++) {
                    System.out.println("***** Start of round " + currentRound + " ***** ");
                    System.out.print("What is your choice?");
                    System.out.println(" Rock, Paper or Scissors?");
                    System.out.println("Remember: Rock = 0, Paper = 1, Scissors = 2");
                    System.out.println("Please enter a number.");
                    numMove = newReader.nextInt();
                
                // Converting numbers into Strings
                
                switch (numMove) {
                    case 0 -> yourMove = "Rock";
                    case 1 -> yourMove = "Paper";
                    case 2 -> yourMove = "Scissors";
                }
 
                System.out.println("Your move is: " + yourMove);
                
                // Creating random number between 0 and 3
                // so that the computer can make a move that is 0, 1 or 2
                //Then printing the result of the round
                
                int computerMove = (int)(Math.random()*3);
                if(computerMove == 0) {
                System.out.println("Computer move is: " + computerMove + " , Rock");
                } else if(computerMove == 1) {
                    System.out.println("Computer move is: " + computerMove + " , Paper");
                } else {
                    System.out.println("Computer move is: " + computerMove + " , Scissors");
                }
                
                
                if(computerMove == numMove) {
                    System.out.println("It's a tie!");
                } else if((computerMove == 0 && numMove == 1) ||
                        (computerMove == 1 && numMove == 2) ||
                        (computerMove == 2 && numMove == 0)) {
                    System.out.println("You Win!");
                } else if((computerMove ==1 && numMove ==0) ||
                        (computerMove == 0 && numMove == 2) ||
                        (computerMove == 2 && numMove == 1)) {
                    System.out.println("Computer Wins!");
                    }
                }
                
            }
    }
