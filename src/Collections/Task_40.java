package Collections;

import java.util.HashSet;

public class Task_40 {
    public static HashSet<Integer> createHashSet() {
        HashSet<Integer> integerHashSet = new HashSet<>();
        int x =10;

        for (int i = 0; i < 10; i++){
            double random = Math.random() * x;
            integerHashSet.add((int) random);
        }
        return integerHashSet;
    }

    public static void main(String[] args) {
        System.out.println(createHashSet());
    }
}
