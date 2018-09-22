package com.steven;

public class Main {

    public static void main(String[] args) {
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;
//
//        //can't use variable created inside code block outside of code block
//       int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
//        System.out.println("Your final score was " + highScore);
//        score = 10000;
//        levelCompleted = 8;
//        bonus = 200;
//        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
//        System.out.println("Your final score was " + highScore);

            int position;

            position = calculateHighScorePosition(1500);
            displayHighScorePosition("Steven", position);

            position = calculateHighScorePosition(900);
            displayHighScorePosition("Mary", position);

            position = calculateHighScorePosition(400);
            displayHighScorePosition("Elise", position);

            position = calculateHighScorePosition(50);
            displayHighScorePosition("John", position);
            printMegaBytesAndKiloBytes(5500);
    }
    //method
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {


        //can't use variable created inside code block outside of code block
        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore +=1000;

            return finalScore;
        }
        else {
            return -1;
        }
    }


    public static void displayHighScorePosition(String name, int position){
        System.out.println(name + " managed to get into position " + position + " on the high score table.");

    }
    public static int calculateHighScorePosition(int highScore){
        int spot;
        if(highScore >= 1000){
            spot = 1;

        }
        else if(highScore >= 500){
            spot = 2;
        }
        else if(highScore >= 100){
            spot = 3;
        }
        else{
            spot = 4;
        }

        return spot;
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int megaBytes = kiloBytes / 1024;
        int kilos = kiloBytes % 1024;
        if(kiloBytes > 0){
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + kilos + " KB");
        }
        else{
            System.out.println("Invalid Value");
        }
    }
    public static boolean bark(boolean barking, int hourOfDay){
        if(barking == false){
            barking = false;
        }
        else if(barking == true) if (hourOfDay < 0 || hourOfDay > 23) {
            barking = false;
        } else if (hourOfDay <= 8 || hourOfDay >= 22) {
            barking = true;
        } else {
            barking = false;
        }
        return barking;
    }
    public static boolean isLeapYear(int year){
        boolean isLeap = true;
        if(year < 1 || year > 9999){
            isLeap = false;

        }

        else if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            isLeap = true;
        }
        else{
            isLeap = false;
        }

        return isLeap;
    }


}
