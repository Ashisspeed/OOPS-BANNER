* OOPS Banner App - UC7
 * Demonstrates storing character patterns using an Inner Static Class.
 * Shows Encapsulation, Modularity, Reusability and Abstraction.
 */
public class OOPSBannerApp {

    /**
     * Inner Static Class to encapsulate character and its banner pattern.
     * Demonstrates Encapsulation and Single Responsibility Principle.
     */
    public static class CharacterPatternMap {

        private final char character;
        private final String[] pattern;

        /**
         * Constructor to initialize character and its 7-line banner pattern.
         *
         * @param character The character to be stored
         * @param pattern   The 7-line banner representation of the character
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Returns the character.
         *
         * @return stored character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Returns the banner pattern of the character.
         *
         * @return 7-line banner pattern
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Utility method to find pattern for a given character.
     * Demonstrates Abstraction.
     *
     * @param ch       Character to search
     * @param patterns Array of CharacterPatternMap objects
     * @return Corresponding 7-line pattern
     */
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] patterns) {
        for (CharacterPatternMap pattern : patterns) {
            if (pattern.getCharacter() == ch) {
                return pattern.getPattern();
            }
        }
        return new String[7]; // return empty if not found
    }

    /**
     * Utility method to print banner word.
     *
     * @param word     Word to print
     * @param patterns Character pattern mappings
     */
    public static void printBanner(String word, CharacterPatternMap[] patterns) {

        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();

            for (int i = 0; i < word.length(); i++) {
                String[] charPattern = getCharacterPattern(word.charAt(i), patterns);
                line.append(charPattern[row]).append("  ");
            }

            System.out.println(line);
        }
    }

    /**
     * Main method – Program execution starts here.
     */
    public static void main(String[] args) {

        // Pattern for O
        String[] oPattern = {
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };

        // Pattern for P
        String[] pPattern = {
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        };

        // Pattern for S
        String[] sPattern = {
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        };

        // Array of CharacterPatternMap objects
        CharacterPatternMap[] patterns = {
                new CharacterPatternMap('O', oPattern),
                new CharacterPatternMap('P', pPattern),
                new CharacterPatternMap('S', sPattern)
        };

        // Print Banner
        printBanner("OOPS", patterns);
    }
}