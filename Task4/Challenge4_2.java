package myproject.challenge4_2;
import javax.swing.JOptionPane;


public class Challenge4_2 {
    private static final float CONVERSION_FACTOR = 0.09290304f;

    public static void main(String[] args) {
        String unit = JOptionPane.showInputDialog("What is the unit of measurement (meter or foot)?");
        String lengthInput = JOptionPane.showInputDialog("What is the length of the room?");
        String widthInput = JOptionPane.showInputDialog("What is the width of the room?");

        
        if (!isNumeric(lengthInput) || !isNumeric(widthInput)) {
            JOptionPane.showMessageDialog(null, "Please enter valid numeric values.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        
        float lengthValue = Float.parseFloat(lengthInput);
        float widthValue = Float.parseFloat(widthInput);

        
        float areaInMeters;
        float areaInFeet;

        if (unit.equalsIgnoreCase("foot") || unit.equalsIgnoreCase("f")) {
            areaInFeet = calculateArea(lengthValue, widthValue);
            areaInMeters = convertToSquareMeters(areaInFeet);
            JOptionPane.showMessageDialog(null,
                "You entered dimensions of " + lengthValue + " " + unit + " by " + widthValue + " " + unit + ".\n" +
                "The area is:\n" +
                areaInMeters + " square meters\n" +
                areaInFeet + " square feet",
                "Result",
                JOptionPane.PLAIN_MESSAGE);
        } else if (unit.equalsIgnoreCase("meter") || unit.equalsIgnoreCase("m")) {
            areaInMeters = calculateArea(lengthValue, widthValue);
            areaInFeet = convertToSquareFeet(areaInMeters);
            JOptionPane.showMessageDialog(null,
                "You entered dimensions of " + lengthValue + " " + unit + " by " + widthValue + " " + unit + ".\n" +
                "The area is:\n" +
                areaInMeters + " square meters\n" +
                areaInFeet + " square feet",
                "Result",
                JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Invalid unit entered.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

   
    private static float calculateArea(float length, float width) {
        return length * width;
    }

   
    private static float convertToSquareMeters(float areaInFeet) {
        return areaInFeet * CONVERSION_FACTOR;
    }

    
    private static float convertToSquareFeet(float areaInMeters) {
        return areaInMeters / CONVERSION_FACTOR;
    }

    
    private static boolean isNumeric(String str) {
        try {
            Float.parseFloat(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}