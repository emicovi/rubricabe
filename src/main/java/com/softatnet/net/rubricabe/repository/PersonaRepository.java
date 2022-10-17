package com.softatnet.net.rubricabe.repository;

import com.softatnet.net.rubricabe.entity.PersonaEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonaRepository extends CrudRepository<PersonaEntity, String> {

        boolean existsByNome(String nome);

        PersonaEntity findByCodiceFiscale(String codiceFiscale);

        List<PersonaEntity> findByNome(String nome);
}
