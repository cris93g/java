package exercise2;

import java.util.*;

public class Colors {

    List<String> colorful(String[] strings) {
        String[] color = new String[] { "red", "yellow", "green", "blue", "black", "white", "pink", "cyan", "orange",
                "teal", "gray", "brown", "purple" };
        List<String> myList = new ArrayList<String>();
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < color.length; j++) {
                if (strings[i].contains(color[i])) {
                    System.out.println(strings[i]);
                    myList.add(strings[i]);
                }
            }
        }
        return myList;
    }

    public static void main(String[] args) {
        Colors code = new Colors();
        code.colorful(new String[] { "bluebird", "red herring", "yellow bumblebee", "black spider", "green monkey",
                "pink", "great gatsby", "feeding frenzy", "black bird", "widowmaker", "quran", "bible", "torah" });
        System.out.println("This is the Colors class");
    }

}