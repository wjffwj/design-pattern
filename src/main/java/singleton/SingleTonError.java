package singleton;

public class SingleTonError {
    //私有化构造器
    private SingleTonError() {
    }
    //单例对象
    private static SingleTonError instance = null;
    //public的方法懒加载获取单例对象
    public static SingleTonError getInstance() {
        //判断当前对象是否为空，为空则对单例对象进行实例化
        if (instance == null) {
            //此步骤会出现线程安全问题，当两个线程都执行到判断instance是否为空了，均会向下执行创建两个对象
            synchronized (SingleTonError.class) {
                instance = new SingleTonError();
            }
        }
        return instance;
    }
}
