package Task_32_33_34.appliances;

public class WashingMachine implements PowerCord {
    private final int turns;
    private final int weight;
    public WashingMachine(int turns, int weight) {
        this.turns = turns;
        this.weight = weight;
    }
    @Override
    public void connectToSocket() {
        System.out.println("Стиральная машина подключена к розетке: " + turns + " об/мин " + ", " + weight + " кг ");
    }
}
