package my_pokemons;

import my_moves.victreebel_moves.Swagger;
import my_moves.victreebel_moves.Sludge_bomb;
import my_moves.victreebel_moves.Poison_Powder;
import my_moves.victreebel_moves.Leaf_Tornado;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;


public class Victreebel extends Pokemon {
    public Victreebel(String name, int level) {
        super(name, level);

        super.setType(Type.GRASS, Type.POISON);
        super.setStats(80, 105, 65, 100, 70, 70);

        Sludge_bomb sludgeBomb = new Sludge_bomb(90, 100);
        Swagger swagger = new Swagger(0, 85);
        Poison_Powder poisonPowder = new Poison_Powder(0, 75);
        Leaf_Tornado leafTornado = new Leaf_Tornado(65, 90);


        super.setMove(sludgeBomb, swagger, poisonPowder, leafTornado);

    }
}
