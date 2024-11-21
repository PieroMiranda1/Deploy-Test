package com.filmnoprofesional.platform.si729pc2u20181g752.film.infrastructure.persistence.jpa;

import com.filmnoprofesional.platform.si729pc2u20181g752.film.domain.model.aggregates.Film;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface FilmRepository extends JpaRepository<Film, Long> {

    Optional<Film> findFilmById(Long id);

    boolean existsFilmByName(String name);

}
