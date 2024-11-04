package my_moves.comfey_moves;

import ru.ifmo.se.pokemon.*;

public class Growth extends StatusMove {
    public Growth(double pow, double acc) {
        super(Type.NORMAL, pow, acc);
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        super.applySelfEffects(p);

        Effect effect = new Effect().stat(Stat.ATTACK, 1);
        Effect effect2 = new Effect().stat(Stat.SPECIAL_ATTACK, 1);

        p.addEffect(effect);
        p.addEffect(effect2);
    }

    @Override
    protected String describe() {;
        return "повышает силу своей атаки";
    }
}
