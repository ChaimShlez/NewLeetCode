public class Main {
    public static void main(String[] args) {
        String str="hello woreeld";
      int length= lengthOfLastWord(str);
        System.out.println(length);
    }

    private static int lengthOfLastWord(String str) {
        int length=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                length++;
            }

            else {
                length=0;
            }
        }
        return length;
    }
}
