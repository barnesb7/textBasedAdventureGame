package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    Scanner userInput = new Scanner();


    String lineBreak = "\n";
    String initialPrompt = "You're in a stank bog and all the peet and crud-water is catching fire around you. Do you: ";

    String firstStageOptionOne = "1 - Float away by grabbing a lifting hot air balloon";
    String firstStageOptionTwo = "2 - Hop on the back of a passing american-bad-ass eagle by gymnastic-ing up the beasts talons";


    String stageTwoBalloonPrompt = "You are now 100 ft in the air. Do you:";
    String stageTwoBalloonOptionOne = "Burn the mother down and stoke the balloon flame to gain lift";
    String stageTwoBalloonOptionTwo = "Just give up your will to live and take a nap in the balloon basket";

    String stageTwoEaglePrompt = "You are now riding the spine of a bucking american-bad-ass eagle. Do you:";
    String stageTwoEagleOptionOne = "Sing Oh Canada and feed it maple syrup";
    String stageTwoEagleOptionTwo = "Sing The Star Spangled Banner and feed it over-priced healthcare";
    
    boolean wantToContinue = true;

    do{
        System.out.println(initialPrompt + lineBreak + firstStageOptionOne + lineBreak + firstStageOptionTwo);
        int userAnswer = userInput.nextInt();

        if(userAnswer == 1){
            System.out.println();
        } else if (userAnswer == 2){






        }

    }while(wantToContinue);


    }
}
