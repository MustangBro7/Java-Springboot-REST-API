package com.example.TMDBMovie.api;

import org.springframework.web.bind.annotation.RestController;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class Controller {
    @Autowired
    private Movieservice movieService;
    @GetMapping("/getTopMovies")
    public JSONObject getMethodName() {
        // final String res;
        // res = movieService.getTopMovies().toString();
        // System.out.println(res);
        return movieService.getTopMovies();
    }
    
    @GetMapping("/test")
    public String testMethod() {
        // return movieService.dummytest();
        return "Hello";
    }
    
}
