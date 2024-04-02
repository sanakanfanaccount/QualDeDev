package model.Cards;

import model.Spell;
import model.Type;

import java.util.ArrayList;

public class MagicCard extends Card{
    private String name;
    private ArrayList<Type> types;
    private String description;


    public MagicCard(String name, String description, ArrayList<Type> types) {
        this.name = name;
        this.types = types;
        this.description = description;
    }

    @Override
    public String getString() {
        String toReturn = "Magic card : \n"+this.name;
        /*
        toReturn +="Types : ";
        for(Type type : this.types){
            toReturn += type.getString() +" ";
        }
        toReturn +="\n";
        for(Spell spell :this.attacks){
            toReturn+= "Attack : "+spell.getString() + " ";
        }*/
        return toReturn;
    }



    /*G&S*/


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

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

}