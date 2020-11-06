package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void dodajArtikl() {
        Korpa b = new Korpa();
        b.dodajArtikl(new Artikl("Biciklo", 100, "20"));
        assertEquals(1, b.getDuzina());
    }

    @Test
    void izbaciArtiklSaKodom() {
        Korpa b = new Korpa();
        b.dodajArtikl(new Artikl("Biciklo", 100, "20"));
        assertNotNull(b.izbaciArtiklSaKodom("20"));
    }

}