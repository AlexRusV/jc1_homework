package homework1503;

public class task_14 {
    public static void main(String[] args) {
        long result = sum();
        System.out.println("Искомая сумма равна " + result);
    }
        public static long sum (){
            long sum = 0;
            long n = 7893823445L;
            do {
                sum = sum + (n % 10);
                n = n / 10;
            } while (n != 0);
            return sum;
    }
}



