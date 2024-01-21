public class Main {
    public static void main(String[] args) {
        int [] arr={7,1,5,6};
        int max=maxProfit(arr);
        System.out.println(max);



    }

    private static int maxProfit(int[] arr) {
        int min=0;

        int maxProfit=0;
        int currentProfit=0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j <arr.length; j++) {
                if (arr[i]<arr[j]){
                    currentProfit=arr[j]-arr[i];
                    
                    if (maxProfit<currentProfit){
                        maxProfit=currentProfit;
                    }
                }

            }

        }
        return maxProfit;
    }
}
