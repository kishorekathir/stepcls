/**
 * @author kishorekathir
 * @version 4.0
 */


public class OOPSBannerApp {

    // Main method to run the banner display
    public static void main(String[] args) {

        // Step 1: Create a String array to store all 7 lines of the OOPS banner
        String[] lines = new String[7];

        // Step 2: Populate each index of the array with the corresponding banner line
        // Each line is constructed using String.join() to concatenate string segments
        // O = 9 chars, O = 9 chars, P = 9 chars, S = 9 chars (with spacing between)
        lines[0] = String.join(" ", "  *  ", "  *  ", " ** ", " ** ");
        lines[1] = String.join(" ", " *  *", " *  *", "*     ", "*     ");
        lines[2] = String.join(" ", "*    *", "*  * ", "*     ", "**     ");
        lines[3] = String.join(" ", "*     ", "*  * ", "**  ", " *** ");
        lines[4] = String.join(" ", "*    *", "*  * ", "*     ", "     **");
        lines[5] = String.join(" ", " *  *", " *  *", "*     ", "     *");
        lines[6] = String.join(" ", "  *  ", "  *  ", " ** ", " ** ");

        // Step 3: Use a for-each loop to iterate through the array and print each line
        for (String line : lines) {
            System.out.println(line);
        }
    }
}