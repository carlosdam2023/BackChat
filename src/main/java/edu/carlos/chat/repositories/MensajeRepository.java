package edu.carlos.chat.repositories;

import edu.carlos.chat.models.Mensaje;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


import java.util.List;


@Repository
public interface MensajeRepository extends MongoRepository<Mensaje, String> {
    List<Mensaje> findByUsername(String username);
}
