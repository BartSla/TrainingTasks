package pl.coderstrust.solutionFromUdemy.Composition;

public class Windows {

    private int windows;
    private String frameColor;


    public Windows(int windows, String frameColor) {
        this.windows = windows;
        this.frameColor = frameColor;
    }

    public void breakWindow(int window){

        System.out.println("I brooke "+ window +"  windows");
    }

    public int getWindows() {
        return windows;
    }

    public String getFrameColor() {
        return frameColor;
    }
}
