import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] array ={1,2,3,4,1};

        System.out.println(calcIsDuplicate(array));
    }

    private static boolean calcIsDuplicate(int[] array) {
        Map<Integer,Integer> duplicateNumber=new HashMap<>();
        insertToMap(array,duplicateNumber);
        for ( Integer i:duplicateNumber.keySet()){
            Integer amountOfDigits = duplicateNumber.get(i);
            if (amountOfDigits>1){
                return true;
            }
        }
        return false;

    }

    private static void insertToMap(int[] array, Map<Integer, Integer> duplicateNumber) {
        for (int i = 0; i < array.length; i++) {
            Integer amountOfNumber=duplicateNumber.get(array[i]);
            if (amountOfNumber==null){
                duplicateNumber.put(array[i],1);
            }
            else {
                amountOfNumber++;
                duplicateNumber.put(array[i],amountOfNumber);
            }

        }
    }
}
