package PrudenteGirolamo.Utente;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Optional;

public interface UtenteDao {

    ArrayList<Utente> fetchUtenti(int start,int end) throws SQLException;

    Optional<Utente> fetchUtente(String email) throws SQLException;

    Integer createUtente(Utente utente) throws SQLException;

    Integer updateUtente(Utente utente) throws SQLException;

    Integer deleteUtente(String email) throws SQLException;
}
