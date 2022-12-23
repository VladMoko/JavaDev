package com.go_it.module1.main;

import com.go_it.module1.users.User;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        addUser();
    }

    public static void addUser(){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        List<User> person = new ArrayList<>();
        person.add(new User("Vladislav", "Mokosieiev"));
        System.out.println(gson.toJson(person));
        }
}
