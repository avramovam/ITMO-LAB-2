package my_pokemons;


import my_moves.gourgeist_moves.Dream_Eater;
import my_moves.gourgeist_moves.Facade;
import my_moves.gourgeist_moves.Fire_Blast;
import my_moves.gourgeist_moves.Focus_Blast;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Gourgeist extends Pokemon {
    public Gourgeist(String name, int level) {
        super(name, level);

        super.setType(Type.GHOST, Type.GRASS);
        super.setStats(65, 90, 122, 58, 75, 84);

        Dream_Eater dreamEater = new Dream_Eater(100, 100);
        Fire_Blast fireBlast = new Fire_Blast(110, 85);
        Facade facade = new Facade(70, 100);
        Focus_Blast focusBlast = new Focus_Blast(120, 70);

        super.setMove(dreamEater, fireBlast, facade, focusBlast);
    }
}
