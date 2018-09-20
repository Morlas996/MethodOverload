package com.steven;

public class Main {
    private static final String INVALID_VALUE_MESSAGE = "Invslid Value";

    public static void main(String[] args) {
        System.out.println(getDurationString(80, 9));
        System.out.println(getDurationString(3700));
    }
    public static String getDurationString(int minutes, int seconds){
        String value = "";
        String textMinutes;
        String textSeconds;
        int hours;

        String textHours;


        if(minutes < 0 || (seconds < 0 || seconds > 59)){
           return INVALID_VALUE_MESSAGE;

        }

        else if(minutes <= 60){
        textMinutes = Integer.toString(minutes);
            textSeconds = Integer.toString(seconds);
            if(minutes < 10){
                textMinutes = "0" + textMinutes;
            }
            if(seconds < 10){
                textSeconds = "0" + textSeconds;
            }
        value = "00h " + textMinutes + "m " + textSeconds + "s";

        }
        else if(minutes > 60){

            hours = minutes / 60;
            int remainingMinutes = minutes % 60;
            textHours = Integer.toString(hours);
            textMinutes = Integer.toString(remainingMinutes);
            textSeconds = Integer.toString(seconds);
            if(remainingMinutes < 10){
                textMinutes = "0" + textMinutes;
            }
            if(seconds < 10){
                textSeconds = "0" + textSeconds;
            }
            if(hours < 10) {
                value = "0" + textHours + "h " + textMinutes + "m " + textSeconds + "s";
            }
            else{
                value = textHours + "h " + textMinutes + "m " + textSeconds + "s";
            }

        }
        return value;
    }
    public static String getDurationString(int seconds){
        String value = "";
        if(seconds < 0){
            return INVALID_VALUE_MESSAGE;
        }
        else{
            int secondsMinutes = seconds / 60;
            int otherSeconds = seconds % 60;
           value = getDurationString(secondsMinutes, otherSeconds);
        }
        return value;
    }
}
