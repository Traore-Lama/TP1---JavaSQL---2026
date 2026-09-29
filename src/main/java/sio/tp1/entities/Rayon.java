package sio.tp1.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "rayon")
public class Rayon {
    @Id
    @Column(name = "idRayon", nullable = false)
    private Integer id;

    @Column(name = "nomRayon", nullable = false, length = 20)
    private String nomRayon;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "numSecteur", nullable = false)
    private Secteur numSecteur;

    @OneToMany(mappedBy = "codeRayon")
    private Set<Travailler> travaillers = new LinkedHashSet<>();

}