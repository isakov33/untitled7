package com.company;

public class Boss extends Gameentyty{
private Weapon weapon;
public Boss(String live,int damage, Weapon weapon){
    super(live, damage);
    this.weapon = weapon;
}

    public Weapon getWeapon() {

    return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public String getInfo(){
    return super.getInfo() + "avtomat" + weapon.getAvtomat() + "kalash" + weapon.getKalash();

    }
}
