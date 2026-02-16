package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class EmpWageBuilderTest {

    private EmpWageBuilder builder;

    @BeforeEach
    void setUp() {
        // Fixed seed for predictable results
        builder = new EmpWageBuilder(new Random(1));
        builder.addCompany("TCS", 20, 5, 40);
        builder.computeWage();
    }

    @Test
    void testCompanyExists() {
        CompanyEmpWage company = builder.getCompany("TCS");
        assertNotNull(company);
        assertEquals("TCS", company.getCompanyName());
    }

    @Test
    void testTotalWageCalculated() {
        int totalWage = builder.getTotalWage("TCS");
        assertTrue(totalWage >= 0);
    }

    @Test
    void testDailyWageStored() {
        CompanyEmpWage company = builder.getCompany("TCS");
        assertFalse(company.getDailyWages().isEmpty());
    }

    @Test
    void testInvalidCompany() {
        int result = builder.getTotalWage("Google");
        assertEquals(-1, result);
    }

    @Test
    void testWorkingDaysLimit() {
        CompanyEmpWage company = builder.getCompany("TCS");
        assertTrue(company.getDailyWages().size() <= 5);
    }
}
