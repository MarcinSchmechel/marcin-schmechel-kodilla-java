package com.kodilla.paterns2.facade.api;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class OrderAop {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderAop.class);

    @Before("execution(* com.kodilla.paterns2.facade.api.OrderFacade.processOrder(..)) && target(object)")
    public void logEventBefore(Object object){
        LOGGER.info("Class: " + object.getClass().getName() + " - started");
    }

    @After("execution(* com.kodilla.paterns2.facade.api.OrderFacade.processOrder(..)) && target(object)")
    public void logEventAfter(Object object){
        LOGGER.info("Class: " + object.getClass().getSimpleName() + " - executed");
    }
}
