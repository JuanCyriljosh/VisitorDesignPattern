public class FurnitureStore {
    public static void main(String[] args) {
        Visitor table = new Table(5000, 10);
        Visitor sofa = new Sofa(15000, 3);
        Visitor shelf = new Shelf(2000);

        ShippingVisitor standardShipping = new StandardShipping();
        ShippingVisitor expressShipping = new ExpressShipping();

        System.out.println("====================================");
        System.out.println("        SHIPPING COST SUMMARY       ");
        System.out.println("====================================\n");
        
        System.out.println("[Standard Shipping Costs]");
        table.accept(standardShipping);
        sofa.accept(standardShipping);
        shelf.accept(standardShipping);
        
        System.out.println("\n====================================\n");
        
        System.out.println("[Express Shipping Costs]");
        table.accept(expressShipping);
        sofa.accept(expressShipping);
        shelf.accept(expressShipping);
        
        System.out.println("====================================");
    }
}