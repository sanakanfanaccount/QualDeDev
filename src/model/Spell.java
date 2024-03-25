package model;

public class Spell {

    public Spell(Type type1, Type type2, String name, String description, int cost, int damage) {
        this.type1 = type1;
        this.type2 = type2;
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.damage = damage;
    }

    public String getString(){
        return this.name + "\n" + this.description+"\nCosts : "+this.cost+ " \n"+ this.damage+" DMG" ;
    }


    Type type1;
    Type type2;
    String name;
    String description;
    int cost;
    int damage;

    /*G&S*/

    public Type getType1() {
        return type1;
    }

    public void setType1(Type type1) {
        this.type1 = type1;
    }

    public Type getType2() {
        return type2;
    }

    public void setType2(Type type2) {
        this.type2 = type2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }



}
