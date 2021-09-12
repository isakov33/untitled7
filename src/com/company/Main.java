package com.company;

public class Main {

    public static void main(String[] args) {
	Boss boss = new Boss("1000",500,new Weapon("fire","100"));
        System.out.println(boss.getInfo());
        
    }
}
