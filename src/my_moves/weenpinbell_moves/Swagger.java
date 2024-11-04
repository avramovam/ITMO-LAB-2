package my_moves.weenpinbell_moves;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {
    public Swagger(double pow, double acc) {
        super(Type.NORMAL, pow, acc);
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);

        Effect effect = new Effect().stat(Stat.ATTACK, 2);
        p.addEffect(effect);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        Effect.confuse(p);
    }
    @Override
    protected String describe() {
        return "сбивает с толку и усиливает свою атаку";
    }
}
