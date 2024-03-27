package model.Cards;

import model.Spell;
import model.Type;

import java.util.ArrayList;

public class MagicCard extends Card{
    private String name;
    private ArrayList<Type> types;
    private ArrayList<Spell> attacks;

    public MagicCard(String name, ArrayList<Type> types, ArrayList<Spell> attacks){
        this.name = name;
        this.types = types;
        this.attacks = attacks;
    }

    public MagicCard(String name){
        this.name = name;
        this.types = new ArrayList<Type>();
        this.attacks = new ArrayList<Spell>();
    }



    @Override
    public String getString() {
        String toReturn = "Magic card : \n"+this.name +"\n";
        toReturn +="Types : ";
        for(Type type : this.types){
            toReturn += type.getString() +" ";
        }
        toReturn +="\n";
        for(Spell spell :this.attacks){
            toReturn+= "Attack : "+spell.getString() + " ";
        }
        return toReturn;
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