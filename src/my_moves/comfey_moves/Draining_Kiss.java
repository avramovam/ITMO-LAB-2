package my_moves.comfey_moves;

import ru.ifmo.se.pokemon.*;

public class Draining_Kiss extends SpecialMove {
    public Draining_Kiss(double pow, double acc) {
        super(Type.FAIRY, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        super.applySelfEffects(p);

        int hp = (int) p.getHP();
        Effect effect = new Effect().stat(Stat.HP, (int) ((12-hp) * 0.75));
        p.addEffect(effect);
    }

    @Override
    protected String describe() {
        return "наносит урон сопернику и восстанавливает 75% здоровья HP";
    }
}
