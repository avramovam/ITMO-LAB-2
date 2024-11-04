package my_pokemons;

import my_moves.pumpkaboo_moves.Dream_Eater;
import my_moves.pumpkaboo_moves.Facade;
import my_moves.pumpkaboo_moves.Fire_Blast;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Pumpkaboo extends Pokemon {
    public Pumpkaboo(String name, int level) {
        super(name, level);

        super.setType(Type.GHOST, Type.GRASS);
        super.setStats(49, 66, 70, 44, 55, 51);

        Dream_Eater dreamEater = new Dream_Eater(100, 100);
        Fire_Blast fireBlast = new Fire_Blast(110, 85);
        Facade facade = new Facade(70, 100);

        super.setMove(dreamEater, fireBlast, facade);
    }
}
