package com.example;

import java.util.Random;

public class Zerg extends Unit {

    public Zerg(String _name, int _speed, int _hp, int _damage, int _position, String _description) {
        super(_name, _speed, _hp, _damage, _position, _description);
    }

    @Override
    public int setPosition() {
        Random random = new Random();
        int[] directions  = {2, -2};
        return directions[random.nextInt(2)];
    }

    @Override
    public void move() {
        Random random = new Random();
        int randomInt = random.nextInt(20 + 1);

        for ( int i = 0; i < randomInt; i++) {
            position += setPosition();
            if (setPosition() == -2)
                direction = "오른쪽";
            else if (setPosition() == 2)
                direction = "왼쪽";

            System.out.println(this.getName() + "이(가) " + direction + "으로 이동했습니다.");
        }
    }

    @Override
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
