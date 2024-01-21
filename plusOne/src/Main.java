import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr = {9,7,9};
        int[] newArr = plusOne(arr);
        System.out.println(Arrays.toString(newArr));
    }

    private static int[] plusOne(int[] arr) {
        int digit = 0;

        for (int i = 0; i < arr.length; i++) {
            digit = digit * 10 + arr[i];

        }
        digit = digit + 1;

        String numberString = Integer.toString(digit);
        int index = numberString.length();
        int[] array = new int[index];

        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = digit % 10;
            digit = digit / 10;
        }
        return array;
    }
}
