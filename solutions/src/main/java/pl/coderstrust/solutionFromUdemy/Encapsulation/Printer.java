package pl.coderstrust.solutionFromUdemy.Encapsulation;

public class Printer {

    private double tonerLevel;
    private int pagesPrinted;
    private boolean duplexonOff;

    public Printer(int tonerLevel, int pagesPrinted, boolean duplexonOff) {
        this.tonerLevel = tonerLevel;
        this.pagesPrinted = pagesPrinted;
        this.duplexonOff = duplexonOff;
    }

    public void fillToner (int addedToner){
        if (this.getTonerLevel() <100 && addedToner < (100-this.getTonerLevel())) {
            this.tonerLevel += addedToner;
        }else if (addedToner > (100-this.getTonerLevel())){
            System.out.println("You added to much toner! You can add only" + (100 - this.getTonerLevel()) + "%");

        }
    }

    public void printing (int pages){
        if (!this.duplexonOff) {
            this.pagesPrinted += pages;
            this.tonerLevel -= 0.1;
            System.out.println("Printing " + pages);
        } else
            this.pagesPrinted += pages *2;
            this.tonerLevel -= (pages *2)* 0.2;
        System.out.println("Printing " + (2*pages));
            if (this.tonerLevel <= 1)
                System.out.println("Not enough toner. Fill it up.");


    }



    public double getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplexonOff() {
        return duplexonOff;
    }
}
