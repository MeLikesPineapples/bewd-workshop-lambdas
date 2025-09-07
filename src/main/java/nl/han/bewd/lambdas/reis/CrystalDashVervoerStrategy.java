package nl.han.bewd.lambdas.reis;

public class CrystalDashVervoerStrategy  implements VervoerStrategy {

    private int reisTijd;

    CrystalDashVervoerStrategy() {
        this.reisTijd = 5;
    }

    @Override
    public int berekenReistijd(boolean isReisTijdensSpits) {
        return this.reisTijd;
    }
}
