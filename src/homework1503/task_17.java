package homework1503;

import java.text.NumberFormat;
import java.util.Scanner;

public class task_17 {
    public static void main(String[] args) {
        NumberFormat f = NumberFormat.getInstance();
        Scanner in = new Scanner((System.in));
        System.out.println("Введите целое число: ");
        int i = in.nextInt();
        System.out.println(f.format(i));
    }
}
