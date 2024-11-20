package my_pokemons;

import my_moves.comfey_moves.Facade;
import my_moves.pumpkaboo_moves.DreamEater;
import my_moves.pumpkaboo_moves.FireBlast;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Pumpkaboo extends Pokemon {
    public Pumpkaboo(String name, int level) {
        super(name, level);

        super.setType(Type.GHOST, Type.GRASS);
        super.setStats(49, 66, 70, 44, 55, 51);

        DreamEater dreamEater = new DreamEater(100, 100);
        FireBlast fireBlast = new FireBlast(110, 85);
        Facade facade = new Facade(70, 100);

        super.setMove(dreamEater, fireBlast, facade);
    }
}
