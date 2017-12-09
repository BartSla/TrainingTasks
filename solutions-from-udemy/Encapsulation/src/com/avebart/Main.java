package com.avebart;

public class Main {

    public static void main(String[] args) {


        Printer printer = new Printer(90, 21, true);





        printer.printing(111);
        System.out.println(printer.getTonerLevel());
        System.out.println(printer.getPagesPrinted());
        printer.printing(42);
        System.out.println(printer.getTonerLevel());
        System.out.println(printer.getPagesPrinted());
        printer.fillToner(71);
        System.out.println(printer.getTonerLevel());

    }
}
