package coo.luv2code.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public  class TennisCoach implements Coach{

    @Override
    public String getDailyWorkout()
    {
        return "do daily 1h practice in tennis coach";
    }

}
