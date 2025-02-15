/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package myproject.task1;
import java.util.Scanner;
/**
 *
 * @author ruqay
 */
public class Task1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double bill_amount=0;
        double tip_rate=0;
        boolean f = true;
        do{
        try {
            
            System.out.print("bill amount: ");
            bill_amount = input.nextDouble();           
            System.out.print("tip rate: ");
            tip_rate = input.nextDouble();
            
            if (bill_amount < 0 || tip_rate < 0) { 
                    System.out.println("Values must be positive!");
                    f = false;
                } else {
                    f = true;
                }
            } catch (Exception e) {
            System.out.println("Invalid input! Please enter numbers.");
            f=false;
            
        }} while(!f);
        calc(bill_amount, tip_rate);
        
        
    }
public static void calc(double bill_amount,double tip_rate){
            double tip;
            if (tip_rate < 1) {
            tip = bill_amount * tip_rate; 
        } else {
            tip = bill_amount * (tip_rate / 100); 
        }

        double total = bill_amount + tip;
        System.out.println("Tip: " + tip + "\nTotal: " + total);
           
        }
        

}
    
    

