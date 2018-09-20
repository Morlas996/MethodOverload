package com.steven;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Steven", 500);

        System.out.println("New Score is " + newScore);
        calculateScore(400);
        calculateScore();
        System.out.println(calcFeetAndInchesToCentimeters(76));
    }
    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored" + score +  " points");
        return score * 1000;
    }
    public static int calculateScore(int score){
        System.out.println("Unnamed Player " + " scored" + score + " points");
        return score * 1000;
    }
    public static int calculateScore(){
        System.out.println("No Player name. No Player Score");
        return 0;
    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        double centimeters;
        if( feet < 0.0d || (inches > 12.0d || inches < 0.0d)){
            return -1;
        }
        else{
             centimeters = (feet * 30.48d) + (inches * 2.54d);
             return centimeters;

        }


    }
    public static double calcFeetAndInchesToCentimeters(int inches){

        int feet;
        double remainingInches;
        if(inches < 0) {
            return -1;
        }
        else if(inches == 0){
            return 0;
        }
        else{
             remainingInches = inches % 12;
            feet = inches / 12;
            double remainingFeet = feet;
          return  calcFeetAndInchesToCentimeters(remainingFeet, remainingInches);

        }


    }
}
