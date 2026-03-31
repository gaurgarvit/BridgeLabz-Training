package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    private final TemperatureConverter converter = new TemperatureConverter();

    @Test
    void testCelsiusToFahrenheit() {
        // testing conversion of freezing point
        assertEquals(32.0, converter.celsiusToFahrenheit(0));

        // testing conversion of boiling point
        assertEquals(212.0, converter.celsiusToFahrenheit(100));
    }

    @Test
    void testFahrenheitToCelsius() {
        // verifying conversion back to zero celsius
        assertEquals(0.0, converter.fahrenheitToCelsius(32));

        // verifying conversion with negative temperatures
        assertEquals(-40.0, converter.fahrenheitToCelsius(-40));
    }
}