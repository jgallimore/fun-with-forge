package com.example.examplemod;

public class Main {

    public static void main(String[] args) {
        Player jon = new Player();
        jon.name = "Jon";
        jon.health = 10;
        jon.nbr = 1;
        jon.nsiii = 10;
        jon.hunger = 100;

        Player james = new Player();
        james.name = "James";
        james.health = 100;
        james.nbr = 20;
        james.nsiii = 100;
        james.hunger = 50;

        james.help(jon);

    }


}
