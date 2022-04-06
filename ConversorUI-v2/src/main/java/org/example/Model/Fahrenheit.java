package org.example.Model;

public class Fahrenheit {

    public static String FahrenheitToCelsius(String temperatura){
        return String.valueOf(((Integer.valueOf(temperatura))-32 *(5.0/9.0)));
    }
    public static String FahrenheitToKelvin(String temperatura){
        return String.valueOf(((Integer.valueOf(temperatura))+459.67 *(5.0/9.0)));
    }
    public static String FahrenheitToRankine(String temperatura){
        return String.valueOf(((Integer.valueOf(temperatura))+459.67));
    }
}
