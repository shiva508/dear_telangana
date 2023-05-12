package com.pool.controller;

import com.pool.model.Content;
import com.pool.repository.ContentCollectionRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;

@RestController
@RequestMapping("/api/content")
public class ContentController {
    private final ContentCollectionRepository contentCollectionRepository;

    public ContentController(ContentCollectionRepository contentCollectionRepository) {
        this.contentCollectionRepository = contentCollectionRepository;
    }

    @GetMapping("/all")
    public List<Content> findAll(){
        return contentCollectionRepository.findAll();
    }
    @GetMapping("/{id}")
    public Content findById(@PathVariable("id") Integer id){
       return contentCollectionRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/create")
    public void create(@RequestBody Content content){
        contentCollectionRepository.create(content);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/update/{id}")
    public void update(@RequestBody Content content,@PathVariable("id") Integer id){
        if(contentCollectionRepository.exists(id)){
                throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        contentCollectionRepository.create(content);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Integer id){
        contentCollectionRepository.delete(id);
    }
}
