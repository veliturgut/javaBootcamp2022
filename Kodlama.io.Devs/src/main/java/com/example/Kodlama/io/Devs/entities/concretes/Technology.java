package com.example.Kodlama.io.Devs.entities.concretes;

import com.fasterxml.jackson.annotation.JsonTypeId;
import lombok.*;

import javax.persistence.*;


@Table(name = "technology")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Technology {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "technology_name")
    private String technologyName;

    @Column(name = "language=id")
    private ProgrammingLanguage language;
}
