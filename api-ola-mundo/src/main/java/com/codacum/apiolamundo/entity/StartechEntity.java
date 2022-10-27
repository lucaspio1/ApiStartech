package com.codacum.apiolamundo.entity;

import javax.persistence.*;

@Entity
@Table(name = "start_tech")
public class StartechEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column( name = "nome_participante")
    private String name;
    @Column(name =  "nome_do_mentor")
    private String mentorName;
}
