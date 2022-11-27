package ru.ainurforex.seedwars.model;

public class Solder {
    private String name;
    private String fraction;
    private int level;
    private int direction;
    private int x;
    private int y;
    private int health;
    private int armor;
    private int attack;
    private int speed;
    private int defence;

    public Solder(String name, String fraction, int level, int direction, int x, int y, int health, int armor, int attack, int speed, int defence) {
        this.name = name;
        this.fraction = fraction;
        this.level = level;
        this.direction = direction;
        this.x = x;
        this.y = y;
        this.health = health;
        this.armor = armor;
        this.attack = attack;
        this.speed = speed;
        this.defence = defence;
    }

    @Override
    public String toString() {
        return "Solder{" +
                "name: " + name +
                ", level: " + level +
                ", fraction: " + fraction +
                ", health: " + health +
                ", armor: " + armor +
                ", attack: " + attack +
                ", speed: " + speed +
                ", defence: " + defence +
                '}';
    }


    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getFraction() {
        return fraction;
    }

    public void setFraction(String fraction) {
        this.fraction = fraction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }
}
