package PrudenteGirolamo.Utente;

import PrudenteGirolamo.Storage.Manager;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Optional;

public class UtenteManager extends Manager implements UtenteDao{

    private static final UtenteQuery QUERY= new UtenteQuery("Utente");

    public UtenteManager(DataSource source) {
        super(source);
    }

    @Override
    public ArrayList<Utente> fetchUtenti(int start, int end) throws SQLException {
       try(Connection conn = source.getConnection()){
           try(PreparedStatement ps=conn.prepareStatement(QUERY.selectUtenti())){
               ps.setInt(1,start);
               ps.setInt(2,end);
               ResultSet set = ps.executeQuery();
               ArrayList<Utente> utenti = new ArrayList<>();
               while(set.next()){
                   Utente utente = new Utente();
                   utente.setAdmin(set.getBoolean("ifAdmin")); //IfAdmin in parentesi è quello del database (NOME)
                   utente.setCap(set.getString("Cap"));
                   utente.setCitta(set.getString("Citta"));
                   utente.setVia(set.getString("Via"));
                   utente.setCognome(set.getString("Cognome"));
                   utente.setNome(set.getString("Nome"));
                   utente.setUsername(set.getString("Username"));
                   utente.setEmail(set.getString("email"));
                   utente.setPassword(set.getString("Psword"));
                   utente.setTelefono(set.getString("telefono"));
                   utenti.add(utente);
               }
               set.close();
               return utenti;
           }

       }
    }

    @Override
    public Optional<Utente> fetchUtente(String email) throws SQLException {
        return Optional.empty();
    }

    @Override
    public Integer createUtente(Utente utente) throws SQLException {
        return null;
    }

    @Override
    public Integer updateUtente(Utente utente) throws SQLException {
        return null;
    }

    @Override
    public Integer deleteUtente(String email) throws SQLException {
        return null;
    }
}
