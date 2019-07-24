/**
 * 方法1：同步锁（影响性能） 把synchronized去掉 就是我们网传的懒汉式
 */
public class Singleton_1st {
    private static Singleton_1st uniqueInstance;

    private Singleton_1st() {
    }

    public static synchronized Singleton_1st getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton_1st();
        }
        return uniqueInstance;
    }
}
