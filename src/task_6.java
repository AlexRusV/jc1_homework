public class task_6 {
    static boolean task6(int x){
        return x%10==7;
    }
    public static void main(String[] args) {
        int x = 1234756;
        if(x % 10 == 7)
            System.out.println("Последняя цифра числа " + x + " - семерка.");
        else
            System.out.println("Последняя цифра числа " + x + " - не семерка.");
    }
}
