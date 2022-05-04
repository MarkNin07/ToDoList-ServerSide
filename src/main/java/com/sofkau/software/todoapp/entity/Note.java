package com.sofkau.software.todoapp.entity;

import lombok.Data;
import javax.persistence.*;


@Entity(name="Note")
@Table(name="NOTE")
@Data
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    private String message;

    private boolean done;

}
