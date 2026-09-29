package sio.tp1.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "secteur")
public class Secteur {
    @Id
    @Column(name = "idSecteur", nullable = false)
    private Integer id;

    @Column(name = "nomSecteur", nullable = false, length = 20)
    private String nomSecteur;

    @OneToMany(mappedBy = "numSecteur")
    private Set<Rayon> rayons = new LinkedHashSet<>();

}