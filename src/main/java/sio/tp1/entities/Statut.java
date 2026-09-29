package sio.tp1.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "statut")
public class Statut {
    @Id
    @Column(name = "idStatut", nullable = false)
    private Integer id;

    @Column(name = "nomStatut", nullable = false, length = 20)
    private String nomStatut;

    @OneToMany(mappedBy = "statut")
    private Set<Employe> employes = new LinkedHashSet<>();

}