package lab2;

import my_pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {

        // https://pokemondb.net/pokedex/comfey
        // https://pokemondb.net/pokedex/pumpkaboo
        // https://pokemondb.net/pokedex/gourgeist
        // https://pokemondb.net/pokedex/bellsprout
        // https://pokemondb.net/pokedex/victreebel

        Battle b = new Battle();
        Pumpkaboo p1 = new Pumpkaboo("Pumpkaboo", 1);
        Comfey p2 = new Comfey("Comfey", 1);
        Gourgeist p3 = new Gourgeist("Gourgeist", 1);
        Bellsprout p4 = new Bellsprout("Bellsprout", 1);
        Weenpinbell p5 = new Weenpinbell("Weenpinbell", 1);
        Victreebel p6 = new Victreebel("Victreebel", 1);

        b.addAlly(p1);
        b.addAlly(p4);
        b.addAlly(p5);
        b.addFoe(p3);
        b.addFoe(p2);
        b.addFoe(p6);
        b.go();
    }
}