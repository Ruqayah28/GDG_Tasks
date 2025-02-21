/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package myproject.googletask3_2;
import java.util.*;

/**
 *
 * @author ruqay
 */
public class GoogleTask3_2 {

    public static void main(String[] args) {
 Scanner input = new Scanner(System.in);

        System.out.print(" Enter a noun: ");
        String noun = input.nextLine();

        System.out.print(" Enter a verb: ");
        String verb = input.nextLine();
        
        System.out.print(" Enter an adjective: ");
        String adjective = input.nextLine();

        System.out.print(" Enter an adverb: ");
        String adverb = input.nextLine();

        String sentence = " Do you " + verb + " your " + adjective + " " + noun + " " + adverb + "? " + "That's hilarious";
        
        System.out.print(sentence);
        
        input.close();    }
}
