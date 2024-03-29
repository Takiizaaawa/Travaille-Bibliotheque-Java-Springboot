package org.cd.spring.bibliotheque.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "livres")
public class Livre {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String titre;

    private String auteur;

    private Date datePublication;

    private int nombreDisponible;

}
