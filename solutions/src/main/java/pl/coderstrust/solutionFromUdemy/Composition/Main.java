package pl.coderstrust.solutionFromUdemy.Composition;

public class Main {

    public static void main(String[] args) {

        Desk desk = new Desk("Big", "Blue", 4);
        Windows windows = new Windows(5,"White");
        Door door = new Door(200, 90);
        Table table = new Table(4, "Oak");

        Room room = new Room(windows, desk, door, table);

        room.buildingRoom();
/*

        room.getWindows().breakWindow(2);
        room.getDesk().openDesk("It is open");
        room.getDoor().openDoor("open");
*/



    }
}
