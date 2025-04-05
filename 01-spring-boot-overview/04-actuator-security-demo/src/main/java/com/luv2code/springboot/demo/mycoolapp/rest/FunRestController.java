package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // return "Hello world"

    @GetMapping("/")
   public String sayHello()
    {
        return "Hello World";
    }

   //    expose a new endpoint for "workout"
    @GetMapping("/workout")

    public  String getDailyWorkout()
    {
        return "Run a hard 5k!" ;
    }

   //  expose a enw endpoints for "fortune"

    @GetMapping("/fortune")

    public  String getDailyFortune()
    {
        return " today is your lucy day" ;
    }


}
