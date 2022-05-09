package Collections;

import java.util.ArrayList;

public class Task_39 {
    public static void main(String[] args)
    {
        int numbers = 10;
        int negative = 3;
        ArrayList<Integer> mark = new ArrayList<>();
        for (int i = 0; i < numbers; i++)
        {
            int x = (int)(Math.random() * 10 + 1);
            int y = Integer.valueOf(x);
            mark.add(i, y);
        }

        System.out.println(mark);
        mark.removeIf(integer -> integer <= negative);
        System.out.println(mark);
    }
}
