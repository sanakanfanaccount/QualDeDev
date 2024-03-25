package model.Cards;

import model.Spell;
import model.Type;

import java.util.ArrayList;

public class PokeCard extends  Card{

    public PokeCard(String name, String pokedexDescription, ArrayList<Type> types, ArrayList<Spell> attacks) {
        this.name = name;
        this.pokedexDescription = pokedexDescription;
        this.types = types;
        this.attacks = attacks;
    }

    private String name;
    private String pokedexDescription;
    private ArrayList<Type> types;
    private ArrayList<Spell> attacks;
    int PV;

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
