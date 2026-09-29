package sio.tp1.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "employe")
public class Employe {
    @Id
    @Column(name = "idEmploye", nullable = false)
    private Integer id;

    @Column(name = "nomEmploye", nullable = false, length = 20)
    private String nomEmploye;

    @Column(name = "prenomEmploye", nullable = false, length = 20)
    private String prenomEmploye;

    @Column(name = "ageEmploye", nullable = false)
    private Integer ageEmploye;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "numStatut", nullable = false)
    private Statut statut;

    @OneToMany(mappedBy = "codeEmploye")
    private Set<Travailler> travaillers = new LinkedHashSet<>();

}