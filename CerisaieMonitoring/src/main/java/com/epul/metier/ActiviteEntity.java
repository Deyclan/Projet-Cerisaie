package com.epul.metier;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "activite", schema = "cerisaie", catalog = "")

public class ActiviteEntity {
    private int codeSport;
    private Date DateJour;
    private int numeroSejour;
    private int nbLocataire;
    private SportEntity sportByCodeSport;
    private SejourEntity sejourByNumSejour;

    @Id
    @Column(name = "CodeSport")
    public int getCodeSport() {
        return codeSport;
    }

    public void setCodeSport(int codeSport) {
        this.codeSport = codeSport;
    }

    @Id
    @Column(name = "DateJour")
    public Date getDateJour() {
        return DateJour;
    }

    public void setDateJour(Date dateJour) {
        DateJour = dateJour;
    }

    @Id
    @Column(name = "NumSej")
    public int getNumeroSejour() {
        return numeroSejour;
    }

    public void setNumeroSejour(int nombreSejour) {
        this.numeroSejour = nombreSejour;
    }

    @Basic
    @Column(name = "NbLoc")
    public int getNbLocataire() {
        return nbLocataire;
    }

    public void setNbLocataire(int nbLocataire) {
        this.nbLocataire = nbLocataire;
    }

    @MapsId("numeroSejour")
    @ManyToOne
    @JoinColumn(name = "NumSej", referencedColumnName = "NumSej", nullable = false)
    public SejourEntity getSejourByNumSejour() {
        return sejourByNumSejour;
    }

    public void setSejourByNumSejour(SejourEntity sejourByNumSejour) {
        this.sejourByNumSejour = sejourByNumSejour;
    }

    @MapsId("codeSport")
    @ManyToOne
    @JoinColumn(name = "CodeSport", referencedColumnName = "CodeSport", nullable = false)
    public SportEntity getSportByCodeSport() {
        return sportByCodeSport;
    }

    public void setSportByCodeSport(SportEntity sportByCodeSport) {
        this.sportByCodeSport = sportByCodeSport;
    }
}
