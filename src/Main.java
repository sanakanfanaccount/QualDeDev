
import controller.CardController;
import controller.ListController;
import model.CardList;

import model.Cards.MagicCard;
import model.Cards.PokemonCard;
import model.Spell;
import model.Type;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException {

        ListController listController = new ListController();

        /*DEMO*/
        Spell mystical_fire  = new Spell(new Type("Fire"), new Type("Special"),
                "Fire Spin", "It damages an enemy. It could also cause the Fire Spin status condition.",
                2, 150);


        ArrayList<Type> delphox_types = new ArrayList<>();
        delphox_types.add(new Type("Fire"));
        delphox_types.add(new Type("Psychic"));

        ArrayList<Spell> delphox_spells = new ArrayList<>();
        delphox_spells.add(mystical_fire);

        PokemonCard delphox = new PokemonCard("Delphox");


        listController.createPoke("Delphox", "It gazes into the flame at the tip of its branch to achieve a focused state",delphox_types , delphox_spells, 150);
        listController.createMagic("Magic card",delphox_types, delphox_spells);

        listController.getList().setList(listController.getList().filterAndSort("Pokemon", "name", "Delphox", "", ""));


        listController.printList();
        System.out.println("Hello world!");


    }
}
