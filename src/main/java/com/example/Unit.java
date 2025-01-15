package com.example;

import java.util.Random;

public abstract class Unit {

    private String name;
    private String description;
    protected String direction;
    private int speed;
    private int hp;
    private int damage;
    protected int position;

    public Unit(String _name, int _speed, int _hp, int _damage, int _position, String _description) {
        this.name = _name;
        this.speed = _speed;
        this.hp = _hp;
        this.damage = _damage;
        this.position = _position;
        this.description = _description;
    }

    public String getName() {
        return this.name;
    }

    public int getHp() {
        return this.hp;
    }

    public int getDamage() {
        return this.damage;
    }

    public void setHp(int _hp) {
        this.hp = _hp;
    }

    public int setPosition() {
        Random random = new Random();
        int[] directions  = {1, -1};
        return directions[random.nextInt(2)];
    }

    public abstract void move();

    public void currentPosition() {
        System.out.println(this.getName() + "의 위치는 현재 " + position + "입니다.");
    }

    public void printUnitInfo() {
        System.out.println(this.name + "\t 체력 : " + this.hp + "\t 공격력 : " + this.damage + "\t 설명 : " + this.description);
    }

    public abstract void attack(Unit target);
}
