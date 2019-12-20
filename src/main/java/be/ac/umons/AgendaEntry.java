package be.ac.umons;

import java.util.Date;

public class AgendaEntry  {
    private int id_agenda;
    private Date Datedébut;
    private Date Datefin;

    public AgendaEntry(int id_agenda, Date Datedébut,Date Datefin){}

    public Date getDatedébut() {
        return Datedébut;
    }

    public Date getDatefin() {
        return Datefin;
    }

    public int getId_agenda() {
        return id_agenda;
    }

    public String toString(){
        return this.toString();
    }

}
