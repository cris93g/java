package exercise2;

import java.io.Console;

public class Statically {
    private static String glue = "Epoxy";
    public String jello = "Jello";
    private static Console console = System.console();

    public static void moveAndShake() {
        console.printf("Never stagnate in life.  Be agile, change, and improve...");
    }

    public static void stubborn() {
        Statically.moveAndShake();
        console.printf("Please don't make me change... I just don't like it...");
    }

    public static void explain() {
        Statically.stubborn();
        console.printf("%s $n", Statically.glue);
    }

    public String getGlue() {
        return Statically.glue;
    }

    public static void main(String[] args) {
        Statically stats = new Statically();
        Statically.moveAndShake();
        Statically.stubborn();
        Statically.explain();
        System.out.println(stats.getGlue());
        System.out.println(stats.jello);
    }
}