
import controller.CardController;
import controller.ListController;
import model.CardList;

import model.Cards.Card;
import model.Cards.MagicCard;
import model.Cards.PokemonCard;
import model.Spell;
import model.Type;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException {

        ListController listController = new ListController();

        Spell mystical_fire  = new Spell(new Type("Fire"), new Type("Special"),
                "Fire Spin", "It damages an enemy. It could also cause the Fire Spin status condition.",
                2, 150);


        ArrayList<Type> delphox_types = new ArrayList<>();
        delphox_types.add(new Type("Fire"));
        delphox_types.add(new Type("Psychic"));

        ArrayList<Type> magic_types = new ArrayList<>();
        magic_types.add(new Type("Legendary"));
        magic_types.add(new Type("Indestructible"));


        ArrayList<Spell> delphox_spells = new ArrayList<>();
        delphox_spells.add(mystical_fire);

        // CREATION D'UNE CARTE & AJOUT A LA LISTE
        listController.createPoke("Delphox", "It gazes into the flame at the tip of its branch to achieve a focused state",delphox_types , delphox_spells, 150);
        listController.createMagic("The One Ring","When The One Ring enters the battlefield, if you cast it, you gain protection from everything until the next turn",magic_types);

        //AFFICHAGE DE LA LISTE
        listController.printList();

        //FILTRER LA LISTE
        ArrayList<Card> filterResult = listController.getList().filterAndSort("Magic", "name", "The One Ring", "", "");
        listController.getList().setList(filterResult);

        //AFFICHER LE RESULTAT
        listController.printList();

        System.out.println("Hello world!");


    }
}
