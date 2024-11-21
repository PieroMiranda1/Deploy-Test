package com.filmnoprofesional.platform.si729pc2u20181g752.film.domain.model.aggregates;

import com.filmnoprofesional.platform.si729pc2u20181g752.film.domain.model.commands.CreateFilmCommand;
import com.filmnoprofesional.platform.si729pc2u20181g752.film.domain.model.valueobjects.EmailAddress;
import com.filmnoprofesional.platform.si729pc2u20181g752.film.domain.model.valueobjects.FilmId;
import com.filmnoprofesional.platform.si729pc2u20181g752.film.domain.model.valueobjects.FilmType;
import com.filmnoprofesional.platform.si729pc2u20181g752.shared.domain.entities.AuditableAbstractAggregateRoot;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import lombok.Getter;

import java.util.Date;

@Entity
public class Film extends AuditableAbstractAggregateRoot<Film> {

    @Column(nullable = false)
    @Getter
    private FilmId filmId;

    @Column(nullable = false)
    @Getter
    private String name;

    @Column(nullable = false)
    @Embedded
    @Getter
    private EmailAddress registerEmailAddress;

    @Column(nullable = false)
    @Getter
    private FilmType filmType;

    @Column(nullable = false)
    @Getter
    private String filmCountry;

    @Column(nullable = false)
    @Getter
    private String language;

    @Column(nullable = false)
    @Getter
    private String director;

    @Column(nullable = false)
    @Getter
    private Date filmDateAt;

    public Film() {
        //JPA required
    }

    public Film(FilmId filmId, String name, EmailAddress registerEmailAddress, FilmType filmType, String filmCountry, String language, String director, Date filmDateAt) {
        this.filmId = filmId;
        this.name = name;
        this.registerEmailAddress = registerEmailAddress;
        this.filmType = filmType;
        this.filmCountry = filmCountry;
        this.language = language;
        this.director = director;
        this.filmDateAt = filmDateAt;
    }

    public Film(CreateFilmCommand command) {
        this.filmId = command.filmId();
        this.name = command.name();
        this.registerEmailAddress = new EmailAddress(command.registerEmailAddress());
        this.filmType = command.filmType();
        this.filmCountry = command.filmCountry();
        this.language = command.language();
        this.director = command.director();
        this.filmDateAt = command.filmDateAt();

    }


}
