package com.kodilla.patterns2.facade.api;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectShopService {
    public static final Logger LOGGER = LoggerFactory.getLogger(AspectShopService.class);


    @Around("execution(* com.kodilla.patterns2.facade.ShopService..*(..))")
    public Object methodName(ProceedingJoinPoint pjp) throws Throwable {
        LOGGER.info("Method-> " + pjp.getSignature().toShortString());
        return pjp.proceed();
    }
}

