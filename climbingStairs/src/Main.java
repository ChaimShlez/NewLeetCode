public class Main {

    public static void main(String[] args) {

        int stairs=4;

      int amount=calcAmountOfSteps(stairs);
        System.out.println(amount);
    }


    private static int calcAmountOfSteps(int stairs) {
        if (stairs==1){
            return 1;
        }
        if (stairs==0){
            return 1;
        }

        return calcAmountOfSteps(stairs-1)+calcAmountOfSteps(stairs-2);
    }
}

