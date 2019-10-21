class TechSpecificationSmartphone implements TechSpecification {
    private Memory memory;
    private Processor processor;
    private String os;
    private double diagonal;
    private double timeOfWorkingFromBattery;
    
    

    TechSpecificationSmartphone(Memory memory, Processor processor, String os, double diagonal, double timeOfWorkingFromBattery) {
        this.memory = memory;
        this.processor = processor;
        this.os = os;
        this.diagonal = diagonal;
        this.timeOfWorkingFromBattery = timeOfWorkingFromBattery;
    }

    String getOs() {
        return os;
    }

    void setOs(String os) {
        this.os = os;
    }

    double getDiagonal() {
        return diagonal;
    }

    void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    double getTimeOfWorkingFromBattery() {
        return timeOfWorkingFromBattery;
    }

    void setTimeOfWorkingFromBattery(double timeOfWorkingFromBattery) {
        this.timeOfWorkingFromBattery = timeOfWorkingFromBattery;
    }

    @Override
    public String show() {
        return "{" +
                "OS=" + os +
                ", memory=" + memory.show() +
                ", processor=" + processor.show() +
                ", diagonal=" + diagonal +
                ", time of working from battery=" + timeOfWorkingFromBattery +
                '}';
    }
}
