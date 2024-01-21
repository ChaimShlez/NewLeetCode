import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int [] array={1,2,3,1,2};
        int singleNumber=searchSingleNumber(array);
        System.out.println(singleNumber);
    }

    private static int searchSingleNumber(int[] array) {
        Map<Integer,Integer> insertToMap=new HashMap<>();
        insertMap(insertToMap,array);
       int single= searchNumber(insertToMap);
      return single;


    }

    private static int searchNumber(Map<Integer, Integer> insertToMap) {
        int single=0;
        for (Integer i : insertToMap.keySet()) {
            if (insertToMap.get(i)==1){
                single=i;
            }

        }
        return single;
    }

    private static void insertMap(Map<Integer, Integer> insertToMap, int[] array) {
        for (int i = 0; i < array.length; i++) {
            Integer amountOfNum = insertToMap.get(array[i]);
            if (amountOfNum == null) {
                insertToMap.put(array[i], 1);
            } else {
                amountOfNum++;
                insertToMap.put(array[i], amountOfNum);
            }
        }
    }
}
