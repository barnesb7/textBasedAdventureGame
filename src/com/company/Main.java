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

    String stageThreeLiftPrompt = "You are now nearing outerspace. Do you:";
    String stageThreeLiftOptionOne = "Call for an alien Uber";
    String stageThreeLiftOptionTwo = "Keep it stokin!";

    String stageThreeNapPrompt = "You wake up to find yourself landed in a second non-fiery bog. Do you:";
    String stageThreeNapOptionOne = "Shake your head and sulk in your sorrows walking towards a field";
    String stageThreeNapOptionTwo = "Scream loudly and cry while walking towards the forest";

    String stageThreeOhCanadaPrompt = "Your singing of Canadas national anthem soothed the eagle. Do you:";
    String stageThreeOhCanadaOptionOne = "Accept the free healthcare its giving you";
    String stageThreeOhCanadaOptionTwo = "Sit with it on a moose while eating Tim Hortens";

    String stageThreeStarSpangledPrompt ="Your singing of Americas national anthem got the american-bad-ass eagle hype. Do you:";
    String stageThreeStarSpangledOptionOne = "Drink FourLoco and fan the bog fire across the entire earth";
    String stageThreeStarSpangledOptionTwo = "Drink gasoline and burn all the worlds fossil fuels";


    boolean wantToContinue = true;

    do{
        System.out.println(initialPrompt + lineBreak + firstStageOptionOne + lineBreak + firstStageOptionTwo);
        int userAnswer = userInput.nextInt();

        if(userAnswer == 1){
            System.out.println(stageTwoBalloonPrompt + lineBreak + stageTwoBalloonOptionOne + lineBreak + stageTwoBalloonOptionTwo);
            userAnswer = userInput.nextInt();

                if(userAnswer == 1){

                } else if(userAnswer == 2){

                }


        } else if (userAnswer == 2){

            System.out.println(stageTwoEaglePrompt + lineBreak + stageTwoEagleOptionOne + lineBreak + stageTwoEagleOptionTwo);
            userAnswer = userInput.nextInt();

                if(userAnswer == 1){

                } else if(userAnswer == 2){

                }


        }


     String playAgainPrompt = "Would you like to play again?";
     String playAgainOptionOne = "1 - Yes";
     String playAgainOptionTwo = "2 - No";

        System.out.println(playAgainPrompt + lineBreak + playAgainOptionOne + lineBreak + playAgainOptionTwo);
        int playAgainAnswer = userInput.nextInt();

        if (playAgainAnswer == 2){

            System.out.println("Thanks for playing!");
            wantToContinue = false;
        }

    }while(wantToContinue);


    }
}
