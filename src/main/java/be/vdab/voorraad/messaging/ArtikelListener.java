package be.vdab.voorraad.messaging;

import be.vdab.voorraad.events.ArtikelGemaakt;
import be.vdab.voorraad.services.ArtikelService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class ArtikelListener {
    private final ArtikelService artikelService;

    public ArtikelListener(ArtikelService artikelService) {
        this.artikelService = artikelService;
    }
    @RabbitListener(queues = "voorraad")
    void verwerkBericht(ArtikelGemaakt gemaakt) {
        artikelService.create(gemaakt.naarArtikel());
    }
}
