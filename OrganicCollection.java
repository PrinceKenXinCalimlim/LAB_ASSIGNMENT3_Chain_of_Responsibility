public class OrganicCollection implements CollectionChain{
    private CollectionChain chain;

    @Override
    public void setNextChain(CollectionChain nextChain) {
        this.chain = nextChain;
    }


    @Override
    public void collect(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("organic"))
            System.out.println("Organic Waste Collection and Disposal with a capacity of " + container.getCapacity());
        else {
            this.chain.collect(container);
        }
    }
    
}