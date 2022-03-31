package homework1503;

public class task_15 {
    public static void main(String[] args) {
        boolean second = false;
        boolean x = true;
        int i;
        int j;
        for (i = 50; i <= 70; i++) {
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    x = false;
                    break;
                }
            }
            if (x) {
                if (second) {
                    System.out.println(i);
                    break;
                }
                second = true;
            }
            else x = true;
        }
    }
}