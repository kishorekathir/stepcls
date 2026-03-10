/**
 * @author kishorekathir
 * @version 6.0
 */

// Extend the User Story 5 to display the OOPS banner using a modular approach
// by defining separate static methods for each character pattern (O, P, S)
// and invoking them in the main method to assemble and print the banner.

// Key Requirements:
// 1. Create separate methods to build patterns for O, P, and S using String.join()
// 2. At array declaration, call these methods to populate the banner lines in order
// 3. Maintain the 7-line, 9-character width alignment for each letter
// 4. Use a loop to assemble and print each line of the banner

public class OOPSBannerApp {

    // Method to generate the pattern for the letter 'O'
    public static String[] getOPattern() {
        return new String[] {
            "  *  ",
            " *  *",
            "**    *",
            "**     ",
            "**    *",
            " *  *",
            "  *  "
        };
    }

    // Method to generate the pattern for the letter 'P'
    public static String[] getPPattern() {
        return new String[] {
            " *** ",
            "*   *",
            "*   *",
            " *** ",
            "**     ",
            "**     ",
            "**     "
        };
    }

    // Method to generate the pattern for the letter 'S'
    public static String[] getSPattern() {
        return new String[] {
            " *** ",
            "**     ",
            "**     ",
            " *** ",
            "     **",
            "     **",
            " *** "
        };
    }

    // Main method to run the banner display
    public static void main(String[] args) {

        // Declare String Arrays to hold patterns for each letter
        // DRY Principle: 'O' method is reused twice for the two O's in "OOPS"
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Use the loop to assemble each line of the banner to create the
        // visual effect for the message "OOPS"
        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(oPattern[i] + " " + oPattern[i] + " " + pPattern[i] + " " + sPattern[i]);
        }
    }
}