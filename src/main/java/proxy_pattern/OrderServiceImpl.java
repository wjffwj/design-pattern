package proxy_pattern;
//step2提交订单接口实现类
public class OrderServiceImpl implements IOrderService {
    @Override
    public void submit() {
        System.out.println("提交订单完成...");
    }

    @Override
    public void cancel() {
        System.out.println("取消订单...");
    }
}
