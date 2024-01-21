import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
         Integer [] arr={1,2,3,1,5};
         int value=1;
         int amountOfElement=removeElement(arr,value);
        System.out.println(amountOfElement);
    }

    private static int removeElement(Integer[] arr, int value) {
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != value ){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }

        return i;

    }

}
