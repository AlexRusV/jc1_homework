package TimeInterval;

import static TimeInterval.TimeInterval.printTime;

public class Main {
    public static void main(String[] args) {
        Time timeOne = new Time("One", 12, 24, 32);
        Time timeTwo = new Time("Two", 8, 32, 21);
        Time timeThree = new Time("Three", 3, 19, 10);

        printTime(timeOne);
        printTime(timeTwo);
        printTime(timeThree);

        System.out.println(timeOne.compareTo(timeTwo));
        System.out.println(timeOne.compareTo(timeThree));
        System.out.println(timeTwo.compareTo(timeThree));
    }
}
