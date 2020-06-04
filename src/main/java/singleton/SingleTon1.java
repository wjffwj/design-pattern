package singleton;


/**
 * 饿汉式
 */
public class SingleTon1 {
    //私有化构造器
    private SingleTon1() {
    }
    //加载->验证->准备->解析->初始化
    //类加载机制中：进行初始化时创建为此类变量进行赋值
    private static final SingleTon1 singleTon1 = new SingleTon1();

    //提供获取单例对象的静态方法
    public static SingleTon1 getInstance() {
        return singleTon1;
    }


}

