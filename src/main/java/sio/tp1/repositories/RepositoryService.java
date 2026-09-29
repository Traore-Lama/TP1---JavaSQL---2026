package sio.tp1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sio.tp1.entities.Secteur;

@Repository
public interface RepositoryService extends JpaRepository<Secteur, Integer>
{

}
