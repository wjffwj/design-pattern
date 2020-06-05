package strategy_pattern;

public class TravelByPlane implements TravelStratgy {
    @Override
    public void travel() {
        System.out.println("坐飞机出行...");
    }
}
