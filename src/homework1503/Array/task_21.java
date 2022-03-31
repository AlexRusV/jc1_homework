package homework1503.Array;

public class task_21 {
    public static void main(String[] args) {
        int i[] = {9, 3, 9, 4, 7, 2, 5, 8, 0, 6};
        int iMax = 0;
        int iMin = 0;
        int max = i[0];
        int min = i[0];
        int s = 0;
        int sum = 0;
        for (int j = 0; j < i.length; j++) {
            if (i[j] > max) {
                iMax = j;
                max = i[j];
            } else if (i[j] < min) {
                iMin = j;
                min = i[j];
            }
            s = s + i[j];
        }
        for (int j = Math.min(iMin, iMax) + 1; j < Math.max(iMin, iMax); j++) {
            sum = sum + i[j];
        }
        System.out.println("Сумма элементов = " + sum);
    }
}