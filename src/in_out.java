import java.io.IOException;
import java.util.Scanner;

public class in_out {
    public static String[] incalc() throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("run");
        String data = in.nextLine();
        String[] datas = data.split("\"");
        char s2_0 = data.charAt(0);
        if (s2_0 != '\"') {
            throw new IOException("wrong format input 1st char != \"");
        }

        if (datas[1].length() > 10 || (data.length() - datas[1].length()) > 17) {
            throw new IOException("wrong format input l > 10");
        }

        String[] Incalc = new String[4];
        Incalc[1] = (" ");
        Incalc[0] = datas[1];

        if (datas.length == 4 && (datas[2].equals(" + ") || datas[2].equals(" - "))) {
            Incalc[1] = datas[3];
            Incalc[3] = datas[2];
            return Incalc;
        }
        if (datas.length == 3 && (datas[2].charAt(1) == ('*') || datas[2].charAt(1) == ('/'))) {
            Incalc[2] = datas[2].substring(3);
            Incalc[3] = (" " + datas[2].charAt(1) + " ");
            return Incalc;
        } else {
            throw new IOException("wrong format input T 27");
        }

    }
}


