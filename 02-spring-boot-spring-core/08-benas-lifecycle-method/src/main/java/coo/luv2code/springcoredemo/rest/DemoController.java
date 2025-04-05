package coo.luv2code.springcoredemo.rest;

import coo.luv2code.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private  Coach myCoach;


//  we can use any methos name
//    same class name but first_latter lower_case ("baseballCoach")
   @Autowired
   public DemoController(
                     @Qualifier("cricketCoach") Coach theCoach,
                     @Qualifier("cricketCoach") Coach theAnotherCoach
                         )
   {

       System.out.println("in constructor : "+ getClass().getSimpleName());
       myCoach = theCoach;

   }


    @GetMapping("/dailyworkout")
    public String getDailyWorkout()
    {
        return myCoach.getDailyWorkout();
    }


}
