import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String[] strAr = {"Ani", "Ani", "Ani"};
        System.out.println(Arrays.toString(strAr));
       String str= commonPrefix(strAr);
        System.out.println(str);
    }

    private static String commonPrefix(String[] strAr) {
       // StringBuilder ans = new StringBuilder();
       Set<String> ans = new HashSet<>();

        for (int i = 0; i < strAr.length-1; i++) {
            String x = strAr[i];
            String z = strAr[i + 1];

            for (int j = 0; j < x.length(); j++) {
                if (z.charAt(j) != x.charAt(j)) {
                    return "";
                }
                else {
                    ans.add(String.valueOf(z.charAt(j)));
                }
            }
        }
     return ans.toString();

    }
}
