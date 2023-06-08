package devera.kit.bean.config;

import javax.management.ConstructorParameters;

public class Pair {
    int left;
    int right;

    @ConstructorParameters({ "left", "right" })
    public Pair(int left, int right) {
        this.left = left;
        this.right = right;
    }

    
}
