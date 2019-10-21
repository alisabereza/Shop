public class TechSpecificationPC implements TechSpecification {
    private Memory memory;
    private Processor processor;
    private GraphicsCard graphicsCard;

    TechSpecificationPC(Memory memory, Processor processor, GraphicsCard graphicsCard) {
        this.memory = memory;
        this.processor = processor;
        this.graphicsCard = graphicsCard;
    }

    @Override
    public String show() {
        return "{" +
                "memory=" + memory.show() +
                ", processor=" + processor.show() +
                ", graphics card=" + graphicsCard.show() +
                '}';
    }
}
