/**
 * @author kishorekathir
 * @version 7.0
 */

// Extend the User Story 6 to implement a CharacterPatternMap class to encapsulate
// character-to-pattern mappings. The application retrieves and displays the "OOPS"
// banner using these mappings. Thereby addressing the drawback of not having
// centralized character pattern management system.

// Key Requirements:
// 1. Create CharacterPatternMap class to hold character and its pattern
// 2. Implement methods to create and retrieve character patterns
// 3. Use CharacterPatternMap to display the "OOPS" banner
// 4. Implement modular and reusable character pattern management

// Drawback of this approach is that we are creating CharacterPatternMap objects
// for each character, which may not be the most efficient approach for large sets.

public class OOPSBannerApp {

    /**
     * CharacterPatternMap - Inner class for storing character-to-pattern mappings
     *
     * Encapsulates a single character and its corresponding ASCII art pattern.
     * Provides immutable access to character and pattern data through getters.
     */
    static class CharacterPatternMap {

        /** The character being represented */
        Character character;

        /** The ASCII art pattern lines for the character */
        String[] pattern;

        /**
         * Constructs a CharacterPatternMap with a character and its pattern
         *
         * @param character the character to be mapped
         * @param pattern   the ASCII art pattern representation as array of strings
         */
        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Retrieves the mapped character
         *
         * @return the character associated with this pattern map
         */
        public Character getCharacter() {
            return character;
        }

        /**
         * Retrieves the ASCII art pattern
         *
         * @return the pattern array representing the character
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    public static CharacterPatternMap[] createCharacterPatternMaps() {
        CharacterPatternMap[] characterPatternMap = new CharacterPatternMap[4];

        // Pattern for letter 'O'
        characterPatternMap[0] = new CharacterPatternMap('O', new String[]{
            "  ***  ",
            " **  **",
            "**    *",
            "**     ",
            "**    *",
            " **  **",
            "  ***  "
        });

        // Pattern for letter 'P'
        characterPatternMap[1] = new CharacterPatternMap('P', new String[]{
            " ***** ",
            "**   **",
            "**   **",
            " ***** ",
            "**     ",
            "**     ",
            "**     "
        });

        // Pattern for letter 'S'
        characterPatternMap[2] = new CharacterPatternMap('S', new String[]{
            " ***** ",
            "**     ",
            "**     ",
            " ***** ",
            "     **",
            "     **",
            " ***** "
        });

        // Pattern for space character
        characterPatternMap[3] = new CharacterPatternMap(' ', new String[]{
            "       ",
            "       ",
            "       ",
            "       ",
            "       ",
            "       ",
            "       "
        });

        return characterPatternMap;
    }

    
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap charMap : charMaps) {
            if (charMap.getCharacter() == ch) {
                return charMap.getPattern();
            }
        }
        // If character not found, return space pattern (recursive fallback)
        return getCharacterPattern(' ', charMaps);
    }

    public static void printMessage(String message, CharacterPatternMap[] charMaps) {
        int patternHeight = 7;

        // Loop through each of the 7 lines of the banner
        for (int line = 0; line < patternHeight; line++) {
            StringBuilder sb = new StringBuilder();

            // Loop through each character in the message
            for (int i = 0; i < message.length(); i++) {
                char ch = message.charAt(i);
                String[] pattern = getCharacterPattern(ch, charMaps);
                sb.append(pattern[line]);
                // Add spacing between characters (except after the last one)
                if (i < message.length() - 1) {
                    sb.append(" ");
                }
            }
            System.out.println(sb.toString());
        }
    }

    public static void main(String[] args) {
        // Create CharacterPatternMap array
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        // Define the message to be displayed
        String message = "OOPS";
        // Print the banner message
        printMessage(message, charMaps);
    }
}