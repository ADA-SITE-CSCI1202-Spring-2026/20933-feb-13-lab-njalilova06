package week03.invoice;

public class InvoiceTest {

    public static void main(String[] args) {

        Invoice invoice1 = new Invoice("N313", "BMW", 2,200000.50 );

        System.out.println("Part Number: " + invoice1.getPartNumber());
        System.out.println("Description: " + invoice1.getPartDescription());
        System.out.println("Quantity: " + invoice1.getQuantity());
        System.out.println("Price per Item: " + invoice1.getPricePerItem());

        invoice1.setQuantity(8);
        invoice1.setPricePerItem(23000.99);

        System.out.println("\nUpdating values:");
        System.out.println("Quantity: " + invoice1.getQuantity());
        System.out.println("Price per Item: " + invoice1.getPricePerItem());
    }
}

