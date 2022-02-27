public class task_5 {
        public static void main(String[] args) {
            int s = 1213450;
            int sec = s % 60;
            int m = s / 60;
            int min = m % 60;
            int h = m / 60;
            int hours = h % 24;
            int d = h / 24;
            int days = d % 24;
            int w = d / 7;
            System.out.println(w + " недели " + days + " дней " + hours + " час " + min + " минуты " + sec + " секунд");
        }
    }
