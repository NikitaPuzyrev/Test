import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



public class calculator {

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        System.out.print("enter a task:");
        String a = in.nextLine();
       // System.out.println(a.substring(0, 1));
        if(a.substring(0, 1).equals("\"") ) {

            String[] strings = a.split("\"");
            for (String string : strings) {
        }
            String sa = strings[1];

            int lsa = sa.length();
            int sr = strings.length;
            // System.out.println(sr);
            if (sr < 2 && sr > 4) {
                throw new IOException("wrong format input");
            }
            else if( sr == 3){
                String sb = strings[2];
            System.out.println(Mult_str.mult_str(sa, sb));
            }

            else if (sr == 4) {
                String sb = strings[3];
                String ms = strings[2];
                System.out.println(Sum_str.sum_str(sa, ms, sb));
            }
        }
        else {
            throw new IOException("wrong format input");
        }
       }
     }


