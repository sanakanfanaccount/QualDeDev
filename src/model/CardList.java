package model;

import model.Cards.Card;

import java.util.ArrayList;
import java.util.Objects;

public class CardList {
    private ArrayList<Card> list;



    public CardList() {
        list = new ArrayList<>();
    }

    public void addCard(Card c) {
        list.add(c);
    }

    public void printListe() {
        for (Card c : list) {
            System.out.println(c.getString() + "\n");
        }
    }

    public ArrayList<Card> filterAndSort(String cardBrand){

        ArrayList<Card> toReturn = new ArrayList<>();
          this.list.stream()
                .filter(card -> Objects.equals(card.getCardBrand(), cardBrand))
                  .forEach(toReturn::add);

          return toReturn;
    }

    public ArrayList<Card> getList() {
        return list;
    }

    public void setList(ArrayList<Card> list) {
        this.list = list;
    }

}