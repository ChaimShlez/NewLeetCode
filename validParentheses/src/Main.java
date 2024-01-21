public class Main {
    public static void main(String[] args) {
          String str =")hello())";


        System.out.println(calc(str));
    }

    private static boolean calc(String str) {
        int sum=0;
        char targetLeft = '(';
        char targetRight = ')';
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==targetLeft){
                sum++;
            }
            else if(str.charAt(i)==targetRight){
                sum--;
            }
            if (sum<0){
                return false;
            }
        }
        if (sum != 0){
            return false;
        }
      return true;
    }
}
