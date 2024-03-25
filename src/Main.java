
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

        /*DEMO*/
        Spell mystical_fire  = new Spell(new Type("Fire"), new Type("Special"),
                "Fire Spin", "It damages an enemy. It could also cause the Fire Spin status condition.",
                2, 150);


         ArrayList<Type> delphox_types = new ArrayList<>();
         delphox_types.add(new Type("Fire"));
         delphox_types.add(new Type("Psychic"));

         ArrayList<Spell> delphox_spells = new ArrayList<>();
         delphox_spells.add(mystical_fire);
        PokeCard delphox = new PokeCard("Delphox",
                "It gazes into the flame at the tip of its branch to achieve a focused state, which allows it to see into the future.",delphox_types , delphox_spells, 150);


        delphox.getString();

        System.out.println("Hello world!");

    }
}
