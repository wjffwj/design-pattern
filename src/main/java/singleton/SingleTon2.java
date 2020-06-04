package singleton;

/**
 * 使用内部类的方式实现单例模式
 */
public class SingleTon2 {
    private SingleTon2(){

    }

    private static class HolderClass{
        private static final SingleTon2 instance = new SingleTon2();
    }
    public static SingleTon2 getInstance() {
        return HolderClass.instance;
    }

}
