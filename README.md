# VisitorDesignPattern

<p>You are a software developer working on an e-commerce platform that sells various types of furniture (chairs, tables, sofas, etc.). You want to implement a functionality that calculates the shipping cost based on the furniture type and size.

Each furniture type might have its own unique shipping cost calculation logic. For example, chairs might be lightweight and have a flat shipping rate, while sofas might be bulky and require a distance-based shipping cost calculation. Implementing separate shipping logic within each furniture class would lead to tight coupling and difficulty adding new furniture types in the future.

Implement a **visitor design pattern approach.** You must show the different elements of visitor design in your solution.  DO NOT USE ABSTRACT CLASSES. You are free to name your interfaces and concrete classes. Have a client code that will test your program.</p>

## UML Class Diagram:
![Blank diagram (6)](https://github.com/user-attachments/assets/633e88be-b6e1-469b-b8a3-e5241049a383)

## Output:

```java
====================================
        SHIPPING COST SUMMARY       
====================================

[Standard Shipping Costs]

Item: Modern Table
Base Price: ₱5000.00
Shipping Cost: ₱200.00
Total Cost: ₱5200.00

Item: Modern Sofa
Base Price: ₱15000.00
Shipping Cost: ₱90.00
Total Cost: ₱15090.00

Item: Bookshelf
Base Price: ₱2000.00
Shipping Cost: ₱50.00
Total Cost: ₱2050.00

====================================

[Express Shipping Costs]

Item: Gaming Table
Base Price: ₱5000.00
Shipping Cost: ₱400.00
Total Cost: ₱5400.00

Item: Reversible Sofa
Base Price: ₱15000.00
Shipping Cost: ₱180.00
Total Cost: ₱15180.00

Item: Wall Mounted Shelf
Base Price: ₱2000.00
Shipping Cost: ₱100.00
Total Cost: ₱2100.00
====================================
