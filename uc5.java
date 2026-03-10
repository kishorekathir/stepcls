/**
 * @author kishorekathir
 * @version 5.0
 */

public class OOPSBannerApp {

    // Main method to run the banner display
    public static void main(String[] args) {

        // Define String Array variable to hold the OOPS banner lines
        // Each line represents a row in the banner for the letters O, O, P, S
        // Inline initialization: array is declared and populated in a single statement
        String[] lines = {
            String.join(" ", "  *  ", "  *  ", " ** ", " ** "),
            String.join(" ", " *  *", " *  *", "*     ", "*     "),
            String.join(" ", "*    *", "*  * ", "*     ", "**     "),
            String.join(" ", "*     ", "*  * ", "**  ", " *** "),
            String.join(" ", "*    *", "*  * ", "*     ", "     **"),
            String.join(" ", " *  *", " *  *", "*     ", "     *"),
            String.join(" ", "  *  ", "  *  ", " ** ", " ** ")
        };

        // Use a loop to print each line of the banner to create the
        // visual effect for the message "OOPS"
        for (String line : lines) {
            System.out.println(line);
        }
    }
}