package singleton;

import java.util.Objects;

public class Singleton {
    private static Singleton instance = null;
    
    public static Singleton getInstance() {
        if (Objects.isNull(instance)) {
            // synchronized(instance) {
            //     instance = new Singleton();
            // }
            instance = new Singleton();
        }
        return instance;
    }
}
