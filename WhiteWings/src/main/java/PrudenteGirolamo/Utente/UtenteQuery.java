package PrudenteGirolamo.Utente;

import PrudenteGirolamo.Storage.TableQuery;

class UtenteQuery extends TableQuery {


    public UtenteQuery(String table) {
        super(table);
    }

    String selectUtenti(){
        return String.format("SELECT * FROM %s LIMIT ?,?;", this.table);
    }

    String selectUtente(){
        return String.format("SELECT * FROM %s WHERE email=?;",this.table);
    }

    String insertUtente(){
        return String.format("INSERT INTO %s ( username,password,email, telefono, admin, nome, cognome, citta, via, cap) VALUES ?,?,?,?,?,?,?,?,?,?;",this.table);
    }

    String updateUtente(){
        return String.format("UPDATE FROM %s SET nome=?,cognome=?, citta=?, via=?,cap=? WHERE email=?;",this.table);
    }

    String deleteUtente(){
        return String.format("DELETE FROM %s WHERE email=?;",this.table);
    }


}
