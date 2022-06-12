import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Mult_str {
    public static String mult_str(String sa, String sb) throws IOException {
        String[] stringsb = sb.split(" ");
        for (String element : stringsb) {
            //     System.out.println(stringsb[1]);
            //   System.out.println(stringsb[2] + "1");
        }
        String sbn = stringsb[2];
        int lsa = sa.length();
        String ms = stringsb[1];
        if (lsa > 10) {
            throw new IOException("wrong format input");
        }

        //  System.out.println(sbn);

        List<String> numbers = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
        if (numbers.contains(sbn)) {
            switch (ms) {
                case "*":
                    int b = Integer.valueOf(sbn);


                    //   String san = sa.substring(1, lsa - 1);
                    // System.out.println(san);
                    String amul = "";
                    int i = 0;
                    while (i < b) {
                        amul = amul.concat(sa);
                        i += 1;
                    }
                    int lam = amul.length();

                    if (lam < 40) {
                        return ("\"" + amul + "\"");
                    } else {
                        return ("\"" + amul.substring(0, 39) + "..." + "\"");
                    }

                case "/":
                    int k1 = sa.length();
                    int k2 = k1 / Integer.valueOf(sbn);
                    return ("\"" + sa.substring(0, k2) + "\"");


            }


        }


        return ("something is wrong");
    }
}




