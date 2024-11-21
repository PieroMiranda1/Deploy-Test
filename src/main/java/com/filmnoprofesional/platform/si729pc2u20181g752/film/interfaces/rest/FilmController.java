package com.filmnoprofesional.platform.si729pc2u20181g752.film.interfaces.rest;


import com.filmnoprofesional.platform.si729pc2u20181g752.film.domain.services.FilmCommandService;
import com.filmnoprofesional.platform.si729pc2u20181g752.film.interfaces.rest.resources.CreateFilmResource;
import com.filmnoprofesional.platform.si729pc2u20181g752.film.interfaces.rest.resources.FilmResource;
import com.filmnoprofesional.platform.si729pc2u20181g752.film.interfaces.rest.transform.CreateFilmCommandFromResourceAssembler;
import com.filmnoprofesional.platform.si729pc2u20181g752.film.interfaces.rest.transform.FilmResourceFromEntityAssembler;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/films", produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "Films", description = "Films API")
public class FilmController {

    private final FilmCommandService filmCommandService;

    public FilmController(FilmCommandService filmCommandService) {
        this.filmCommandService = filmCommandService;
    }


    @PostMapping
    @Operation(summary = "Create film", description = "Create new film")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Film created"),
            @ApiResponse(responseCode = "400", description = "Invalid input")
    })
    public ResponseEntity<FilmResource> createFilm(@RequestBody CreateFilmResource resource) {
        var createFilmCommand = CreateFilmCommandFromResourceAssembler.toCommandFromResource(resource);
        var film = filmCommandService.handle(createFilmCommand);
        if(film.isEmpty()) {
            return ResponseEntity.badRequest().build();
        }
        var createdFilm = film.get();
        var filmResource = FilmResourceFromEntityAssembler.toResourceFromEntity(createdFilm);
        return new ResponseEntity<>(filmResource, HttpStatus.CREATED);
    }
}
