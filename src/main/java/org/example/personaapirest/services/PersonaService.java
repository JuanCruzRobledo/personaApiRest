package org.example.personaapirest.services;

import jakarta.transaction.Transactional;
import org.example.personaapirest.entities.Persona;
import org.example.personaapirest.repositories.BaseRepository;
import org.example.personaapirest.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService extends BaseServiceImpl <Persona,Long>{

    @Autowired
    private PersonaRepository personaRepository;

    public PersonaService(BaseRepository<Persona,Long> baseRepository){
        super(baseRepository);
    }

}
