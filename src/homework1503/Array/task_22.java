package homework1503.Array;

public class task_22 {
    public static void main(String[] args) {
        int x[] = new int[10];
        System.out.println("Первоначальный массив:");
        for (int j=0; j<10; j++)
        {
            x[j]=(int)(Math.random()*10+1);
            System.out.print(" " + x[j]);
        }
        for (int j=0; j<10/2; j++)
        {
            int i = x[j];
           x[j] = x[10-1-j];
           x[10-1-j]=i;
        }
        System.out.println("\n");
        System.out.println("Перевернутый массив:");
        for (int j = 0; j<10; j++)
        {
            System.out.print(" " + x[j]);
        }
    }
}

