package org.example.Model;

public class Kelvin {
    public static String KelvinToCelsius(String temperatura){
        return String.valueOf(((Integer.valueOf(temperatura))-273.15));
    }
    public static String KelvinToFahrenheit(String temperatura){
        return String.valueOf(((Integer.valueOf(temperatura))*9/5)-459.67);
    }
    public static String KelvinToRankine(String temperatura){
        return String.valueOf((Integer.valueOf(temperatura))*9/5);
    }
}
