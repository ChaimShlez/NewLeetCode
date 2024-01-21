public class Main {
    public static void main(String[] args) {
        int num =8;
        int sqrt=calcSqrt(num);
        System.out.println(sqrt);
    }

    private static int calcSqrt(int x) {
//        int number=0;
//        number= (int) Math.sqrt(num);
//        return number;
        if (x == 0 || x == 1)
            return x;

        int start = 1;
        int end = x;
        int mid = -1;

        while (start <= end) {

            mid = start + (end - start) / 2;

            if ((long) mid * mid > (long) x)
                end = mid - 1;
            else if (mid * mid == x)

                return mid;
            else

                start = mid + 1;
        }
        return Math.round(end);
    }
}
