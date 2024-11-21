package com.filmnoprofesional.platform.si729pc2u20181g752.film.application.internal.commandservices;

import com.filmnoprofesional.platform.si729pc2u20181g752.film.domain.model.aggregates.Film;
import com.filmnoprofesional.platform.si729pc2u20181g752.film.domain.model.commands.CreateFilmCommand;
import com.filmnoprofesional.platform.si729pc2u20181g752.film.domain.services.FilmCommandService;
import com.filmnoprofesional.platform.si729pc2u20181g752.film.infrastructure.persistence.jpa.FilmRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FilmCommandServiceImpl implements FilmCommandService {

    private final FilmRepository filmRepository;

    public FilmCommandServiceImpl(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    @Override
    public Optional<Film> handle(CreateFilmCommand command) {
        if(filmRepository.existsFilmByName(command.name())) {
            throw new IllegalArgumentException("Film with name " + command.name() + " already exists");
        }
        var film = new Film(command);
        filmRepository.save(film);
        return Optional.of(film);
    }
}
