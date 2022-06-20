import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Mult_str {
    public static String mult_str(String sa, String ms, String sb) throws IOException {

        String amul = "";

        List<String> numbers = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
        if (numbers.contains(sb)) {

            switch (ms) {
                case " * ":
                    int b = Integer.valueOf(sb);

                    int i = 0;
                    while (i < b) {
                        amul = amul.concat(sa);
                        i += 1;
                    }
                    break;
                case " / ":
                    int k1 = sa.length();
                    int k2 = k1 / Integer.valueOf(sb);
                    amul = sa.substring(0, k2);
                    break;
                default:
                    System.exit(38);
            }
        } else {
            throw new IOException("wrong format input m40");
        }
        return amul;
    }
}




