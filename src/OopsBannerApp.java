import java.util.HashMap;
import java.util.Map;

public class OopsBannerApp {

    static Map<Character, String[]> patterns = new HashMap<>();

    static void initializePatterns() {

        patterns.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patterns.put('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        patterns.put('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });
    }

    static void renderBanner(String word) {

        for (int i = 0; i < 7; i++) {
            for (char c : word.toCharArray()) {
                System.out.print(patterns.get(c)[i] + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        initializePatterns();

        renderBanner("OOPS");
    }
}