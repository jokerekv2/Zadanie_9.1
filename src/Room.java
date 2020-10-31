public class Room {
    private double size;
    private double actualTemperature;

    public Room(double size, double actualTemperature) {
        this.size = size;
        this.actualTemperature = actualTemperature;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getActualTemperature() {
        return actualTemperature;
    }

    public void setActualTemperature(double actualTemperature) {
        this.actualTemperature = actualTemperature;
    }
}
