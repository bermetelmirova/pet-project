package com.example.petproject.movie;

import com.example.petproject.actor.Actor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Movie {
    private Long id;
    private String name;
    private List<Actor> actors;
    private LocalDate releaseDate;

    public Movie(Long id, String name, LocalDate releaseDate) {
        this.id = id;
        this.name = name;
        this.releaseDate = releaseDate;
    }

    public static void main(String[] args) {
        System.getenv("ARTIFACTORY_REPOSITORY");
    }
}
