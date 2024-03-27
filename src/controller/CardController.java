package controller;

import model.Cards.MagicCard;
import model.Cards.PokeCard;
import model.Spell;
import model.Type;

import java.util.ArrayList;

public class CardController{


    public PokeCard createPoke(String name, String description, ArrayList<Type> types, ArrayList<Spell> spell, int HP) {
        return new PokeCard(name, description ,types , spell, HP);
    }

    public MagicCard createMagic(String name, ArrayList<Type> types, ArrayList<Spell> spell) {
        return new MagicCard(name,types, spell);
    }
}