package Exceptions;

public class Task_43 {
    public static void main(String[] args) {
        int x = 10;
        Integer y = null;
        try {
            x = y;
        }
        catch (NullPointerException exception) {
            System.out.println("Exception description: " + exception);
            exception.printStackTrace();
        }
    }
}
