package com.avebart;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Big Mac", "White", "Beef", 10.25);

        double price = hamburger.settingHamburger();
        hamburger.addAddition1("tomato", 0.99);
        hamburger.addAddition2("onion", 1.44);
        hamburger.addAddition3("bekon", 1.31);
        hamburger.addAddition4("cheese", 1.20);

        System.out.println("Price of hamburger with "
                + hamburger.getAddition1()
                +", "+hamburger.getAddition2()
                +", "+hamburger.getAddition3()
                +" and "+hamburger.getAddition4()
                +" is "+ hamburger.settingHamburger());
        System.out.println();



        HealthyHamburger healthy = new HealthyHamburger("Pork", 15.43);

        healthy.addHealthyAddition1("carrot", 2.99);
        healthy.addHealthyAddition2("cheese", 0.33);
        healthy.addAddition1("tomato", 0.91);
        healthy.addAddition2("onion", 0.22);
        healthy.addAddition3("majonese", 1.22);
        healthy.addAddition4("ketchup", 1.34);


        System.out.println("Price of hamburger with "
                + healthy.getAddition1()
                +", "+healthy.getAddition2()
                +", "+healthy.getAddition3()
                +" , "+healthy.getAddition4()
                +", "+healthy.getHealthyAddition1()
                +" and "+healthy.getHealthyAddition2()
                +" is "+ healthy.settingHamburger());

        System.out.println();

        HamburgerDeluxe deluxe = new HamburgerDeluxe();

        System.out.println("Total price is "+ deluxe.settingHamburger());



    }
}
