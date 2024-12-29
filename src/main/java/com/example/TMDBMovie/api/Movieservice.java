package com.example.TMDBMovie.api;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;

import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class Movieservice {
    public JSONObject getTopMovies(){
        try{
        HttpRequest getrRequest = HttpRequest.newBuilder()
            .uri(new URI("https://api.themoviedb.org/3/movie/top_rated?language=en-US&page=1"))
            .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiI0OTA0ZmQ5ZGU4YjNiMmQ3YTQ2MDE2YmM5ZTY0NGIzNyIsIm5iZiI6MTczNTMwNjM1MC44MDQsInN1YiI6IjY3NmVhYzZlZDBiMDhmOTcxODYxNTk0YSIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.GjyHBEFt76KoVdVdi62k9M5ZeplJZgEF-bP9rUAG3PU")
            .header("Accept", "application/json")
            .GET()
            .build();

        HttpClient client = HttpClient.newHttpClient();
        HttpResponse<String> response = client.send(getrRequest, HttpResponse.BodyHandlers.ofString());
        // System.out.println(response.body);
        JSONObject jsonObject = new JSONObject(response.body());
        return jsonObject;
        }  catch (Exception e){
            e.printStackTrace();
            JSONObject jsonObject = new JSONObject(e);
            return jsonObject ;
        }
    }
    public String dummytest(){
        System.out.println("Hello");
        return "Hello";
    }

}
