package Generics;

import java.util.Scanner;

public class Task_36 {
    static Seasons getNextSeason(int x) {
        if (x<1 || x>4)
            return null;
        int length = Seasons.values().length;
        x -= 1;
        if (x >= length)
            return null;
        x++;
        if (x >= length)
            x=0;
        return Seasons.values()[x];
    }
    public static void main(String[] args) {
        System.out.println(Seasons.WINTER + " - 1");
        System.out.println(Seasons.SPRING + " - 2");
        System.out.println(Seasons.SUMMER + " - 3");
        System.out.println(Seasons.AUTUMN + " - 4");

        Seasons str = getNextSeason(Data());
        System.out.println((str!=null?str.toString():"Error"));
    }

    private static int Data() {
        Scanner scanner = new Scanner(System.in);
        String number = "[1-4]{1}";
        int data = -1;
        for (;;) {
            if (scanner.hasNext(number)) {
                data = scanner.nextInt();
                break;
            }
            scanner.nextLine();
        }
        return data;
    }
}

enum Seasons {
    WINTER, SPRING, SUMMER, AUTUMN
}


