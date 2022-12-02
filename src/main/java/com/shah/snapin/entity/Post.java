package com.shah.snapin.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "post")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne()
    private User user;

    private Long likes;
    private String link;
    private String description;

}
