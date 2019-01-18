package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    Scanner userInput = new Scanner(System.in);


    String lineBreak = "\n";
    String initialPrompt = "You're in a stank bog and all the peet and crud-water is catching fire around you. Do you: ";

    String firstStageOptionOne = "1 - Float away by grabbing a lifting hot air balloon";
    String firstStageOptionTwo = "2 - Hop on the back of a passing american-bad-ass eagle by kungfuing up its talons";


    String stageTwoBalloonPrompt = "You are now 100 ft in the air. Do you:";
    String stageTwoBalloonOptionOne = "1 - Burn the mother down and stoke the balloon flame to gain lift";
    String stageTwoBalloonOptionTwo = "2 - Just give up your will to live and take a nap in the balloon basket";

    String stageTwoEaglePrompt = "You are now riding the spine of a bucking american-bad-ass eagle. Do you:";
    String stageTwoEagleOptionOne = "1 - Sing Oh Canada and feed it maple syrup";
    String stageTwoEagleOptionTwo = "2- Sing The Star Spangled Banner and feed it over-priced healthcare";

    boolean wantToContinue = true;

    do{
        System.out.println(initialPrompt + lineBreak + firstStageOptionOne + lineBreak + firstStageOptionTwo);
        int userAnswer = userInput.nextInt();

        if(userAnswer == 1){
            System.out.println(stageTwoBalloonPrompt + lineBreak + stageTwoBalloonOptionOne + lineBreak + stageTwoBalloonOptionTwo);
            userAnswer = userInput.nextInt();
        } else if (userAnswer == 2){

            System.out.println(stageTwoEaglePrompt + lineBreak + stageTwoEagleOptionOne + lineBreak + stageTwoEagleOptionTwo);
            userAnswer = userInput.nextInt();




        }

        

    }while(wantToContinue);


    }
}
