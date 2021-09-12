package com.company;

public class Gameentyty {
    public Gameentyty(String live, int damage) {
        this.live = live;
        this.damage = damage;
    }

    private String live;
    private int damage;

    public String getLive() {
        return live;
    }

    public void setLive(String live) {
        this.live = live;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getInfo() {
        return "live" + live + "damage" + damage;
    }

    protected void GetInfo() {
    }

}
