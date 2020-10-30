public class Room {
    private double size;
    private double actualTemperature;

    public Room(int size, double actualTemperature) {
        this.size = size;
        this.actualTemperature = actualTemperature;
    }

    public void lowerTheTemperature(){}

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
