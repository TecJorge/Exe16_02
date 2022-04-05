package org.example.Controller;

import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ChoiceBox;
import org.example.Model.Celsius;
import org.example.Model.Fahrenheit;
import org.example.Model.Kelvin;
import org.example.Model.Rankine;

import java.util.Optional;

public class ApplicationController {

public void sairApp(){
 Alert leave =new Alert(Alert.AlertType.CONFIRMATION);
 leave.setTitle("Aplicação");
 leave.setContentText("Deseja mesmo sair da Aplicação");
 leave.setHeaderText("Confirmação da ação");
leave.showAndWait();
 if(leave.showAndWait().get()==ButtonType.OK)
  System.exit(0);
}
public  String converter(int option,String temperatura){
 switch (option){
  case 0:
   return Celsius.CelsiusToFahrenheit(temperatura);
  case 1:
   return Celsius.CelsiusToKelvin(temperatura);
  case 2:
     return Celsius.CelsiusToRankine(temperatura);
  case 3:
   return Fahrenheit.FahrenheitToCelsius(temperatura);
  case 4:
   return Fahrenheit.FahrenheitToKelvin(temperatura);
  case 5:
   return Fahrenheit.FahrenheitToRankine(temperatura);
  case 6:
   return Kelvin.KelvinToCelsius(temperatura);
  case 7:
   return Kelvin.KelvinToFahrenheit(temperatura);
  case 8:
   return Kelvin.KelvinToRankine(temperatura);
  case 9:
   return Rankine.RankineToCelsius(temperatura);
  case 10:
   return Rankine.RankineToFahrenheit(temperatura);
  case 11:
   return Rankine.RankineToKelvin(temperatura);

 }


 return "";
}
}
