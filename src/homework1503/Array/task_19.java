package homework1503.Array;

public class task_19 {
    public static void main(String[] args) {
        int i = 10;
        int x[] = {1, 2, 4, 5, 9, 3, 6, 8, 0, 7};
        int j;
        for (j=0; j<i; j++) {
            x[j] = (int) (Math.random()*10 + 1);
            if (j%2 == 0) {
                System.out.println("Элемент массива №" + j + " = " + x[j]);
            }
        }
    }
}
