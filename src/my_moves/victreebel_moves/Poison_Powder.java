package my_moves.victreebel_moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Poison_Powder extends StatusMove {
    public Poison_Powder(double pow, double acc) {
        super(Type.POISON, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);

        Effect.poison(p);
    }

    @Override
    protected String describe() {
        return "отравляет свою цель";
    }
}
