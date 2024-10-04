package org.example.personaapirest.services;

import org.example.personaapirest.entities.Autor;
import org.example.personaapirest.repositories.AutorRepository;
import org.example.personaapirest.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorService extends BaseServiceImpl<Autor,Long>{
    @Autowired
    private AutorRepository autorRepository;

    public AutorService(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
    }
}
