package com.kodilla.spring.basic.spring_scope.homework;

import jdk.vm.ci.meta.Local;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
@Component
@Scope("prototype")
public class Clock {
    private LocalTime localTime;

    public LocalTime processClock (){
        return this.localTime=LocalTime.now();
    }
}
