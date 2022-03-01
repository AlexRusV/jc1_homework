public class task_11 {
    public static void main(String[] args) {
        int n = 5;
        switch (n) {
            case 1:
                System.out.println("Понедельник");
                System.out.println("С 9:00 до 17:30 работа, вечер - дома");
                break;
            case 2:
                System.out.println("Вторник");
                System.out.println("С 9:00 до 17:30 работа, после курсы, вечер - дома");
                break;
            case 3:
                System.out.println("Среда");
                System.out.println("С 9:00 до 17:30 работа, после тренировка, дом");
                break;
            case 4:
                System.out.println("Четверг");
                System.out.println("С 9:00 до 17:30 работа, после курсы, дом");
                break;
            case 5:
                System.out.println("Пятница");
                System.out.println("С 9:00 до 17:30 работа, вечер - дома");
                break;
            case 6:
                System.out.println("Суббота");
                System.out.println("Поездка за город");
                break;
            case 7:
                System.out.println("Воскресенье");
                System.out.println("Возвращение в Минск");
                break;
            default:
                System.out.println("Дня с таким номером не существует");
        }
    }
}
