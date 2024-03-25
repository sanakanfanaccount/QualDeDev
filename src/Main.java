import model.CardList;
import model.Cards.PokeCard;
import model.Spell;
import model.Type;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        CardList list = new CardList();

        ArrayList<Type> type = new ArrayList<>();
        type.add(new Type("eau"));

        ArrayList<Spell> spell = new ArrayList<>();
        spell.add(new Spell(new Type("feu"), new Type("eau"), "tkt je fait mal", "une descrption", 10, 10));


        PokeCard carte = new PokeCard("jack", "un pokemon", type, spell);

        list.addCard(carte);
        list.printListe();

    }
}
