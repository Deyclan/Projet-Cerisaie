package model;

import java.io.Serializable;
import java.sql.Date;

public class Activite implements Serializable {

    private int codeSport;
    private Date dateJour;
    private int numSej;
    private short nbLoc;
    private SportEntity sportByCodeSport;
    private SejourEntity sejourByNumSej;

    public int getCodeSport() {
        return codeSport;
    }

    public void setCodeSport(int codeSport) {
        this.codeSport = codeSport;
    }

    public Date getDateJour() {
        return dateJour;
    }

    public void setDateJour(Date dateJour) {
        this.dateJour = dateJour;
    }

    public int getNumSej() {
        return numSej;
    }

    public void setNumSej(int numSej) {
        this.numSej = numSej;
    }

    public short getNbLoc() {
        return nbLoc;
    }

    public void setNbLoc(short nbLoc) {
        this.nbLoc = nbLoc;
    }

    public SportEntity getSportByCodeSport() {
        return sportByCodeSport;
    }

    public void setSportByCodeSport(SportEntity sportByCodeSport) {
        this.sportByCodeSport = sportByCodeSport;
    }

    public SejourEntity getSejourByNumSej() {
        return sejourByNumSej;
    }

    public void setSejourByNumSej(SejourEntity sejourByNumSej) {
        this.sejourByNumSej = sejourByNumSej;
    }
}
