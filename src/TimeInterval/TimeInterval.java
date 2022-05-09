package TimeInterval;

public class TimeInterval {

    public static void printTime(Time time) {
        System.out.println(time.getName() + ":");
        System.out.println("time = " + time);
        System.out.println("seconds = " + time.getShareSeconds() + "s");
    }
}

class Time {
    private final String name;
    private final int hours;
    private final int minutes;
    private final int seconds;

    public String getName() {
        return name;
    }

    public Time(String name, int hours, int minutes, int seconds) {
        this.name = name;
        this.hours = Math.abs(hours) % 24;
        this.minutes = Math.abs(minutes) % 60;
        this.seconds = Math.abs(seconds) % 60;
    }

    public int getShareSeconds() {
        return this.hours * 3600 + this.minutes * 60 + seconds;
    }

    public String toString() {
        return String.format("%dh %dm %ds", this.hours, this.minutes, this.seconds);
    }

    public String compareTo(Time t) {
        String result;
        if (t != null) {
            int firstObj = getShareSeconds();
            int otherObj = t.getShareSeconds();
            result = String.format("%s %s %s", getName(), firstObj == otherObj ? "==" : firstObj > otherObj ? ">" : "<", t.getName());
        } else {
            result = "Input object == null";
        }
        return result;
    }
}
