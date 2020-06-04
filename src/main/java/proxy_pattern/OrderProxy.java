package proxy_pattern;
//step3创建代理类在提交订单前进行日志记录和在提交订单完成后进行日志记录
public class OrderProxy implements IOrderService {
    IOrderService orderService = new OrderServiceImpl();

    @Override
    public void submit() {
        loggerBefore();
        orderService.submit();
        loggerAfter();
    }

    @Override
    public void cancel() {
        loggerBefore();
        orderService.cancel();
        loggerAfter();
    }

    public void loggerBefore() {
        System.out.println("下单前执行操作...");
    }

    public void loggerAfter() {
        System.out.println("下单后执行操作...");
    }

}
