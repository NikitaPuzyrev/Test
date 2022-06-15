import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class calculator {

    public static void main(String[] args) throws IOException {


        Scanner in = new Scanner(System.in);
        System.out.print("enter a task:");
        String a1 = in.nextLine();
        String a = InputTest(a1);


        String[] strings = a.split("\"");
        String sa = strings[1];

        int sr = strings.length;

        if (sr == 3) {
            String sb = strings[2];
            System.out.println(decor(Mult_str.mult_str(sa, sb)));
        } else if (sr == 4) {
            String sb = strings[3];
            String ms = strings[2];
            System.out.println(decor(Sum_str.sum_str(sa, ms, sb)));
        }
    }

    public static String decor(String res) {
        int lam = res.length();
        if (lam < 40) {
            System.out.println("\"" + res + "\"");
        } else {
            System.out.println("\"" + res.substring(0, 39) + "..." + "\"");
        }
        return "";
    }

    public static String InputTest(String data) {
        Scanner DS = new Scanner(data);

        char s2_0 = data.charAt(0);
        if (s2_0 != '\"') {
            System.out.println("wrong format input  49");
            System.exit(49);
        } else {
            List<String> msys = Arrays.asList("\" +", "\" -", "\" *", "\" /");
            int i = 0;
            do {
                if (fms(data, msys.get(i)) == false) {
                    i += 1;
                } else {
                    i = 4;
                    return data;
                }
            } while (i < 4);
            System.out.println("wrong format input  65");
            System.exit(65);
        }
        return data;
    }

    public static boolean fms(String data, String ms) {
        Pattern mfs = Pattern.compile(ms);
        System.out.println(mfs);
        System.out.println(data);
        Matcher matcher = mfs.matcher(data);
        boolean m = matcher.find();
        System.out.println(m);
        return m;

    }
}
