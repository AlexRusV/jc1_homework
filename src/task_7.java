public class task_7 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int r = 4; //радиус заданной окружности
        double radius = Math.sqrt((double)(a*a)+(double)(b*b))/2; //радиус описанной окружности в прямоугольник
        if (r>=radius){
            System.out.println("Картонка полностью закрывает отверстие");
        }
        else
            System.out.println("Картонка не закрывает отверстие");
    }
}
