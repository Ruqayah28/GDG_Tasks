/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package myproject.googletask3_1;
import java.util.*;

/**
 *
 * @author ruqay
 */
public class GoogleTask3_1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        //Part 1: 
        System.out.print("What is the quote? ");
        String quote = input.nextLine();
        
        System.out.print("Who said it? ");
        String name = input.nextLine();
        
        System.out.println(name + " says, \"" + quote + "\"");
        
        //Part 2: After Modifiying
        System.out.println("-------------------------");
        Map<String, String>[] quotes = new HashMap[3];
        
        quotes[0] = new HashMap<>();
        quotes[0].put("quote", "Genius is one percent inspiration and ninety-nine percent perspiration.");
        quotes[0].put("author", "Thomas Edison");
        
        quotes[1] = new HashMap<>();
        quotes[1].put("quote", "Winning isn’t everything, but wanting to win is.");
        quotes[1].put("author", "Vince Lombardi");
        
        quotes[2] = new HashMap<>();
        quotes[2].put("quote", "If you fell down yesterday, stand up today.");
        quotes[2].put("author", "H.G. Wells");
        
        
        
        for (Map<String, String> q : quotes) {
            System.out.println(q.get("author")+" says, \"" + q.get("quote") + "\"");


    }
}}
