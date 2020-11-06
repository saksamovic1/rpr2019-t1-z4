package ba.unsa.etf.rpr;

public class Supermarket {
    private static Artikl[] supermarket;
    private static int duzina;
    Supermarket() { duzina=0; supermarket = new Artikl[1000]; }
    public int getDuzina() { return duzina; }
    public void dodajArtikl(Artikl a) {
        if (duzina<1000) {
            supermarket[duzina]=a;
            duzina++;
        } else System.out.println("Dostignut maksimalan broj artikala.");
    }
    public Artikl[] getArtikli() {
        return supermarket;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl a=new Artikl("0",0,"0");

        for (int i=0; i<duzina; i++) {
            if (supermarket[i].getKod().equals(kod)) {
                a = supermarket[i];
                for (int j = i; j < duzina - 1; j++) {
                    supermarket[j] = supermarket[j + 1];
                }
                duzina--;
                return a;
            }
        }
        return null;
    }
}
