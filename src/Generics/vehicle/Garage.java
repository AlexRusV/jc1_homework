package Generics.vehicle;

public class Garage <T extends Vehicle> {
    private T transport;

    public T getTransport() {
        return transport;
    }

    public void setTransport(T transport) {
        this.transport = transport;
    }
}
