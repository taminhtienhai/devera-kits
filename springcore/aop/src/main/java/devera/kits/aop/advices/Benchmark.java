package devera.kits.aop.advices;

import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Benchmark {
    
    private Log logger = LogFactory.getLog(getClass());


    /**
     * Benchmark any method define in `controller` directory
     * @param pjp
     * @return
     * @throws Throwable
     */
    @Around("execution(public * devera.kits.aop.controller.*.*(..))")
    public Object measureMethodExecutionTime(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.nanoTime();
        Object retval = pjp.proceed();
        long end = System.nanoTime();
        String methodName = pjp.getSignature().getName();
        logger.info("Execution of " + methodName + " took " + TimeUnit.NANOSECONDS.toMillis(end - start) + " ms");
        return retval;
    }
}
