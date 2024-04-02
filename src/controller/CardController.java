package controller;

import model.Cards.MagicCard;
import model.Cards.PokemonCard;
import model.Spell;
import model.Type;

import java.util.ArrayList;

public class CardController{


    public PokemonCard createPoke(String name, String description, ArrayList<Type> types, ArrayList<Spell> spell, int HP) {
        return new PokemonCard(name, description ,types , spell, HP);
    }

    public MagicCard createMagic(String name,String description,ArrayList<Type> types) {
        return new MagicCard(name,description,types);
    }
}