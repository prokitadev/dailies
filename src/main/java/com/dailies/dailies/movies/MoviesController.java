package com.dailies.dailies.movies;

import com.dailies.dailies.movies.model.Movie;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie")
public class MoviesController {

    @GetMapping
    public ResponseEntity<Movie> getMovies(@RequestParam(name = "city") String cityName) {
        if(cityName.equals( "Krakow")) {
            return ResponseEntity.ok(new Movie());
        }
        return ResponseEntity.badRequest().build();
    }
}
