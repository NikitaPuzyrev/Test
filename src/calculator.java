import java.io.IOException;
import java.util.Scanner;


public class calculator {

    public static void main(String[] args) throws IOException {


        Scanner in = new Scanner(System.in);
        System.out.print("enter a task:");
        String a = in.nextLine();

        String[] strs = a.split(" ");
        int l = strs.length;
        if (l != 3) {
            throw new IOException("wrong format input");
        }

        if (a.charAt(0) == '"') {
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
        } else {
            throw new IOException("wrong format input");
        }
    }

    public static String decor(String res) {
        int lam = res.length();
        if (lam < 40) {
            System.out.println("\"" + res + "\"");
        } else {
            System.out.println("\"" + res.substring(0, 39) + "..." + "\"");
        }
        return "" ;
    }
}

