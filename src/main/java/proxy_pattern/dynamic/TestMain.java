package proxy_pattern.dynamic;

import proxy_pattern.IOrderService;
import proxy_pattern.OrderServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class TestMain {
    public static void main(String[] args) {
        IOrderService target = new OrderServiceImpl();
        InvocationHandler handler = new ProxyHandler(target);
        IOrderService orderService = (IOrderService) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),handler);
        orderService.submit();
        orderService.cancel();

    }
}
