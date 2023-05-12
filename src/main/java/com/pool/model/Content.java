package com.pool.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Content {

    private Integer id;
    private String title;
    private String desc;
    private Status status;
    private Type contenType;
    private LocalDateTime dateCreated;
    private LocalDateTime datePublished;
    private String url;

}
