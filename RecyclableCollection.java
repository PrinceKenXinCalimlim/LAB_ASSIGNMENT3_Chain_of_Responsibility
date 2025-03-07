public class RecyclableCollection implements CollectionChain{
    private CollectionChain nextChain;

    @Override
    public void setNextChain(CollectionChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void collect(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("recyclable")) {
            System.out.println("Waste Collection and Recycling with a capacity of " + container.getCapacity());
        } else {
            nextChain.collect(container);
        }
   }
}