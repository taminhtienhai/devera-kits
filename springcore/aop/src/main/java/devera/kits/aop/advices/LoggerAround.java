package devera.kits.aop.advices;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggerAround {

    private Log log = LogFactory.getLog(getClass());

    @Before("execution(public * devera.kits..*(..))")
    public void everywhere(JoinPoint jp) {
        String methodName = jp.getSignature().getName();

        log.info("Before method " + methodName);
    }
}
