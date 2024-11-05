package my_moves.bellsprout_moves;

import ru.ifmo.se.pokemon.*;
import utils.Chance;

public class Sludge_bomb extends SpecialMove {
    public Sludge_bomb(double pow, double acc) {
        super(Type.POISON, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);

        if (Chance.chance(0.3)) {
            Effect.poison(p);
        }
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        super.applyOppDamage(def, damage);
    }

    @Override
    protected String describe() {
        return "наносит урон и пытается отравить цель";
    }
}
