public class Test {
    public static void main(String[] args) {
        int numberOfRoom = 1;
        Room[] rooms = new Room[3];
        rooms[0] = new ProAirConditionerRoom(100, 20);
        rooms[1] = new BasicAirConditionerRoom(50, 23);
        rooms[2] = new BasicAirConditionerRoom(50, 15);

        for (Room room : rooms) {
            System.out.println("Pokój " + numberOfRoom);
            System.out.println("Temperatura przed jej obniżeniem: " + room.getActualTemperature());
            room.lowerTheTemperature();
            System.out.println("Temperatura po jej pierwszym obniżeniu: " + room.getActualTemperature());
            room.lowerTheTemperature();
            System.out.println("Temperatura po jej drugim obniżeniu: " + room.getActualTemperature() + '\n');
            numberOfRoom++;
        }

    }
}
