public class Main {
    public static void main(String[] args) {
        int num =124;

        System.out.println(
                isPalindrome(num));
    }

    private static boolean isPalindrome(int num) {
        int temp=num;
        int revers=0;

        while (num>0){
            int rightDigit=num%10;
            revers=revers*10+rightDigit;
            num=num/10;
        }
        if (temp==revers){
            return true;
        }
        return false;

    }
}
