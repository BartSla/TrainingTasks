package pl.coderstrust.solutionFromUdemy.Composition.src.com.avebart;

public class Door {

    private int heigh;
    private int width;


    public Door(int high, int width) {
        this.heigh = high;
        this.width = width;
    }

    public void openDoor (String openDoor){

        System.out.println("Door is  " + openDoor );
    }

    public int getHigh() {
        return heigh;
    }

    public int getWidth() {
        return width;
    }
}
