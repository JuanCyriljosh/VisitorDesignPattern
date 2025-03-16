public class Sofa implements Visitor {
    private double price;
    private double volume;

    public Sofa(double price, double volume) {
        this.price = price;
        this.volume = volume;
    }

    public double getPrice() { return price; }
    public double getVolume() { return volume; }

    @Override
    public void accept(ShippingVisitor visitor) {
        visitor.visit(this);
    }
}