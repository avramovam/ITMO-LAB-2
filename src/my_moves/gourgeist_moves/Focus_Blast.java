package my_moves.gourgeist_moves;

import lab2.Main;
import ru.ifmo.se.pokemon.*;

public class Focus_Blast extends SpecialMove {
    public Focus_Blast(double pow, double acc) {
        super(Type.FIGHTING, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);

        if (Main.chance(0.1)){
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
