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

    private String name;
    private String pokedexDescription;
    private ArrayList<Type> types;
    private ArrayList<Spell> attacks;

    int HP;


    public void getString() {
        System.out.println(this.name + " " +"\n"+this.pokedexDescription +"\n"+ String.valueOf(this.HP) + " HP\n");
        this.attacks.forEach(result -> System.out.println(result.getString()));
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
