package singleton;

/**
 * 懒汉式，懒加载
 */
public class SingleTon0 {
    private volatile static SingleTon0 singleTon0 = null;

    private SingleTon0() {
    }

    public static SingleTon0 getInstance() {
        if (singleTon0 == null) {
            //锁定代码块儿
            synchronized (SingleTon0.class) {
                if (singleTon0 == null) {
                    singleTon0 = new SingleTon0();
                }
            }
        }
        return singleTon0;
    }
}
