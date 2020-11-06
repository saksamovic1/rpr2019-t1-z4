package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void dodajArtikl() {
        Supermarket b = new Supermarket();
        b.dodajArtikl(new Artikl("Biciklo", 100, "20"));
        b.dodajArtikl(new Artikl("Biciklo", 100, "21"));
        assertEquals(2, b.getDuzina());
    }

    @Test
    void izbaciArtiklSaKodom() {
        Supermarket b = new Supermarket();
        b.dodajArtikl(new Artikl("Biciklo", 100, "20"));
        assertNull(b.izbaciArtiklSaKodom("21"));
    }
}