class Processor implements TechSpecification {
    private int coreNumber;
    private int frequency;

    Processor(int coreNumber, int frequency) {
        this.coreNumber = coreNumber;
        this.frequency = frequency;
    }

    int getCoreNumber() {
        return coreNumber;
    }

    void setCoreNumber(int coreNumber) {
        this.coreNumber = coreNumber;
    }

    int getFrequency() {
        return frequency;
    }

    void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public String show() {
        return "{" +
                "coreNumber=" + coreNumber +
                ", frequency=" + frequency +
                '}';
    }
}
