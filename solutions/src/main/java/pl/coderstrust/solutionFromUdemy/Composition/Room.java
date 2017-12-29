package pl.coderstrust.solutionFromUdemy.Composition;


public class Room {

   private Windows windows;
   private Desk desk;
   private Door door;
   private Table table;

    public Room(Windows windows, Desk desk, Door door, Table table) {
        this.windows = windows;
        this.desk = desk;
        this.door = door;
        this.table = table;
    }

    public void buildingRoom() {
        desk.openDesk("It is open");
        door.openDoor("open");
        windows.breakWindow(3);
        System.out.println("I understood composition and hidden object and method access.");


    }


   /* public Windows getWindows() {
        return windows;
    }

    public Desk getDesk() {
        return desk;
    }

    public Door getDoor() {
        return door;
    }

    public Table getTable() {
        return table;
    }*/
}
