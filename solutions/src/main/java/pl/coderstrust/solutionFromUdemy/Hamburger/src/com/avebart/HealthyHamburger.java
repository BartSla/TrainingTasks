package pl.coderstrust.solutionFromUdemy.Hamburger.src.com.avebart;

public class HealthyHamburger extends Hamburger{

    private String healthyAddition1;
    private double healthyAdditionPrice1;

    private String healthyAddition2;
    private double healthyAdditionPrice2;


    public HealthyHamburger(String meat, double price) {
        super("Healthy", "Brown rye", meat, price);
    }

    public void addHealthyAddition1 (String addtionName, double additionPrice){
        this.healthyAddition1= addtionName;
        this.healthyAdditionPrice1= additionPrice;

    }

    public void addHealthyAddition2 (String addtionName, double additionPrice){
        this.healthyAddition2= addtionName;
        this.healthyAdditionPrice2= additionPrice;
    }


    @Override
    public double settingHamburger() {
        double healthyPrice = super.settingHamburger();
        if(this.healthyAddition1 != null){
            healthyPrice += this.healthyAdditionPrice1;
            System.out.println("You added "+ this.healthyAddition1 + " for an extra " + this.healthyAdditionPrice1);
        }
        if(this.healthyAddition2 != null){
            healthyPrice += this.healthyAdditionPrice2;
            System.out.println("You added "+ this.healthyAddition2 + " for an extra " + this.healthyAdditionPrice2);
        }
        return healthyPrice;
    }

    public String getHealthyAddition1() {
        return healthyAddition1;
    }

    public String getHealthyAddition2() {
        return healthyAddition2;
    }
}
