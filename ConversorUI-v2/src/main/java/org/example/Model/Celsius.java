package org.example.Model;

public class Celsius {


    public static String CelsiusToFahrenheit(String temperatura){
        return String.valueOf((Integer.valueOf(temperatura)*(9/5))+ 32);
    }
    public static String CelsiusToKelvin(String temperatura){
        return String.valueOf((Integer.valueOf(temperatura)+ 273.15));
    }
    public static String CelsiusToRankine(String temperatura){
        return String.valueOf(((Integer.valueOf(temperatura))*(9/5) + 491.67));
    }
}
