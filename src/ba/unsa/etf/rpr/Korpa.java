package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl[] korpa = new Artikl[50] ;
    private static int duzina = 0;
    public Artikl[] getArtikli() {
        return korpa;
    }
    public int getDuzina() { return duzina;}
    public boolean dodajArtikl(Artikl a) {
        if (duzina < 50) {
            korpa[duzina]=a;
            duzina++;
            return true;
        }
        else return false;
    }
    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl a=new Artikl("0",0,"0");
        for (int i=0; i<duzina; i++) {
            if (korpa[i].getKod().equals(kod)) {
                a=korpa[i];
                for (int j=i; j<duzina-1; j++) {
                korpa[j]=korpa[j+1];
            }
                duzina--;
                return a;
            }
        }
        return null;
    }
    public int dajUkupnuCijenuArtikala() {
        int ukupna_cijena=0;
        for (int i=0; i<duzina; i++) {
            ukupna_cijena=ukupna_cijena+korpa[i].getCijena();
        }
        return ukupna_cijena;
    }

}
