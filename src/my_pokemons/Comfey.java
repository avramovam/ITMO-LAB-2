package my_pokemons;

import my_moves.comfey_moves.Draining_Kiss;
import my_moves.comfey_moves.Facade;
import my_moves.comfey_moves.Growth;
import my_moves.comfey_moves.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Comfey extends Pokemon {
    public Comfey(String name, int level) {
        super(name, level);

        super.setType(Type.FAIRY);
        super.setStats(51, 52, 90, 82, 110, 100);

        Growth growth = new Growth(0, 0);
        Facade facade = new Facade(70, 100);
        Draining_Kiss drainingKiss = new Draining_Kiss(50, 100);
        Swagger swagger = new Swagger(0, 85);

        super.setMove(growth, facade, drainingKiss, swagger);

    }
}
