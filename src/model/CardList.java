package model;

import model.Cards.Card;
import model.Cards.PokeCard;

import java.util.ArrayList;

public class CardList {
    private ArrayList<Card> liste;

    public CardList() {
        liste = new ArrayList<>();
    }

    public void addCard(Card c) {
        liste.add(c);
    }

    public void printListe() {
        for (Card c : liste) {
            System.out.println("Nom : " + c);
            for (Type t : c.types) {
                System.out.println("Type : " + t.getTypeName());
            }
        }
    }
}