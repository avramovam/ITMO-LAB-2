package my_moves.victreebel_moves;

import utils.Chance;
import ru.ifmo.se.pokemon.*;

public class LeafTornado extends SpecialMove {
    public LeafTornado(double pow, double acc) {
        super(Type.GRASS, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);

        if (Chance.chance(0.3)) {
            Effect effect = new Effect().stat(Stat.ACCURACY, -1);
            p.addEffect(effect);
        }
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        super.applyOppDamage(def, damage);
    }

    @Override
    protected String describe() {
        return "наносит урон и снижает точность врага";
    }
}
