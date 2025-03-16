public class Shelf implements Visitor {
    private double price;

    public Shelf(double price) {
        this.price = price;
    }

    public double getPrice() { return price; }

    @Override
    public void accept(ShippingVisitor visitor) {
        visitor.visit(this);
    }
}