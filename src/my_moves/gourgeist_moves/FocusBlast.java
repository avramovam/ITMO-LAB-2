package my_moves.gourgeist_moves;

import utils.Chance;
import ru.ifmo.se.pokemon.*;

public class FocusBlast extends SpecialMove {
    public FocusBlast(double pow, double acc) {
        super(Type.FIGHTING, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);

        if (Chance.chance(0.1)){
            Effect eff = new Effect().stat(Stat.SPECIAL_DEFENSE, -1);
            p.addEffect(eff);
        }
    }


    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        super.applyOppDamage(def, damage);
    }

    @Override
    protected String describe() {
        return "наносит урон и пытается снизить действие специальной атаки противника";
    }
}
