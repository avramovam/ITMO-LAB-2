package my_moves.pumpkaboo_moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import utils.Chance;

public class FireBlast extends SpecialMove {
    public FireBlast(double pow, double acc) {
        super(Type.FIRE, pow, acc);
    }

    @Override
    protected void applyOppDamage(Pokemon p, double damage) {
        super.applyOppDamage(p, damage);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);

        if (Chance.chance(0.1)){
            Effect.burn(p);
        }
    }

    @Override
    protected String describe() {
        return "наносит урон и пытается поджечь цель";
    }
}
