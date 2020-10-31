public class Test {
    public static void main(String[] args) {
        ProAirConditionerRoom proAirConditionerRoom = new ProAirConditionerRoom();
        BasicAirConditionerRoom basicAirConditionerRoom = new BasicAirConditionerRoom();
        Room[] rooms = new Room[3];
        double[] sizes = {100, 50, 50};
        double[] temperatures = {23, 26, 15};

        createOrOverwriteRooms(rooms, sizes, temperatures);

        int numberOfRoom = 0;
        printTheResult(basicAirConditionerRoom, rooms, numberOfRoom);

        createOrOverwriteRooms(rooms, sizes, temperatures);

        System.out.println("Dla pokoju z z klimatyzatorem PRO:");

        numberOfRoom = 0;
        printTheResult(proAirConditionerRoom, rooms, numberOfRoom);

    }

    private static void createOrOverwriteRooms(Room[] rooms, double[] sizes, double[] temperatures) {
        for (int i = 0; i < rooms.length; i++) {
            rooms[i] = new Room(sizes[i], temperatures[i]);
        }
    }

    private static void printTheResult(AirConditioner airConditioner, Room[] rooms, int numberOfRoom) {
        for (Room room : rooms) {
            System.out.println("Pokój " + numberOfRoom);
            System.out.println("Temperatura przed jej obniżeniem: " + room.getActualTemperature());
            airConditioner.lowerTheTemperature(room);
            System.out.println("Temperatura po jej pierwszym obniżeniu: " + room.getActualTemperature());
            airConditioner.lowerTheTemperature(room);
            System.out.println("Temperatura po jej drugim obniżeniu: " + room.getActualTemperature() + '\n');
            numberOfRoom++;
        }
    }
}
