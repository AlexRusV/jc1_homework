public class task_8 {
    public static void main(String[] args) {
        int x = 30;
        int y = x%10;
        int z = (x%100)/10;
        if (z==1) {
            System.out.println(x + " рублей");
        }
        else if (y>=5||y==0){
            System.out.println(x + " рублей");
        }
        else if (y==1) {
            System.out.println(x + " рубль");
        }
        else if (y==2||y==3||y==4||z>=2){
            System.out.println(x + " рубля");
        }
    }
}
