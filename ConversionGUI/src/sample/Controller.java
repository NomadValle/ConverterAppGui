package sample;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.paint.Paint;

public class Controller  {

    public Button cupsBtn, ouncesBtn, pintsBtn, gallonsBtn;
    public Label answerLabel;
    public TextField userQuantity = new TextField();
    public RadioButton userCupsRB, userGallonsRB, userPintsRB, userOuncesRB, userQuartsRB;

    //VALIDATE USER INPUT
    public boolean isValidEntry(String input){
        if(!input.matches("\\d+") ){
            return false;
        }
        return true;
    }


    //CONVERSION METHODS
    public void toCups(){
             if(isValidEntry(userQuantity.getText())){
                 double quantity = Double.parseDouble(userQuantity.getText());

                if (userCupsRB.isSelected()) {
                    answerLabel.setText("Invalid Conversion");
                } else if (userPintsRB.isSelected()) {
                    double pintsToCups = quantity * 1.971;
                    answerLabel.setText(String.valueOf(pintsToCups) + " cups");
                } else if (userGallonsRB.isSelected()) {
                    double gallonsToCups = quantity * 15.772;
                    answerLabel.setText(String.valueOf(gallonsToCups) + " cups");
                } else if (userQuartsRB.isSelected()) {
                    double quartsToCups = quantity * 3.943;
                    answerLabel.setText(String.valueOf(quartsToCups) + " cups");
                } else if (userOuncesRB.isSelected()) {
                    double ouncesToCups = quantity * 0.118;
                    answerLabel.setText(String.valueOf(ouncesToCups) + " cups");
                }

             } else{
                 answerLabel.setText("Invalid Entry");
             }

        }
    public void toOunces(){
        if(isValidEntry(userQuantity.getText())){
            double quantity = Double.parseDouble(userQuantity.getText());
            if(userOuncesRB.isSelected()){
                answerLabel.setText("Invalid Conversion");
            } else if(userGallonsRB.isSelected()){
                double gallonsToOunces = quantity * 133.227;
                answerLabel.setText(String.valueOf(gallonsToOunces) + " ounces");
            } else if(userQuartsRB.isSelected()){
                double quartsToOunces = quantity* 33.306;
                answerLabel.setText(String.valueOf(quartsToOunces) + " ounces");
            }  else if (userCupsRB.isSelected()) {
                double cupsToOunces = quantity * 8.446;
                answerLabel.setText(String.valueOf(cupsToOunces) + " ounces");
            }  else if(userPintsRB.isSelected()){
                double pintsToOunces = quantity * 16.653;
                answerLabel.setText(String.valueOf(pintsToOunces) + " ounces");
            }
        } else
            answerLabel.setText("Invalid Entry");

    }

    public void toGallons(){
        if(isValidEntry(userQuantity.getText())){
            double quantity = Double.parseDouble(userQuantity.getText());

            if(userGallonsRB.isSelected()){
                answerLabel.setText("Invalid Conversion");
            } else if(userOuncesRB.isSelected()){
                double ouncesToGallons = quantity * 0.0075;
                answerLabel.setText(String.valueOf(ouncesToGallons) + " gallons");
            } else if(userQuartsRB.isSelected()){
                double quartsToGallons = quantity* 0.250;
                answerLabel.setText(String.valueOf(quartsToGallons) + " gallons");
            }  else if (userCupsRB.isSelected()) {
                double cupsToGallons = quantity * 0.063;
                answerLabel.setText(String.valueOf(cupsToGallons) + " gallons");
            }  else if(userPintsRB.isSelected()){
                double pintsToGallons = quantity * 0.125;
                answerLabel.setText(String.valueOf(pintsToGallons) + " gallons");
            }
        } else
            answerLabel.setText("Invalid Entry");
    }

    public void toPints(){
        if(isValidEntry(userQuantity.getText())){
            double quantity = Double.parseDouble(userQuantity.getText());

            if(userPintsRB.isSelected()){
                answerLabel.setText("Invalid Conversion");
            } else if(userGallonsRB.isSelected()){
                double gallonsToPints = quantity * 7.999;
                answerLabel.setText(String.valueOf(gallonsToPints) + " pints");
            } else if(userQuartsRB.isSelected()){
                double quartsToPints = quantity * 2.0;
                answerLabel.setText(String.valueOf(quartsToPints) + " pints");
            }  else if (userCupsRB.isSelected()) {
                double cupsToPints = quantity * 0.507;
                answerLabel.setText(String.valueOf(cupsToPints) + " pints");
            }  else if(userOuncesRB.isSelected()){
                double ouncesToPints = quantity * 0.0624;
                answerLabel.setText(String.valueOf(ouncesToPints) + " pints");
            }
        } else
            answerLabel.setText("Invalid Entry");
    }

    public void toQuarts(){
        if(isValidEntry(userQuantity.getText())){
            double quantity = Double.parseDouble(userQuantity.getText());

            if(userQuartsRB.isSelected()){
                answerLabel.setText("Invalid Conversion");
            } else if(userGallonsRB.isSelected()){
                double gallonsToQuarts = quantity * 3.999;
                answerLabel.setText(String.valueOf(gallonsToQuarts) + " quarts");
            } else if(userPintsRB.isSelected()){
                double pintsToQuarts = quantity * 0.50;
                answerLabel.setText(String.valueOf(pintsToQuarts) + " quarts");
            }  else if (userCupsRB.isSelected()) {
                double cupsToQuarts = quantity * 0.253;
                answerLabel.setText(String.valueOf(cupsToQuarts) + " quarts");
            }  else if(userOuncesRB.isSelected()){
                double ouncesToQuarts = quantity * 0.031;
                answerLabel.setText(String.valueOf(ouncesToQuarts) + " quarts");
            }
        } else
            answerLabel.setText("Invalid Entry");
    }



}
