package my_moves.pumpkaboo_moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.*;

public class Dream_Eater extends SpecialMove {
    public Dream_Eater(double pow, double acc) {
        super(Type.PSYCHIC, pow, acc);
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        super.applyOppDamage(def, damage);

        Status self_effect = def.getCondition();
        if (self_effect.toString().equals("SLEEP")){
            super.applyOppDamage(def, damage);
        }
        else{
            super.applyOppDamage(def, 0);
        }
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        super.applySelfEffects(p);

        int hp = (int) p.getHP();
        Effect effect = new Effect().stat(Stat.HP, (int) ((12-hp) * 0.5));
        p.addEffect(effect);
    }

    @Override
    protected String describe() {
        return "нанес урон спящим противникам и восстановил силы";
    }
}
