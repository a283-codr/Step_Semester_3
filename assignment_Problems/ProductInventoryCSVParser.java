public class ProductInventoryCSVParser {

    public static void parseInventoryRecord(String csvLine) {

        String[] data = csvLine.split(",");

        if (data.length != 3) {
            System.out.println("Invalid Record");
            return;
        }

        String product = data[0];
        String sku = data[1];
        String quantity = data[2];

        System.out.println(
                "Product: " + product
                + " | SKU: " + sku
                + " | Qty: " + quantity
        );
    }

    public static void main(String[] args) {

        String inventoryRecord =
                "Wireless Mouse,WM-2201,150";

        parseInventoryRecord(inventoryRecord);
    }
}