public class StandardShipping implements ShippingVisitor {
    @Override
    public void visit(Table table) {
        double cost = table.getWeight() * 20;
        printShippingDetails("Modern Table", table.getPrice(), cost);
    }

    @Override
    public void visit(Sofa sofa) {
        double cost = sofa.getVolume() * 30;
        printShippingDetails("Modern Sofa", sofa.getPrice(), cost);
    }

    @Override
    public void visit(Shelf shelf) {
        double cost = 50;
        printShippingDetails("Bookshelf", shelf.getPrice(), cost);
    }

    private void printShippingDetails(String item, double basePrice, double shippingCost) {
        System.out.println();
        System.out.println("Item: " + item);
        System.out.printf("Base Price: ₱%.2f\n", basePrice);
        System.out.printf("Shipping Cost: ₱%.2f\n", shippingCost);
        System.out.printf("Total Cost: ₱%.2f\n", (basePrice + shippingCost));
    }
}