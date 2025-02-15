/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myproject.google_task2;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author ruqay
 */
public class Hello_task {
    
   Scanner input = new Scanner(System.in);
   
   
   public void withVar(){
       
        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.println("Hello " + name + ", nice to meet you!");
   }
   
   public void withOutVar(){
       
       System.out.print("What is your name? ");
       System.out.println("Hello " + new Scanner(System.in).nextLine() + ", nice to meet you!");
   }
   
   public void differentGreeting(){
       
       System.out.print("What is your name? ");
       
       String[] greetings = {
            "Hello! ",
            "Hey! ",
            "Nice day to you, ",
            "Hi! ",
            "Greetings! ",
            "Have a nice day!",
            "Welcome, " };
       
       Random random = new Random();
       System.out.println(greetings[random.nextInt(greetings.length)] + new Scanner(System.in).nextLine());
   }
    
}
