public class WasteManagement {
    public static void main(String[] args) {
        WasteCollectionChain wasteCollection = new WasteCollectionChain();
        WasteContainer organicContainer = new WasteContainer("Organic", 30);
        WasteContainer recyclableContainer = new WasteContainer("Recyclable", 50);
        WasteContainer hazardousContainer = new WasteContainer("Hazardous", 15);

        wasteCollection.collect(organicContainer);
        wasteCollection.collect(recyclableContainer);
        wasteCollection.collect(hazardousContainer);
    }
}
