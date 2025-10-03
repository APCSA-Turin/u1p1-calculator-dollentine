package com.example;
import java.util.Scanner;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
         public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
         
         double tip = cost * ( percent / 100.0); 
         double billWithTip = tip + cost; 
         double perPersonBeforeTip =  cost / people; 
         double tipPerPerson =  tip / people; 
         double totalCostPerPerson =  billWithTip / people; 

         double roundedTip = (int) (tip * 100 + 0.5) / 100.0; 
         double roundedBillWithTip = (int) (billWithTip * 100 + 0.5) / 100.0; 
         double roundedBeforeTip = (int) (perPersonBeforeTip * 100 + 0.5) / 100.0; 
         double roundedTipPerPerson = (int) (tipPerPerson * 100 + 0.5) / 100.0; 
         double roundedTotalPerPerson = (int) (totalCostPerPerson * 100 + 0.5) / 100.0; 


        //DO NOT DELETE ANY OF THE CODE BELOW      

        String result = "-------------------------------\n" +
                       "Total bill before tip: $" + cost + "" + "\n" +
                       "Total percentage: "  + percent + "" + "%\n" +
                       "Total tip: $" + roundedTip + "" + "\n" +
                       "Total Bill with tip: $" + roundedBillWithTip + "" + "\n" +
                       "Per person cost before tip: $" + roundedBeforeTip + "" + "\n" +
                       "Tip per person: $" + roundedTipPerPerson + "" + "\n" +
                       "Total cost per person: $" + roundedTotalPerPerson + "" + "\n" +
                       "-------------------------------\n";

        return result;
            
         }


        //DO NOT DELETE ANY OF THE CODE BELOW      


    public static String extraCredit(int people, int percent, double cost) {
        String result = "Extra credit not implemented";
        boolean condition = true;
    
        //  COPY AND PASTE YOUR PROGRAM FROM calculateTip() HERE 

        // the while loop condition is checked,
        // and if TRUE, runs the code inside.
        // when the code inside is done running, the condition is rechecked,
        // and the loop repeats as long as the condition remains TRUE.
        // when the condition becomes FALSE, it stops

        while (condition) {
            //enter your code here 
            System.out.println("placeholder");
            condition = false;
    
        }

        return result;
    }
    
    
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people=10; 
        int percent=8;
        double cost=10.5;              
        //System.out.println(calculateTip(people,percent,cost));
        System.out.println(extraCredit(people, percent, cost));

    }
}