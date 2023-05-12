package com.pool.repository;

import com.pool.model.Content;
import com.pool.model.Status;
import com.pool.model.Type;
import jakarta.annotation.PostConstruct;
import lombok.val;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ContentCollectionRepository {
   private final List<Content> CONTENTS=new ArrayList<>();

    public ContentCollectionRepository(){
    }

    public List<Content> findAll(){
        return CONTENTS;
    }
    public Optional<Content> findById(Integer id){
        return CONTENTS.stream().filter(content -> content.getId().equals(id)).findFirst();
    }

    @PostConstruct
    public void init(){
        val build = Content.builder()
                .id(408)
                .title("Dear Comrade")
                .desc("Provides tutorials")
                .contenType(Type.APP)
                .dateCreated(LocalDateTime.now())
                .status(Status.IN_PROGRESS)
                .url("http://dearcomred.com").build();
        CONTENTS.add(build);
    }

    public void create(Content content) {
        CONTENTS.removeIf(content1 -> content1.getId().equals(content.getId()));
        CONTENTS.add(content);
    }

    public boolean exists(Integer id) {
        return CONTENTS.stream().anyMatch(content -> content.getId().equals(id));
    }

    public void delete(Integer id){
        CONTENTS.removeIf(content -> content.getId().equals(id));
    }
}
