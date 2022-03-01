public class task_8 {
    public static void main(String[] args) {
        int x = 3113;
        int y = x%10; //последняя цифра суммы
        int z = (x%100)/10; //предпоследняя цифра суммы
        if (y==1) {
            System.out.println(x + " рубль");
        }
        else if (y==2&&y==3&&y==4){
            System.out.println(x + " рубля");
        }
        else if (y==5&&y==6&&y==7&&y==8&&y==9&&y==0){
            System.out.println(x + " рублей");
        }
        else if (z==1){
            System.out.println(x + " рублей");
        }
    }
}
