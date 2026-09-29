package sio.tp1.services;

import org.springframework.stereotype.Service;
import sio.tp1.entities.Employe;
import sio.tp1.repositories.RepositoryEmploye;

import java.util.List;

@Service
public class ServiceEmploye
{
    private final RepositoryEmploye repositoryEmploye;

    public ServiceEmploye(RepositoryEmploye repositoryEmploye) {
        this.repositoryEmploye = repositoryEmploye;
    }

    public List<Employe> getAllEmploye() {
        return this.repositoryEmploye.findAll();
    }
}
