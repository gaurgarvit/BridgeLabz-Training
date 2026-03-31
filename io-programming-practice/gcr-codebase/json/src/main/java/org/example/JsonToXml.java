package org.example;

import org.json.JSONObject;
import org.json.XML;

public class JsonToXml {
    public static void main(String[] args) {
        // defining a simple json string
        String jsonString = "{\"student\": {\"name\": \"Mark\", \"score\": 95}}";

        // parsing the string into a json object
        JSONObject json = new JSONObject(jsonString);

        // converting json object to xml string
        String xml = XML.toString(json);

        // printing the xml output
        System.out.println(xml);
    }
}