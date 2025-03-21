public class Table implements Visitor {
    private double price;
    private double weight;

    public Table(double price, double weight) {
        this.price = price;
        this.weight = weight;
    }

    public double getPrice() { return price; }
    public double getWeight() { return weight; }

    @Override
    public void accept(ShippingVisitor visitor) {
        visitor.visit(this);
    }
}