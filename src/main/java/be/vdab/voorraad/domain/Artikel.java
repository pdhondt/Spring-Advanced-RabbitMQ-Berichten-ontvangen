package be.vdab.voorraad.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "artikels")
public class Artikel {
    @Id
    private long id;
    private int voorraad;

    public Artikel(long id) {
        this.id = id;
    }
    protected Artikel() {

    }
}
