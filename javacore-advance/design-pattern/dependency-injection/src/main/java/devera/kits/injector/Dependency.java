package devera.kits.injector;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ ElementType.TYPE, ElementType.METHOD, ElementType.PARAMETER })
public @interface Dependency {
}
