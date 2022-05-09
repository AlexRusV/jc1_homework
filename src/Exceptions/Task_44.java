package Exceptions;

public class Task_44 extends Exception {
    public Task_44() {
    }
}

class FullConstructors {
    public static void x() throws Task_44 {
        System.out.println("Throwing Task_44 from x()");
        throw new Task_44();
    }
    public static void y() throws Task_44 {
        System.out.println("Throwing Task_44 from y()");
        throw new Task_44();
    }
    public static void main(String[] args) {
        try {
            x();
        } catch(Task_44 e) {
            e.printStackTrace(System.err);
        }
        try {
            y();
        } catch(Task_44 e) {
            e.printStackTrace(System.err);
        }
    }
}

