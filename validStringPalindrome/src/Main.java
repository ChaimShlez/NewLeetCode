public class Main {
    public static void main(String[] args) {

        String s ="apwesapa";
        boolean isPalindrome=validPalindrome(s);
        System.out.println(isPalindrome);

    }

    private static boolean validPalindrome(String s) {
        String op =   s.replaceAll("\\s", "");
        String reversedString="";

        for (int i = op.length()-1; i >=0; i--) {
            char ch = op.charAt(i);
            reversedString += ch;
        }
        return op.equals(reversedString);
    }

}
