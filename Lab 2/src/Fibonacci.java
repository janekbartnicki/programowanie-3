public class Fibonacci {
    public static void calculateFibonacci(int amount) {
        int prev_number = 0;
        int now_number = 1;

        if(amount == 0 || amount == 1) {
            System.out.println(amount);
        }

        while(prev_number + now_number <= amount) {
            int temp = now_number;
            now_number = now_number + prev_number;
            prev_number = temp;
        }

        System.out.println(prev_number + now_number);
    }


}
