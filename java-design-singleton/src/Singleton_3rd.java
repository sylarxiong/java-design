/**
 * 方法3：双重检查加锁 性能很高 适合jdk1.5及以后
 */
public class Singleton_3rd {
    private volatile static Singleton_3rd uniqueInstance;

    private Singleton_3rd() {

    }
    private static Singleton_3rd getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton_3rd.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton_3rd();
                }
            }
        }
        return uniqueInstance;
    }
}
