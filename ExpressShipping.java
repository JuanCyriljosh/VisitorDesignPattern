public class ExpressShipping implements ShippingVisitor {
    @Override
    public void visit(Table table) {
        double cost = table.getWeight() * 40;
        printShippingDetails("Gaming Table", table.getPrice(), cost);
    }

    @Override
    public void visit(Sofa sofa) {
        double cost = sofa.getVolume() * 60;
        printShippingDetails("Reversible Sofa", sofa.getPrice(), cost);
    }

    @Override
    public void visit(Shelf shelf) {
        double cost = 100;
        printShippingDetails("Wall Mounted Shelf", shelf.getPrice(), cost);
    }

    private void printShippingDetails(String item, double basePrice, double shippingCost) {
        System.out.println();
        System.out.println("Item: " + item);
        System.out.printf("Base Price: ₱%.2f\n", basePrice);
        System.out.printf("Shipping Cost: ₱%.2f\n", shippingCost);
        System.out.printf("Total Cost: ₱%.2f\n", (basePrice + shippingCost));
    }
}