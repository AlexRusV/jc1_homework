package homework1503;

public class task_13 {
    public static void main(String[] args) {
        int mul = 1;
        int x = 1;
        do {
            mul *= x;
            x++;
        }
        while (x <= 25);
        System.out.println("Произведение = " + mul);
    }
}
