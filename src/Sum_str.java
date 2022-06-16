import java.io.IOException;

public class Sum_str {
    public static String sum_str(String sa, String ms, String sb) throws IOException {

        int lsb = sb.length();
        int lsa = sa.length();
        if (lsa > 10 || lsb > 10) {
            throw new IOException("wrong format input mult9");
        } else {
            String su = "";
            switch (ms) {
                case " + ":
                    su = sa + sb;
                    break;
                case " - ":
                    if (lsa < lsb) {
                        su = sa;
                        break;
                    } else if (sa.equals(sb)) {
                        su = "strings are the same result null";
                        break;
                    }
                    int k = sa.indexOf(sb);
                    if (k != -1) {
                        su = sa.substring(0, k) + sa.substring(k + lsb, lsa);
                        break;
                    } else {
                        su = sa;
                        break;
                    }
                default:
                    su = sa;
            }

            return su;
        }
    }

}

