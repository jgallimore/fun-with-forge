package com.example.examplemod;

public class Player {

    public String name;
    public int health;
    public int nsiii;
    public int hunger;
    public int oxygen;
    public int nbr;

    public void help (Player otherPlayer) {
        otherPlayer.health = otherPlayer.health + 10;
    }

}
