/**
 * OOPSBannerApp
 *
 * UC3: Render OOPS as Banner using String.join()
 *
 * This program prints "OOPS" in a 7x9 banner format using
 * String.join() for better efficiency and readability.
 *
 * @author Suyash
 * @version 3.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        // Line 1
        System.out.println(String.join("",
                "  *****   ",
                "  *****   ",
                " ******   ",
                "  ******  "));

        // Line 2
        System.out.println(String.join("",
                " *     *  ",
                " *     *  ",
                " *     *  ",
                " *        "));

        // Line 3
        System.out.println(String.join("",
                "*       * ",
                "*       * ",
                "*       * ",
                "*         "));

        // Line 4
        System.out.println(String.join("",
                "*       * ",
                "*       * ",
                " ******   ",
                " *****    "));

        // Line 5
        System.out.println(String.join("",
                "*       * ",
                "*       * ",
                " *        ",
                "      *   "));

        // Line 6
        System.out.println(String.join("",
                " *     *  ",
                " *     *  ",
                " *        ",
                " *    *   "));

        // Line 7
        System.out.println(String.join("",
                "  *****   ",
                "  *****   ",
                " *        ",
                "  ****    "));
    }
}
