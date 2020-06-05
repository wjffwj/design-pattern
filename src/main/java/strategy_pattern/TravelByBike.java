package strategy_pattern;

public class TravelByBike implements TravelStratgy {
    @Override
    public void travel() {
        System.out.println("骑车出行....");
    }
}
