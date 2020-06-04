package proxy_pattern;

public class TestMain {
    public static void main(String[] args) {
        IOrderService iOrderService = new OrderProxy();
        iOrderService.submit();
        iOrderService.cancel();
    }
}
