package com.example;

import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Terran Marine = new Terran("Marine", 5, 20, 8, 0, "Terran Unit");
        Protoss Zealot = new Protoss("Zealot", 10, 30, 8, 0, "Protoss Unit");
        Zerg Zergling = new Zerg("Zergling", 15, 15, 5, 0, "Zerg Unit");

        Marine.printUnitInfo();
        Marine.currentPosition();
        Marine.move();
        Marine.currentPosition();

        Marine.attack(Zealot);
        Zealot.attack(Zergling);
        Marine.attack(Zergling);
        Zealot.attack(Zergling);
        Zealot.attack(Marine);

    }
}