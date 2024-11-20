package my_pokemons;


import my_moves.gourgeist_moves.FocusBlast;
import ru.ifmo.se.pokemon.Type;

public class Gourgeist extends Pumpkaboo{
    public Gourgeist(String name, int level) {
        super(name, level);

        super.setType(Type.GHOST, Type.GRASS);
        super.setStats(65, 90, 122, 58, 75, 84);

        FocusBlast focusBlast = new FocusBlast(120, 70);

        super.setMove(focusBlast);
    }
}
