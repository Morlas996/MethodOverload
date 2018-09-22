package com.steven;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

//        if (score <= 5000 && score > 1000) {
//            System.out.println("Your Score was less than 5000 but greater than 1000.");
//
//            System.out.println("This was executed");
//        } else if (score < 1000) {
//            System.out.println("your score was less than 1000");
//        } else {
//            System.out.println("Got Here.");
//        }
        //can't use variable created inside code block outside of code block
    if (gameOver){
        int finalScore = score + (levelCompleted * bonus);
        System.out.println("Your final score was " + finalScore);
    }

    levelCompleted = 8;
    score = 10000;
    bonus = 200;
    if(gameOver){

        int finalScore = score + (levelCompleted * bonus);
        System.out.println("Your final score on level 8 was " + finalScore);
    }
    }
}
