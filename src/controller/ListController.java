package controller;

import model.CardList;
import model.Spell;
import model.Type;

import java.util.ArrayList;

public class ListController{

    CardController cardController = new CardController();
    CardList list = new CardList();

    public void createPoke(String name, String description, ArrayList<Type> types, ArrayList<Spell> spell, int HP) {
        list.addCard(cardController.createPoke(name,description,types,spell,HP));
    }

    public void createMagic(String name, ArrayList<Type> types, ArrayList<Spell> spell) {
        list.addCard(cardController.createMagic(name, types,spell));
    }


    public void printList() {
        list.printListe();
    }
}