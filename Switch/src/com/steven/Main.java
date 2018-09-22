package com.steven;

public class Main {

    public static void main(String[] args) {
	int value = 1;
	if(value == 1){
        System.out.println("Value was 1");

    }
    else if(value == 2){
        System.out.println("Value was 2");

    }
    else{
        System.out.println("was not 1 or 2");
    }
    int switchValue = 1;
    switch(switchValue){
        case 1:
            System.out.println("Value was 1");
            break;
        case 2:
            System.out.println("value was 2");
            break;
        default:
            System.out.println("Value was not 1 or 2");
            break;

        case 3: case 4: case 5:
            System.out.println("actually it was a " + switchValue);
            System.out.println("was a 3 a for or a 5");
            break;
    }
    char charVariable = 'A';

    switch(charVariable){
        case 'A':
            System.out.println("The character was A");
            break;
        case 'B':
            System.out.println("The character was B");
            break;
        case 'C':
            System.out.println("The character was C");
            break;
        case 'D':
            System.out.println("The character was D");
            break;
        case 'E':
            System.out.println("The Character was E");
        default:
            System.out.println("The character was not A, B, C, D, or E");
    }
    String month = "January";
    switch(month.toLowerCase()) {
        case"January":
            System.out.println("Jan");
            break;
        case "June":
            System.out.println("Jun");
            break;
        default:
            System.out.println("Not Sure");
    }
    }
}
