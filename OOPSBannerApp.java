/**
 * OOPS Banner App
 * UC6: Refactor Banner Logic into Functions
 * @author Anubhav
 * @version 6.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] banner = {
                String.join(" ", getO()[0], getO()[0], getP()[0], getS()[0]),
                String.join(" ", getO()[1], getO()[1], getP()[1], getS()[1]),
                String.join(" ", getO()[2], getO()[2], getP()[2], getS()[2]),
                String.join(" ", getO()[3], getO()[3], getP()[3], getS()[3]),
                String.join(" ", getO()[4], getO()[4], getP()[4], getS()[4]),
                String.join(" ", getO()[5], getO()[5], getP()[5], getS()[5]),
                String.join(" ", getO()[6], getO()[6], getP()[6], getS()[6])
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Method to build O pattern
    public static String[] getO() {
        return new String[]{
                " *****  ",
                "*     * ",
                "*     * ",
                "*     * ",
                "*     * ",
                "*     * ",
                " *****  "
        };
    }

    // Method to build P pattern
    public static String[] getP() {
        return new String[]{
                " ****** ",
                "*     * ",
                "*     * ",
                "******  ",
                "*       ",
                "*       ",
                "*       "
        };
    }

    // Method to build S pattern
    public static String[] getS() {
        return new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        };
    }
}