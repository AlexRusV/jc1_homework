package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Task_41 {
    public static void main(String[] args)
    {
        int numbers = 10;
        ArrayList<Integer> mark = new ArrayList<>();
        for (int i = 0; i < numbers; i++)
        {
            int x = (int)(Math.random() * 10 + 1);
            int y = Integer.valueOf(x);
            mark.add(i, y);
        }

        System.out.println(mark);
        System.out.println(Collections.max(mark) + " - самая высокая оценка");
    }
}
