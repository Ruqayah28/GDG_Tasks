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
       
       
        String numberOfChars = JOptionPane.showInputDialog("Enter your name");
        
       
        if (numberOfChars == null || numberOfChars.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No name entered.", "Error", JOptionPane.ERROR_MESSAGE);

        } else {
               int count = numberOfChars.length();   
               JOptionPane.showMessageDialog(null, numberOfChars + " has " + count + " characters.", "Character Count", JOptionPane.PLAIN_MESSAGE);

        }}}