package main.java.hr.java.covidportal.iznimke;

/**
 * Predstavlja oznacenu iznimku koja se baca kada se u izvrsavanju
 * programa unese dva puta ista kontaktirana osoba
 */
public class DuplikatKontaktiraneOsobeException extends Exception {
    /**
     * Konstruktor koji prima objekt klase tipa String
     * @param message String poruka iznimke
     */
    public DuplikatKontaktiraneOsobeException(String message) {
        super(message);
    }

    /**
     * Konstruktor koji prima objekt klase tipa Throwable
     * @param cause Throwable uzrok iznimke
     */
    public DuplikatKontaktiraneOsobeException(Throwable cause) {
        super(cause);
    }

    /**
     * Konstruktor koji prima objekt klase tipa String i Throwable
     * @param message String poruka iznimke
     * @param cause Throwable uzrok iznimke
     */
    public DuplikatKontaktiraneOsobeException(String message, Throwable cause) {
        super(message, cause);
    }
}
