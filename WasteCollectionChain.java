public class WasteCollectionChain implements CollectionChain {
    private CollectionChain nextChain;

    public WasteCollectionChain() {
        CollectionChain organic = new OrganicCollection();
        CollectionChain recyclable = new RecyclableCollection();
        CollectionChain hazardous = new HazardousCollection();

        organic.setNextChain(recyclable);
        recyclable.setNextChain(hazardous);

        this.nextChain = organic;
    }

    @Override
    public void collect(WasteContainer container) {
        nextChain.collect(container);
    }

    public void setNextChain(CollectionChain nextChain) {
        this.nextChain = nextChain;
    }
}