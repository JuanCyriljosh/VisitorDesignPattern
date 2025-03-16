public interface ShippingVisitor {
    void visit(Table table);
    void visit(Sofa sofa);
    void visit(Shelf shelf);
}