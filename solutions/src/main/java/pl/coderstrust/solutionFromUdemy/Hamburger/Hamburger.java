package pl.coderstrust.solutionFromUdemy.Hamburger;

public class Hamburger {


    private String name;
    private String breadRollType;
    private String meat;
    private double price;

    private String addition1;
    private double addition1Price;

    private String addition2;
    private double addition2Price;

    private String addition3;
    private double addition3Price;

    private String addition4;
    private double addition4Price;

    public Hamburger(String name, String breadRollType, String meat, double price) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
    }

    public void addAddition1 (String addtionName, double additionPrice){
        this.addition1= addtionName;
        this.addition1Price= additionPrice;

    }

    public void addAddition2 (String addtionName, double additionPrice){
        this.addition2= addtionName;
        this.addition2Price= additionPrice;

    }

    public void addAddition3 (String addtionName, double additionPrice){
        this.addition3= addtionName;
        this.addition3Price= additionPrice;

    }

    public void addAddition4 (String addtionName, double additionPrice){
        this.addition4= addtionName;
        this.addition4Price= additionPrice;
    }

    public double settingHamburger (){
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger is on a "
                + this.breadRollType + " roll with " + this.meat
                +  " and costs " + this.price);
        if(this.addition1 != null){
            hamburgerPrice += this.addition1Price;
            System.out.println("You added "+ this.addition1 + " for an extra " + this.addition1Price);
        }
        if(this.addition2 != null){
            hamburgerPrice += this.addition2Price;
            System.out.println("You added "+ this.addition2 + " for an extra " + this.addition2Price);
        }
        if(this.addition3 != null){
            hamburgerPrice += this.addition3Price;
            System.out.println("You added "+ this.addition3 + " for an extra " + this.addition3Price);
        }
        if(this.addition4 != null){
            hamburgerPrice += this.addition4Price;
            System.out.println("You added "+ this.addition4 + " for an extra " + this.addition4Price);
        }

        return hamburgerPrice;

    }

    public void printingTotalPrice(){



    }

    public String getAddition1() {
        return addition1;
    }

    public String getAddition2() {
        return addition2;
    }

    public String getAddition3() {
        return addition3;
    }

    public String getAddition4() {
        return addition4;
    }
}