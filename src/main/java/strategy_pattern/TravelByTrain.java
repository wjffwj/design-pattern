package strategy_pattern;

public class TravelByTrain implements TravelStratgy {

    @Override
    public void travel() {
        System.out.println("坐火车出行");
    }

}
