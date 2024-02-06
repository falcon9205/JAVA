import java.util.*;

public class example {
    public static void check(String in, String out) {
        if (in.length() == 0) {
            System.out.print(out + " ");
            return;
        }

    }

    public static void main(String[] args) {
        String in = "ab";
        String out = "";
        check(in, out);
    }
}