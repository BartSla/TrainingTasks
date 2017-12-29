package pl.coderstrust.solutionFromUdemy.Hamburger;

public class HamburgerDeluxe extends Hamburger{


    public HamburgerDeluxe() {
        super("DeluxeBurger", "White", "Beef", 11.22);
        super.addAddition1("chips", 2.21);
        super.addAddition2("cola", 1.33);
    }

    @Override
    public void addAddition1(String addtionName, double additionPrice) {
        System.out.println("You cannot to add additional items to the Deluxeburger");
    }

    @Override
    public void addAddition2(String addtionName, double additionPrice) {
        System.out.println("You cannot to add additional items to the Deluxeburger");
    }

    @Override
    public void addAddition3(String addtionName, double additionPrice) {
        System.out.println("You cannot to add additional items to the Deluxeburger");
    }

    @Override
    public void addAddition4(String addtionName, double additionPrice) {
        System.out.println("You cannot to add additional items to the Deluxeburger");
    }
}
