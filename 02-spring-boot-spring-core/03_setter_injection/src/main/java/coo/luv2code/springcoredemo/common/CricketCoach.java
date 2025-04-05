package coo.luv2code.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    @Override
    public String getDailyworkout() {
        return  "pratice fast bowling everyday 15 minutes :-)";
    }
}
