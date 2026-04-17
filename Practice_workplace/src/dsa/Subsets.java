package dsa;

public class Subsets {

    static void generate(String str, String ans, int index) {

        if (index == str.length()) {
            System.out.println(ans);
            return;
        }

        // include
        generate(str, ans + str.charAt(index), index + 1);

        // exclude
        generate(str, ans, index + 1);
    }

    public static void main(String[] args) {
        generate("abc", "", 0);
    }
}