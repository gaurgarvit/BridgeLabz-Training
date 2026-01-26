package org.example;

import org.json.JSONArray;
import org.json.JSONObject;

public class StudentJson {
    public static void main(String[] args) {
        // creating the main student object
        JSONObject student = new JSONObject();

        // adding basic fields to the object
        student.put("name", "John Doe");
        student.put("age", 20);

        // creating the subjects array
        JSONArray subjects = new JSONArray();
        subjects.put("Math");
        subjects.put("Physics");
        subjects.put("Computer Science");

        // adding the array to the student object
        student.put("subjects", subjects);

        // printing the final json string
        System.out.println(student.toString(4));
    }
}