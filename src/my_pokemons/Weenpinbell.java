package my_pokemons;

import my_moves.bellsprout_moves.Sludge_bomb;
import my_moves.comfey_moves.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import my_moves.weenpinbell_moves.Poison_Powder;

public class Weenpinbell extends Pokemon {
    public Weenpinbell(String name, int level) {
        super(name, level);

        super.setType(Type.GRASS, Type.POISON);
        super.setStats(65, 90, 50, 85, 45, 55);

        Sludge_bomb sludgeBomb = new Sludge_bomb(90, 100);
        Swagger swagger = new Swagger(0, 85);
        Poison_Powder poisonPowder = new Poison_Powder(0, 75);



        super.setMove(sludgeBomb, swagger, poisonPowder);

    }
}
