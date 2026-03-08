import java.util.*;

public class OOPSBannerApp {

    public static Map<Character, String[]> getCharacterPatterns() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        map.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        map.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        return map;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next().toUpperCase();

        Map<Character, String[]> patterns = getCharacterPatterns();

        for (int i = 0; i < 5; i++) {

            for (char c : text.toCharArray()) {

                if (patterns.containsKey(c)) {
                    System.out.print(patterns.get(c)[i] + "  ");
                }

            }

            System.out.println();
        }

        sc.close();
    }
}