class GraphicsCard extends Processor {

    private GraphicsMemory graphicsMemory;

    GraphicsCard(int coreNumber, int frequency, GraphicsMemory graphicsMemory) {
        super(coreNumber, frequency);
        this.graphicsMemory = graphicsMemory;
    }

    Memory getGraphicsMemory() {
        return graphicsMemory;
    }

    void setGraphicsMemory(GraphicsMemory graphicsMemory) {
        graphicsMemory = graphicsMemory;
    }

    public String show() {
        return "{" +
                "coreNumber=" + super.getCoreNumber() +
                ", frequency=" + super.getFrequency() +
                ", graphicsMemory=" + graphicsMemory.show() +
                '}';
    }
}
