package model.Cards;

import model.Spell;
import model.Type;

import java.util.ArrayList;

class MagicCard extends Card{
    private String name;
    private ArrayList<Type> types;
    private ArrayList<Spell> attacks;

    @Override
    public String getString() {
    return "Magic Card, unimplemented...";
    }

    /*G&S*/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Type> getTypes() {
        return types;
    }

    public void setTypes(ArrayList<Type> types) {
        this.types = types;
    }

    public ArrayList<Spell> getAttacks() {
        return attacks;
    }

    public void setAttacks(ArrayList<Spell> attacks) {
        this.attacks = attacks;
    }



}