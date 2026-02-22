/**
 * OOPS Banner App
 * UC5: Render OOPS as Banner using Inline Array Initialization
 * @author Anubhav
 * @version 5.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] banner = {
            String.join(" ", " *****  ", " *****  ", " ****** ", " ***** "),
            String.join(" ", "*     * ", "*     * ", "*     * ", "*     *"),
            String.join(" ", "*     * ", "*     * ", "*     * ", "*     *"),
            String.join(" ", "*     * ", "*     * ", "******  ", " ***** "),
            String.join(" ", "*     * ", "*     * ", "*       ", "      *"),
            String.join(" ", "*     * ", "*     * ", "*       ", "*     *"),
            String.join(" ", " *****  ", " *****  ", "*       ", " ***** ")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}