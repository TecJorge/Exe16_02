package org.example.Model;

public class Rankine {
    public static String RankineToCelsius(String temperatura){
        return String.valueOf(((Integer.valueOf(temperatura))*(5/9)-273.15));
    }
    public static String RankineToFahrenheit(String temperatura){
        return String.valueOf((Integer.valueOf(temperatura))-459.67);
    }
    public static String RankineToKelvin(String temperatura){
        return String.valueOf((Integer.valueOf(temperatura))*(5.0/9));
    }

}
