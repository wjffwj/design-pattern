package strategy_pattern;

public class Context {
    private TravelStratgy travelStratgy;

    public void setTravelStratgy(TravelStratgy travelStratgy) {
        this.travelStratgy = travelStratgy;
    }
    public void travelStyle() {
        travelStratgy.travel();
    }
}
