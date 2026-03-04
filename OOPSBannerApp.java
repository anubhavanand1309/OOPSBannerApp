import java.util.HashMap;
import java.util.Map;

/**
 * OOPS Banner App
 * UC8: Use HashMap for Character Patterns
 *
 * This implementation uses Java Collections Framework
 * to store and retrieve character banner patterns efficiently.
 */
public class OOPSBannerApp {

    /**
     * Builds and returns a HashMap containing
     * character-to-pattern mappings.
     *
     * @return Map of character and its 7-line banner pattern
     */
    public static Map<Character, String[]> buildCharacterPatterns() {

        Map<Character, String[]> patternMap = new HashMap<>();

        // Pattern for O
        patternMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        // Pattern for P
        patternMap.put('P', new String[]{
                "*****  ",
                "*    * ",
                "*    * ",
                "*****  ",
                "*      ",
                "*      ",
                "*      "
        });

        // Pattern for S
        patternMap.put('S', new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        });

        return patternMap;
    }

    /**
     * Renders the banner message using stored patterns.
     *
     * @param message    Word to print (OOPS)
     * @param patternMap Map containing character patterns
     */
    public static void renderBanner(String message, Map<Character, String[]> patternMap) {

        StringBuilder[] bannerLines = new StringBuilder[7];

        // Initialize StringBuilder for 7 rows
        for (int i = 0; i < 7; i++) {
            bannerLines[i] = new StringBuilder();
        }

        // Outer loop -> each character in word
        for (char ch : message.toCharArray()) {

            String[] pattern = patternMap.get(ch);

            if (pattern != null) {

                // Inner loop -> each row
                for (int i = 0; i < 7; i++) {
                    bannerLines[i].append(pattern[i]).append("  ");
                }
            }
        }

        // Print banner
        for (int i = 0; i < 7; i++) {
            System.out.println(bannerLines[i]);
        }
    }

    /**
     * Main Method
     */
    public static void main(String[] args) {

        // Build pattern map
        Map<Character, String[]> patternMap = buildCharacterPatterns();

        // Render OOPS banner
        renderBanner("OOPS", patternMap);
    }
}