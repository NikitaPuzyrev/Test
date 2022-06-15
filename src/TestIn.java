import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestIn {
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
                System.out.println("wrong format input  65");
                System.exit(65);
            } while (i < 4);

        }
        return data;
    }

    public static boolean fms(String data, String ms) {
        Pattern mfs = Pattern.compile(ms);
        Matcher matcher = mfs.matcher(data);
        boolean m = matcher.find();
        int r = matcher.start();
        return m;

    }

 /*   public static void LenControl(String sa, String sb) throws IOException {

        int lsa = sa.length();
        System.out.println(lsa);
        int lsb = 0;
        int b = 0;
        char s2_0 = sb.charAt(0);
        if (s2_0 != '\"') {
            String[] stringsb = sb.split(" ");
            String sbn = stringsb[2];
            b = Integer.valueOf(sbn);
        } else {
            lsb = sb.length();
            System.out.println(lsb);
        }
        if (lsa > 10 || lsb > 10 || b > 10) {
            throw new IOException("wrong format input");
        }
    }*/
}
