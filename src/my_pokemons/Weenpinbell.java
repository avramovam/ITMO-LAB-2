package my_pokemons;

import ru.ifmo.se.pokemon.Type;
import my_moves.weenpinbell_moves.PoisonPowder;

public class Weenpinbell extends Bellsprout {
    public Weenpinbell(String name, int level) {
        super(name, level);

        super.setType(Type.GRASS, Type.POISON);
        super.setStats(65, 90, 50, 85, 45, 55);

        PoisonPowder poisonPowder = new PoisonPowder(0, 75);



        super.setMove(poisonPowder);

    }
}
