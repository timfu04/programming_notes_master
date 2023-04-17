package com.clementlee.contentcalendar.controller;

import com.clementlee.contentcalendar.model.Content;
import com.clementlee.contentcalendar.respository.ContentCollectionRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("api/content")
public class ContentController {

    private final ContentCollectionRepository repository;

    public ContentController(ContentCollectionRepository repository) {
        this.repository = repository;
    }

    // "@GetMapping" handles GET request, empty path because the class already has a path of "api/content"
    @GetMapping("") // http://localhost:8080/api/content
    public List<Content> findAll(){
        return repository.findAll();
    }

    @GetMapping("/{id}") // e.g. http://localhost:8080/api/content/1
    public Content findById(@PathVariable Integer id){ // "@PathVariable" assigns whatever id in the path into the id in parameter
        // returns the value if present, or throw the exception
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Content not found!"));
    }

    @ResponseStatus(HttpStatus.CREATED) // return HTTP status 201 (means something created)
    @PostMapping("") // http://localhost:8080/api/content
    public void create(@RequestBody Content content){ // "@RequestBody" allows content to be sent as request body in a request
        repository.save(content);
    }
}


