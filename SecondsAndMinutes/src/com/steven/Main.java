package com.steven;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(80, 15));
        System.out.println(getDurationString(200000));
    }
    public static String getDurationString(int minutes, int seconds){
        String value = "";
        String textMinutes;
        String textSeconds;
        int hours;
        String textHours;
        if(minutes < 0 || (seconds < 0 || seconds > 59)){
           value = "Invalid Value";

        }
        else if(minutes <= 60){
        textMinutes = Integer.toString(minutes);
        textSeconds = Integer.toString(seconds);
        value = "00h " + textMinutes + "m " + textSeconds + "s";

        }
        else if(minutes > 60){
            hours = minutes / 60;
            int remainingMinutes = minutes % 60;
            textMinutes = Integer.toString(remainingMinutes);
            textSeconds = Integer.toString(seconds);
            textHours = Integer.toString(hours);
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
            value = "Invalid Value";
        }
        else{
            int secondsMinutes = seconds / 60;
            int otherSeconds = seconds % 60;
           value = getDurationString(secondsMinutes, otherSeconds);
        }
        return value;
    }
}
