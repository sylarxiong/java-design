/**
 * 方法2：急切模式 网上都叫他 “饿汉式” 此方法时线程安全的
 */
public class Singleton_2nd {
    private static Singleton_2nd uniqueInstance = new Singleton_2nd();//保证线程安全

    private Singleton_2nd() {
    }

    public static Singleton_2nd getInstance() {
        return uniqueInstance;
    }
}
