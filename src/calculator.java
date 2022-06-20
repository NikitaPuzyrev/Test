import java.io.IOException;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) throws IOException {

        String[] strings = in_out.incalc();

        String sa =strings[0];
        if(strings[1].equals(" ")){
            String sb = strings[2];
            String ms = strings[3];
            decor(Mult_str.mult_str(sa, ms, sb));}
        else {
            String sb = strings[1];

            String ms = strings[3];
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