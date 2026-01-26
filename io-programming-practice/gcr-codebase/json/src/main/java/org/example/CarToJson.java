package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

// defining the Car class
class Car {
    public String brand;
    public String model;
    public int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
}

public class CarToJson {
    public static void main(String[] args) {
        try {
            // initializing the object mapper
            ObjectMapper mapper = new ObjectMapper();

            // instantiating a new Car object
            Car myCar = new Car("Tesla", "Model S", 2023);

            // converting the java object to json string
            String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(myCar);

            // displaying the result
            System.out.println(jsonString);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}