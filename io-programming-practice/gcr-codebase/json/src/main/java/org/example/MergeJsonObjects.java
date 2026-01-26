package org.example;

import org.json.JSONObject;

public class MergeJsonObjects {
    public static void main(String[] args) {
        // creating the first json object
        JSONObject json1 = new JSONObject();
        json1.put("id", 101);
        json1.put("role", "Admin");

        // creating the second json object
        JSONObject json2 = new JSONObject();
        json2.put("name", "Alice");
        json2.put("email", "alice@example.com");

        // merging json2 into json1
        for (String key : json2.keySet()) {
            json1.put(key, json2.get(key));
        }

        // displaying the merged result
        System.out.println(json1.toString(4));
    }
}