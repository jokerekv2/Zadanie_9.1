public class BasicAirConditionerRoom extends Room {
    private final static int MAX_TEMPERATURE = 15;

    public BasicAirConditionerRoom(int size, double actualTemperature) {
        super(size, actualTemperature);
    }

    public void lowerTheTemperature() {
        double actualTemperature = getActualTemperature();
        if (actualTemperature > MAX_TEMPERATURE) {
            actualTemperature = actualTemperature - (1/getSize() * actualTemperature);
            setActualTemperature(actualTemperature);
        } else
            System.out.println("Limit temperatury osiągnięty.");
    }


}
