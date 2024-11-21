package com.filmnoprofesional.platform.si729pc2u20181g752.film.domain.model.commands;

import com.filmnoprofesional.platform.si729pc2u20181g752.film.domain.model.valueobjects.EmailAddress;
import com.filmnoprofesional.platform.si729pc2u20181g752.film.domain.model.valueobjects.FilmId;
import com.filmnoprofesional.platform.si729pc2u20181g752.film.domain.model.valueobjects.FilmType;

import java.util.Date;

public record CreateFilmCommand(FilmId filmId, String name, String registerEmailAddress, FilmType filmType, String filmCountry, String language, String director, Date filmDateAt) {
    public CreateFilmCommand {
        if (filmId == null) {
            throw new IllegalArgumentException("Film id cannot be null");
        }
        if (name == null || name.isBlank() || name.length() > 250) {
            throw new IllegalArgumentException("name cannot be null, empty or exceed 250 characters");
        }
        if (registerEmailAddress == null || registerEmailAddress.length() > 50) {
            throw new IllegalArgumentException("registerEmailAddress cannot be null or exceed 50 characters");
        }
        if (filmType == null) {
            throw new IllegalArgumentException("filmType cannot be null");
        }
        if (filmCountry == null || filmCountry.isBlank() || filmCountry.length() > 250) {
            throw new IllegalArgumentException("filmCountry cannot be null, empty or exceed 250 characters");
        }
        if (language == null || language.isBlank() || language.length() > 50) {
            throw new IllegalArgumentException("language cannot be null, empty or exceed 50 characters");
        }
        if (director == null || director.isBlank() || director.length() > 250) {
            throw new IllegalArgumentException("director cannot be null, empty or exceed 250 characters");
        }
        if (filmDateAt == null ) {
            throw new IllegalArgumentException("filmDateAt cannot be null");
        }
    }
}
