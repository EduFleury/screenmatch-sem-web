package br.com.EduardoPina.screenMatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(@JsonAlias("Title") String titulo,
                           @JsonAlias("totalSeasons") Integer totaltemporadas,
                           @JsonAlias("imdbRating") String avaliacao,
                           @JsonAlias("Genre") String genero,
                           @JsonAlias("Actors") String atores,
                           @JsonAlias("Poster") String poster,
                           @JsonAlias("Plot") String sinopse) {
}


