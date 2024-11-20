package my_pokemons;

import my_moves.victreebel_moves.LeafTornado;
import ru.ifmo.se.pokemon.Type;


public class Victreebel extends Weenpinbell {
    public Victreebel(String name, int level) {
        super(name, level);

        super.setType(Type.GRASS, Type.POISON);
        super.setStats(80, 105, 65, 100, 70, 70);

        LeafTornado leafTornado = new LeafTornado(65, 90);


        super.setMove(leafTornado);

    }
}
