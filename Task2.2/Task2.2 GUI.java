/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package myproject.task22;
import javax.swing.JOptionPane;

/**
 *
 * @author ruqay
 */
public class Task22 {

    public static void main(String[] args) {
       
       
       String name = JOptionPane.showInputDialog("Enter your name");
        
       
        if (name == null || name.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No name entered.", "Error", JOptionPane.ERROR_MESSAGE);

        } else {
               int numberOfChars = name.length();   
               JOptionPane.showMessageDialog(null, name + " has " + numberOfChars + " characters.", "Character Count", JOptionPane.PLAIN_MESSAGE);

        }}}
