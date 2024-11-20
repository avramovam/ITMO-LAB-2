package my_pokemons;


import my_moves.bellsprout_moves.SludgeBomb;
import my_moves.comfey_moves.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Bellsprout extends Pokemon {
    public Bellsprout(String name, int level) {
        super(name, level);

        super.setType(Type.GRASS, Type.POISON);
        super.setStats(50, 75, 35, 70, 30, 40);

        SludgeBomb sludgeBomb = new SludgeBomb(90, 100);
        Swagger swagger = new Swagger(0, 85);

        super.setMove(sludgeBomb, swagger);

    }
}