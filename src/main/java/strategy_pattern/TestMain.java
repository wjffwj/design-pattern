package strategy_pattern;

//策略模式测试类
public class TestMain {
    public static void main(String[] args) {
        Context context = new Context();
        context.setTravelStratgy(new TravelByBike());
        context.travelStyle();

        context.setTravelStratgy(new TravelByPlane());
        context.travelStyle();

    }
}
