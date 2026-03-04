/**
 * OOPS Banner App
 * UC7: Store Character Pattern in a Static Inner Class
 * 
 * This program demonstrates encapsulation, modularity,
 * and reusability by storing character banner patterns
 * inside a static inner class.
 */
public class OOPSBannerApp {

    /**
     * Static Inner Class that encapsulates
     * a character and its 7-line banner pattern.
     */
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        /**
         * Constructor to initialize character and pattern
         * 
         * @param character the character
         * @param pattern   the 7-line banner pattern
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Returns the character
         * 
         * @return character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Returns the banner pattern
         * 
         * @return pattern array
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Utility method to print banner text
     * 
     * @param text     input word (OOPS)
     * @param patterns array of CharacterPatternMap objects
     */
    public static void printBanner(String text, CharacterPatternMap[] patterns) {

        StringBuilder[] bannerLines = new StringBuilder[7];

        // Initialize StringBuilders
        for (int i = 0; i < 7; i++) {
            bannerLines[i] = new StringBuilder();
        }

        // Build banner line by line
        for (char ch : text.toCharArray()) {

            for (CharacterPatternMap cp : patterns) {

                if (cp.getCharacter() == ch) {

                    String[] pattern = cp.getPattern();

                    for (int i = 0; i < 7; i++) {
                        bannerLines[i].append(pattern[i]).append("  ");
                    }
                }
            }
        }

        // Print final banner
        for (int i = 0; i < 7; i++) {
            System.out.println(bannerLines[i]);
        }
    }

    /**
     * Main Method
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
                "*****  ",
                "*    * ",
                "*    * ",
                "*****  ",
                "*      ",
                "*      ",
                "*      "
        };

        // Pattern for S
        String[] sPattern = {
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        };

        // Creating objects
        CharacterPatternMap o = new CharacterPatternMap('O', oPattern);
        CharacterPatternMap p = new CharacterPatternMap('P', pPattern);
        CharacterPatternMap s = new CharacterPatternMap('S', sPattern);

        // Array of objects
        CharacterPatternMap[] patterns = { o, p, s };

        // Print Banner
        printBanner("OOPS", patterns);
    }
}