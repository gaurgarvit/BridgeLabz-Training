package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EmpWageBuilder implements IEmpWageBuilder {

    private static final int IS_FULL_TIME = 1;
    private static final int IS_PART_TIME = 2;

    private final List<CompanyEmpWage> companyList;
    private final Random random;

    public EmpWageBuilder() {
        this.companyList = new ArrayList<>();
        this.random = new Random();
    }

    // Constructor for testing (inject Random)
    public EmpWageBuilder(Random random) {
        this.companyList = new ArrayList<>();
        this.random = random;
    }

    @Override
    public void addCompany(String companyName,
                           int wagePerHour,
                           int maxWorkingDays,
                           int maxWorkingHours) {

        companyList.add(
                new CompanyEmpWage(companyName,
                        wagePerHour,
                        maxWorkingDays,
                        maxWorkingHours));
    }

    @Override
    public void computeWage() {

        for (CompanyEmpWage company : companyList) {

            int totalWorkingHours = 0;
            int totalWorkingDays = 0;

            while (totalWorkingHours < company.getMaxWorkingHours()
                    && totalWorkingDays < company.getMaxWorkingDays()) {

                totalWorkingDays++;

                int empCheck = random.nextInt(3);
                int empHours = 0;

                switch (empCheck) {
                    case IS_FULL_TIME:
                        empHours = 8;
                        break;

                    case IS_PART_TIME:
                        empHours = 4;
                        break;

                    default:
                        empHours = 0;
                }

                totalWorkingHours += empHours;

                int dailyWage = empHours * company.getWagePerHour();
                company.addDailyWage(dailyWage);
            }

            int totalWage = totalWorkingHours * company.getWagePerHour();
            company.setTotalEmpWage(totalWage);
        }
    }

    @Override
    public int getTotalWage(String companyName) {

        for (CompanyEmpWage company : companyList) {
            if (company.getCompanyName().equalsIgnoreCase(companyName)) {
                return company.getTotalEmpWage();
            }
        }
        return -1;
    }

    public CompanyEmpWage getCompany(String companyName) {
        for (CompanyEmpWage company : companyList) {
            if (company.getCompanyName().equalsIgnoreCase(companyName)) {
                return company;
            }
        }
        return null;
    }
}
