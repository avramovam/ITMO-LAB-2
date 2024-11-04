package my_moves.comfey_moves;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    public Facade(double pow, double acc) {
        super(Type.NORMAL, pow, acc);
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        super.applyOppDamage(def, damage);

        Status self_effect = def.getCondition();

        if (self_effect.toString().equals("BURN")) {
            super.applyOppDamage(def, damage*2);
        }
        if (self_effect.toString().equals("POISON")) {
            super.applyOppDamage(def, damage*2);
        }
        if (self_effect.toString().equals("PARALYZE")) {
            super.applyOppDamage(def, damage*2);
        }
    }
    @Override
    protected String describe() {
        return "наносит большой урон";
    }
}
