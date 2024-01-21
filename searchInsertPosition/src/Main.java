public class Main {
    public static void main(String[] args) {
        int [] array ={1,2,3,4,5,6};
        int target=1;
        searchInsertPosition(array,target);
    }

    private static void searchInsertPosition(int[] array, int target) {

        for (int i = 0; i < array.length; i++) {
            if (i+1==target){
                System.out.println(i);
            }
        }
    }
}
