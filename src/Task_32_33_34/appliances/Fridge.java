package Task_32_33_34.appliances;

public class Fridge implements PowerCord {
    private final int power;
    private final int height;
    public Fridge(int power, int height) {
        this.power = power;
        this.height = height;
    }

    @Override
    public void connectToSocket() {
        System.out.println("Холодильник подключен к розетке: " + power + " Вт/час " + ", " + height + " м ");
    }
}
