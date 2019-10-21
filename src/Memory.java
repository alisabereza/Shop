class Memory implements TechSpecification {
    private int volume;
    private String Type;

    Memory(int volume, String type) {
        this.volume = volume;
        Type = type;
    }

    int getVolume() {
        return volume;
    }

    void setVolume(int volume) {
        this.volume = volume;
    }

    String getType() {
        return Type;
    }

    void setType(String type) {
        Type = type;
    }

    public String show() {
        return "{" +
                "volume=" + volume +
                ", Type='" + Type + '\'' +
                '}';
    }
}
