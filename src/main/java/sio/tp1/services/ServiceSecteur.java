package sio.tp1.services;

import org.springframework.stereotype.Service;
import sio.tp1.entities.Secteur;
import sio.tp1.repositories.RepositoryEmploye;
import sio.tp1.repositories.RepositoryService;

import java.util.List;

@Service
public class ServiceSecteur
{
    private final RepositoryService repositoryService;

    public ServiceSecteur(RepositoryService repositoryService) {
        this.repositoryService = repositoryService;
    }

    public List<Secteur> getAllSecteur()
    {
        return repositoryService.findAll();
    }
}
