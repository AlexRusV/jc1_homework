package homework1503.Array;

public class task_18 {
    public static void main(String[] args) {
        int i[] = new int[10];
        for (int j=0; j<i.length; j++) {
            i[j] = (int) (Math.random()*10 + 1);
            if (j > 8) {
                System.out.println("Элемент массива №" + j + " = " + i[j]);
            }
        }
    }
}

