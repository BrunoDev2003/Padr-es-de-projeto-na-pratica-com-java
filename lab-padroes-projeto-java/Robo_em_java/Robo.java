package Robo_em_java;
public class Robo {
    private Comportamento strategy;
    private Robo comportamento;

    public void setStrategy(Comportamento strategy) {
        this.strategy = strategy;
    }
    public void mover() {
        comportamento.mover();
    }
    public void setComportamento(Comportamento normal) {
    }
}
