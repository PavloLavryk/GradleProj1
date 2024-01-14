package org.example;

import com.google.gson.Gson;

public class App {
    public static void main(String[] args) {
        User user = new User("Pavlo", "Lavryk");

        Gson gson = new Gson();

        System.out.println(gson.toJson(user));
    }
}
