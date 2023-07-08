package devera.kits.injector;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Injector {

    private List<Class<?>> classes = new ArrayList<>();

    public void load(Class<?>... classes) {
        this.classes.addAll(Arrays.asList(classes));
    }

    public <T> T get(Class<T> clazz) {
        try {
            var targetIndex = this.classes.indexOf(clazz);
            if (targetIndex < 0) { return null; }
            return ((Class<T>) this.classes.get(targetIndex)).newInstance();
        } catch (InstantiationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    public <T> T inject(Class<T> target) {
        T result = null;
        try {
            result = target.newInstance();
        } catch (InstantiationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Field[] fields = target.getDeclaredFields();

        for (var field: fields) {
            if (field.isAnnotationPresent(Inject.class)) {
                try {
                    var candidate = this.get(field.getType());
                    if (Objects.isNull(candidate)) {
                        throw new Error("Injection fail due to target cannot be found");
                    }
                    field.set(result, candidate);
                } catch (IllegalArgumentException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }

        return result;
    }
}
