package model;

import model.Cards.Card;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Comparator;

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
            System.out.println("\n==========================+\n"+c.getString()+"\n===========================");
        }
    }

    public ArrayList<Card> filterAndSort(String cardBrand,String filter, String filterValue, String sortFilter, String sortValue) {
        ArrayList<Card> finalList = new ArrayList<>();
        list.stream()
                .filter(card -> {
                    if(cardBrand.isEmpty())
                        return true;
                    return card.getClass().getName().equals("model.Cards."+cardBrand+"Card");
                })
                .filter( card -> {
                    if(filter.isEmpty())
                        return true;
                    try {
                        Field field = Class.forName("model.Cards."+cardBrand+"Card").getDeclaredField(filter);
                        field.setAccessible(true);
                        Object value = field.get(card);
                        return value.toString().equals(filterValue);
                    } catch (IllegalAccessException | NoSuchFieldException ignored) {
                        System.out.println("CHAMP NON TROUVE FILTER");
                        return false;
                    } catch (ClassNotFoundException e) {
                        System.out.println("CLASSE NON TROUVEE FILTER");
                        return false;
                    }
                })
                .sorted(Comparator.comparing(card -> {
                    if(sortFilter.isEmpty() || sortValue.isEmpty())
                        return "";
                    try {
                        Field field = Class.forName("model.Cards."+cardBrand+"Card").getDeclaredField(filter);
                        field.setAccessible(true);
                        Object value = field.get(card);
                        return value.toString();

                    } catch (IllegalAccessException | NoSuchFieldException ignored) {
                        System.out.println("CHAMP NON TROUVE FILTER");
                        return "";
                    } catch (ClassNotFoundException e) {
                        System.out.println("CLASSE NON TROUVEE FILTER");
                        return "";
                    }
                }))
                .forEach(finalList::add);
        return finalList;
    }

    public ArrayList<Card> getList() {
        return list;
    }

    public void setList(ArrayList<Card> list) {
        this.list = list;
    }

}