package org.example;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        IEmpWageBuilder builder = new EmpWageBuilder();

        builder.addCompany("TCS", 20, 20, 100);
        builder.addCompany("Infosys", 25, 22, 120);

        builder.computeWage();

        System.out.println("Total Wage for TCS: "
                + builder.getTotalWage("TCS"));
    }
}
