package com.filmnoprofesional.platform.si729pc2u20181g752.film.interfaces.rest.transform;

import com.filmnoprofesional.platform.si729pc2u20181g752.film.domain.model.aggregates.Film;
import com.filmnoprofesional.platform.si729pc2u20181g752.film.interfaces.rest.resources.FilmResource;

public class FilmResourceFromEntityAssembler {
    public static FilmResource toResourceFromEntity(Film entity) {
        return new FilmResource(
                entity.getId(),
                entity.getFilmId(),
                entity.getName(),
                entity.getRegisterEmailAddress(),
                entity.getFilmType(),
                entity.getFilmCountry(),
                entity.getLanguage(),
                entity.getDirector(),
                entity.getFilmDateAt()
        );
    }
}
