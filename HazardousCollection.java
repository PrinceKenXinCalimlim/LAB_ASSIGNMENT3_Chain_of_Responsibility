public class HazardousCollection implements CollectionChain{
    private CollectionChain chain;

    @Override
    public void setNextChain(CollectionChain nextChain) {
        this.chain = nextChain;
    }


    @Override
    public void collect(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("hazardous"))
            System.out.println("Safe Collection and Management of Hazardous Waste with a capacity of " + container.getCapacity());
        else {
            this.chain.collect(container);
        }
    }
}