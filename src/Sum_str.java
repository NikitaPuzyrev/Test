public class Sum_str {
    public static String sum_str(String sa, String ms, String sb) {

        int lsb = sb.length();
        int lsa = sa.length();
        switch (ms) {
            case " + ":
                return sa + sb;
            case " - ":
                if (lsa < lsb) {
                    return sa;
                } else if (sa.equals(sb)) {
                    return "strings are the same result null";
                }
                int k = sa.indexOf(sb);
                if (k != -1) {
                    return sa.substring(0, k) + sa.substring(k + lsb, lsa);
                } else {
                    return sa;
                }
            default:
                return "default";
        }
    }
}



