package main.java.hr.java.covidportal.iznimke;

/**
 * Predstavlja neoznacenu iznimku koja se baca kada se u izvrsavanju
 * programa unese dva puta bolest drugog naziva, a istih simptoma
 */
public class BolestIstihSimptomaException extends RuntimeException{
    /**
     * Konstruktor koji prima objekt klase tipa String
     * @param message String poruka iznimke
     */
    public BolestIstihSimptomaException(String message) {
        super(message);
    }

    /**
     * Konstruktor koji prima objekt klase tipa Throwable
     * @param cause Throwable uzrok iznimke
     */
    public BolestIstihSimptomaException(Throwable cause) {
        super(cause);
    }

    /**
     * Konstruktor koji prima objekt klase tipa String i Throwable
     * @param message String poruka iznimke
     * @param cause Throwable uzrok iznimke
     */
    public BolestIstihSimptomaException(String message, Throwable cause) {
        super(message, cause);
    }
}
