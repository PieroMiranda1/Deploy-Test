package com.filmnoprofesional.platform.si729pc2u20181g752.film.domain.model.valueobjects;

import jakarta.validation.constraints.Email;

public record EmailAddress(@Email String address) {
    public EmailAddress() {
        this(null);
    }
}
