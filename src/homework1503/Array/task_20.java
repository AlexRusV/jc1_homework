package homework1503.Array;

public class task_20 {
    public static void main(String[] args) {
        int i[] = new int[10];
        int maxElement = i[0];
        for (int j=0; j<i.length; j++) {
            i[j] = (int) (Math.random() * 10 + 1); {
                for (j=0; j<i.length; j++) {
                    if (maxElement < i[j]) {
                        maxElement = i[j];
                    }
                }
            }
        }
        System.out.println("Максимальный элемент = " + maxElement);
    }
}
