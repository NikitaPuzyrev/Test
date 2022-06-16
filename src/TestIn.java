import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestIn {
    public static String InputTest(String a, String[] datas) throws IOException {
        if (datas[1].length() > 10 || (a.length() - datas[1].length()) > 17) {
            throw new IOException("wrong format input l > 10");
        }

        char s2_0 = a.charAt(0);
        if (s2_0 != '\"') {
            System.out.println("wrong format input  T 15");
            System.exit(49);
        }
        if ((datas.length == 4 && datas[2].equals(" + ") || datas[2].equals(" - ")) ||
                (datas.length == 3 && datas[2].charAt(1) == '*' || datas[2].charAt(1) == '/')) {
            return datas[1];
        } else {
            throw new IOException("wrong format input T 22");
        }
    }
}
