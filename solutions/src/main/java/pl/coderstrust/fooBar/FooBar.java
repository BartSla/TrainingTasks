package pl.coderstrust.fooBar;

public class FooBar {

    public static void fooBarIterate() {

        for (int i = 0; i <= 100; i++) {

            if (i % 3 == 0 && i % 5 != 0 && i % 15 != 0) {
                System.out.println("Foo " + i);
            } else if (i % 5 == 0 && i % 15 != 0) {
                System.out.println("Bar " + i);
            } else if (i % 15 == 0) {
                System.out.println("FooBar " + i);
            } else {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        fooBarIterate();
    }
}