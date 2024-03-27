package model.Cards;

import model.Spell;
import model.Type;

import java.util.ArrayList;

public abstract class Card{
    public String name;
    public ArrayList<Type> types;

    abstract public String getString();
    abstract public String getCardBrand();
}