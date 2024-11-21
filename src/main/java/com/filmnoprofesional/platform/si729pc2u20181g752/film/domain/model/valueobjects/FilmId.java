package com.filmnoprofesional.platform.si729pc2u20181g752.film.domain.model.valueobjects;

import jakarta.persistence.Embeddable;

/**
 * Value object to represent the film id.
 * @summary
 * This value object is used to represent the film id.
 * It is an embeddable object that is used to represent the film id in the film entity.
 * It throws an IllegalArgumentException if the film id is null or less than 1.
 * @see IllegalArgumentException
 * @param filmId The film id.It cannot be null or less than 1.
 */

@Embeddable
public record FilmId(Long filmId) {
    public FilmId {
        if (filmId == null || filmId < 1) {
            throw new IllegalArgumentException("Film id cannot be null or less than 1");
        }
    }
}
