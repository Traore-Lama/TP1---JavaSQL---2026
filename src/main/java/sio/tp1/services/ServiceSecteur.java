package sio.tp1.services;

import org.springframework.stereotype.Service;
import sio.tp1.entities.Secteur;
import sio.tp1.repositories.RepositorySecteur;

import java.util.List;

@Service
public class ServiceSecteur
{
    private final RepositorySecteur repositoryService;

    public ServiceSecteur(RepositorySecteur repositoryService) {
        this.repositoryService = repositoryService;
    }

    public List<Secteur> getAllSecteur()
    {
        return repositoryService.findAll();
    }
}
