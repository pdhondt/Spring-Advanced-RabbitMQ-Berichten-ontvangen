package be.vdab.voorraad.services;

import be.vdab.voorraad.domain.Artikel;
import be.vdab.voorraad.repositories.ArtikelRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ArtikelService {
    private final ArtikelRepository artikelRepository;

    public ArtikelService(ArtikelRepository artikelRepository) {
        this.artikelRepository = artikelRepository;
    }
    public void create(Artikel artikel) {
        artikelRepository.save(artikel);
    }
}
