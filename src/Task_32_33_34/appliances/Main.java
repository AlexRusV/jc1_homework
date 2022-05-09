package Task_32_33_34.appliances;

public class Main {
    public static void main(String[] args) {
        WashingMachine washingMachine = new WashingMachine(1000, 80);
        washingMachine.connectToSocket();
        Fridge fridge = new Fridge(100, 2);
        fridge.connectToSocket();
    }
}
