public class ProAirConditionerRoom extends AirConditioner{
    private final static int MAX_TEMPERATURE = 15;

    public void lowerTheTemperature(Room room) {
        double actualTemperature = room.getActualTemperature();
        if (actualTemperature > MAX_TEMPERATURE) {
            actualTemperature--;
            room.setActualTemperature(actualTemperature);
        } else
            System.out.println("Limit temperatury osiągnięty.");
    }
}
