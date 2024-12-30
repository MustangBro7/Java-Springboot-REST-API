package com.example.TMDBMovie.api;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;

@RestController
public class Controller {
    @Autowired
    private Movieservice movieService;
    @GetMapping("/getTopMovies/{id}")
    public String getMethodName(@PathVariable int id) {
        // final String res;
        // res = movieService.getTopMovies().toString();
        // System.out.println(res);
        return movieService.getTopMovies(id);
    }
    
    @GetMapping("/test")
    public String testMethod() {
        // return movieService.dummytest();
        return "Hello";
    }
    
    @GetMapping("/getMovieList")
    public List<String> MovieListMethod() {
        // return movieService.dummytest();
        return movieService.getMovieList();
    }
}
