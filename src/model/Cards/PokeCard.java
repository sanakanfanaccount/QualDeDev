package model.Cards;

import model.Spell;
import model.Type;

import java.util.ArrayList;

public class PokeCard extends  Card{

    public PokeCard(String name, String pokedexDescription, ArrayList<Type> types, ArrayList<Spell> attacks, int HP) {
        this.name = name;
        this.pokedexDescription = pokedexDescription;
        this.types = types;
        this.attacks = attacks;
        this.HP = HP;
    }

    public PokeCard(String name){
        this.name = name;
        this.pokedexDescription = "empty";
        this.types = new ArrayList<Type>();
        this.attacks = new ArrayList<Spell>();
        this.HP = 0;
    }

    private String name;
    private String pokedexDescription;
    private ArrayList<Type> types;
    private ArrayList<Spell> attacks;

    int HP;


    @Override
    public String getCardBrand(){
        return "Pokemon";
    }


    @Override
    public String getString() {
        String toReturn = "Pokemon card : \n"+this.name + " " +"\n"+this.pokedexDescription +"\n"+ String.valueOf(this.HP) + " HP\n";
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
    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }


    /*G&S*/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPokedexDescription() {
        return pokedexDescription;
    }

    public void setPokedexDescription(String pokedexDescription) {
        this.pokedexDescription = pokedexDescription;
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
