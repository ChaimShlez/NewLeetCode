public class Main {
    public static void main(String[] args) {
        String str1="leetcode";
        String str2 ="leet";


        System.out.println(findTheIndexOfTwoStrings(str1,str2));
    }

    private static int findTheIndexOfTwoStrings(String str1, String str2) {
        int min=0;
        if (str1.length() < str2.length()){
            min=str1.length();
        }
        else {
            min=str2.length();
        }
        for (int i = 0; i < min; i++) {
            if (str1.charAt(i)!=str2.charAt(i)){
                return -1;
            }

        }
        return 0;
    }
}
