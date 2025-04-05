package coo.luv2code.springcoredemo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public  class CricketCoach implements Coach {

    public CricketCoach()
    {
        System.out.println("in constructor : "+ getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return  "practice fast bowling everyday 15 minutes :-)";
    }
}
