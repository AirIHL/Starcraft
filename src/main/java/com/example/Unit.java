package com.example;

import java.util.Random;

public class Unit {

    private String name;
    private String description;
    private String direction;
    private int speed;
    private int hp;
    private int damage;
    private int position;

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

    public void move() {
        Random random = new Random();
        int randomInt = random.nextInt(20 + 1);

        for ( int i = 0; i < randomInt; i++) {
            position += setPosition();
            if (setPosition() == -1)
                direction = "오른쪽";
            else if (setPosition() == 1)
                direction = "왼쪽";

            System.out.println(this.getName() + "이(가) " + direction + "으로 이동했습니다.");
        }
    }

    public void currentPosition() {
        System.out.println(this.getName() + "의 위치는 현재 " + position + "입니다.");
    }

    public void printUnitInfo() {
        System.out.println(this.name + "\t 체력 : " + this.hp + "\t 공격력 : " + this.damage + "\t 설명 : " + this.description);
    }

    public void attack(Unit target) {

        System.out.println(this.getName() + "이가" + target.getName() + "을 공격합니다!");

        if (target.getHp() <= 0) {
            System.out.println("공격 불가능한 대상입니다.");
            return;
        }

        int newHp = target.getHp() - this.getDamage();
        target.setHp(newHp);

        if (newHp <= 0) {
            System.out.println(target.getName() + "이(가) 사망했습니다.");
        } else {
            System.out.println(target.getName() + "의 남은 체력 " + newHp);
        }

    }
}
