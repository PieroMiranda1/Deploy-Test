package com.filmnoprofesional.platform.si729pc2u20181g752.film.interfaces.rest.transform;

import com.filmnoprofesional.platform.si729pc2u20181g752.film.domain.model.commands.CreateFilmCommand;
import com.filmnoprofesional.platform.si729pc2u20181g752.film.interfaces.rest.resources.CreateFilmResource;

public class CreateFilmCommandFromResourceAssembler {
    public static CreateFilmCommand toCommandFromResource(CreateFilmResource resource) {
        return new CreateFilmCommand(
                resource.filmId(),
                resource.name(),
                resource.emailAddress(),
                resource.filmType(),
                resource.filmCountry(),
                resource.language(),
                resource.director(),
                resource.filmDateAt()
        );
    }
}
