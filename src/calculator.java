import java.io.IOException;
import java.util.Scanner;


public class calculator {

    public static void main(String[] args) throws IOException {


        Scanner in = new Scanner(System.in);
        System.out.print("enter a task:");
        String a = in.nextLine();

        String[] strings = a.split("\"");
        String sa = TestIn.InputTest(a, strings );

        int sr = strings.length;

        if (sr == 3) {
            String sb = strings[2];
            decor(Mult_str.mult_str(sa, sb));
        } else if (sr == 4) {
            String sb = strings[3];

            String ms = strings[2];
            decor(Sum_str.sum_str(sa, ms, sb));
        }
    }
    public static void decor(String res) {
        int lam = res.length();
        if (lam < 40) {
            System.out.println("\"" + res + "\"");
        } else {
            System.out.println("\"" + res.substring(0, 39) + "..." + "\"");
        }
    }
}
