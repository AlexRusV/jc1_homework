import java.util.Scanner;

public class task_10 {
    public static void main(String[] args) {
        boolean area;
        System.out.println("Введите размеры дома 1:");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println("Введите размеры дома 2:");
        int c = scan.nextInt();
        int d = scan.nextInt();
        System.out.println("Введите размеры участка:");
        int e = scan.nextInt();
        int f = scan.nextInt();

        int width1; int length1;
        int width2; int length2;
        int width3; int length3;
        if (a > b) {
            length1 = a;
            width1 = b;
        } else {
            length1 = b;
            width1 = a;
        }
        if (c > d) {
            length2 = c;
            width2 = d;
        } else {
            length2 = d;
            width2 = c;
        }
        if (e > f) {
            length3 = e;
            width3 = f;
        } else {
            length3 = f;
            width3 = e;
        }
        if (width1 + width2 <= width3) {
            if (length1 <= length3 && length2 <= length3) {
                area = true;
            } else area = false;
        } else
        if (length1 + length2 <= length3) {
            if (width1 <= width3 && width2 <= width3) {
                area = true;
            } else area = false;
        } else area = false;
        if (area) {
            System.out.println("Два дома помещаются на участке");
        } else System.out.println("Два дома не помещаются на участке");
    }
}

