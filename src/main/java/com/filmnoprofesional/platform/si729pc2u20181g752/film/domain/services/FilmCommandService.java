package com.filmnoprofesional.platform.si729pc2u20181g752.film.domain.services;

import com.filmnoprofesional.platform.si729pc2u20181g752.film.domain.model.aggregates.Film;
import com.filmnoprofesional.platform.si729pc2u20181g752.film.domain.model.commands.CreateFilmCommand;

import java.util.Optional;

public interface FilmCommandService {
    Optional<Film> handle (CreateFilmCommand command);
}
