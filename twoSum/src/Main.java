public class Main {
    public static void main(String[] args) {
        int[] num={1,2,3,4};
        int target=3;


        int[]sum=calcSum(num,target);
     //   System.out.println(sum);
        for (int i = 0; i < sum.length; i++) {
            System.out.println(sum[i]);
        }
    }

    private static int[] calcSum(int[] num, int target) {

        for (int i = 0; i < num.length ; i++) {
            for (int j = 0; j < num.length ; j++) {
                if (num[i] +num[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}
