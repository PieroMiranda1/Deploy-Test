package com.filmnoprofesional.platform.si729pc2u20181g752.film.interfaces.rest.resources;

import com.filmnoprofesional.platform.si729pc2u20181g752.film.domain.model.valueobjects.FilmId;
import com.filmnoprofesional.platform.si729pc2u20181g752.film.domain.model.valueobjects.FilmType;

import java.util.Date;

public record CreateFilmResource(
        FilmId filmId,
        String name,
        String emailAddress,
        FilmType filmType,
        String filmCountry,
        String language,
        String director,
        Date filmDateAt
) {
}
