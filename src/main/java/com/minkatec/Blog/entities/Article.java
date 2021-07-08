package com.minkatec.Blog.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Article {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(nullable = false, length = 50,unique = true)
    String title;
    @Lob
    String content;
    @Column(nullable = true, length = 500)
    String summary;
    boolean visible;
    boolean chatty;
    LocalDateTime loadDate;
    @OneToMany( cascade = CascadeType.ALL)
    List<Comment> comments;
    @ManyToMany    @OrderColumn()
    Tag[] tags;
    int viewsCounts;






}
