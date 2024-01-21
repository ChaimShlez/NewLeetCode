import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] num1 = {1, 2, 3, 4, 4};
        int[] num2 = {2, 3, 4, 5};
        int lengthNum1 = num1.length;
        int lengthNum2 = num2.length;
        int[] newArray = mergeArrays(num1, lengthNum1, num2, lengthNum2);

        System.out.println(Arrays.toString(newArray));
    }

    private static int[] mergeArrays(int[] num1, int lengthNum1, int[] num2, int lengthNum2) {

        //  option1
//        int r =0;
//        int y=0;
//        int [] newArray=new int[lengthNum1+lengthNum2];
//        for (int i = 0; i < newArray.length; i++) {
//            if (r<lengthNum1 && y<lengthNum2){
//                if (num1[r]>num2[y]){
//                    newArray[i]=num2[y];
//                    y++;
//                }
//                else {
//                    newArray[i]=num1[r];
//                    r++;
//                }
//            } else if (r==lengthNum1) {
//                newArray[i]=num2[y];
//                y++;
//            }
//            else {
//                newArray[i]=num1[r];
//                r++;
//            }
//        }
//        return newArray;
//        option 2
        Map<Integer, Integer> marge = new HashMap<>();

        insertToMap(num2, marge);
        insertToMap(num1, marge);
        int[] unionArray = updateNewArray(marge, num2, num1);


        return unionArray ;
    }


    private static int[] updateNewArray(Map<Integer, Integer> marge, int[] num2, int[] num1) {
        int[] unionArray = new int[num1.length + num2.length];

        int unionArrayIndex = 0;
        for (Integer i : marge.keySet()) {
            Integer amountOfDigits = marge.get(i);
            while (amountOfDigits >= 1) {
                unionArray[unionArrayIndex] = i;
                unionArrayIndex++;
                marge.put(i, amountOfDigits--);
            }
        }
        return unionArray;
    }


    private static void insertToMap(int[] num, Map<Integer, Integer> marge) {

        for (int i = 0; i < num.length; i++) {
            Integer amountOfNum = marge.get(num[i]);
            if (amountOfNum == null) {
                marge.put(num[i], 1);
            } else {
                amountOfNum++;
                marge.put(num[i], amountOfNum);
            }
        }
        System.out.println(marge);
    }
}

