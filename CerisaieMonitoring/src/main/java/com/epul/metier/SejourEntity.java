package com.epul.metier;

import org.hibernate.annotations.CollectionId;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "sejour", schema = "cerisaie", catalog = "")

public class SejourEntity {
    private int numeroSejour;
    private Date dateDebutSejour;
    private Date dateFinSejour;
    private int nbPersonnes;
    private ClientEntity clientByNumClient;
    private EmplacementEntity emplacementByNumEmplacement;

    @Id
    @Column(name = "NumSej")
    public int getNumeroSejour() {
        return numeroSejour;
    }

    public void setNumeroSejour(int numeroSejour) {
        this.numeroSejour = numeroSejour;
    }

    @Basic
    @Column(name = "DatedebSej")
    public Date getDateDebutSejour() {
        return dateDebutSejour;
    }

    public void setDateDebutSejour(Date dateDebutSejour) {
        this.dateDebutSejour = dateDebutSejour;
    }

    @Basic
    @Column(name = "DateFinSej")
    public Date getDateFinSejour() {
        return dateFinSejour;
    }

    public void setDateFinSejour(Date dateFinSejour) {
        this.dateFinSejour = dateFinSejour;
    }

    @Basic
    @Column(name = "NbPersonnes")
    public int getNbPersonnes() {
        return nbPersonnes;
    }

    public void setNbPersonnes(int nbPersonnes) {
        this.nbPersonnes = nbPersonnes;
    }

    @ManyToOne
    @JoinColumn(name = "NumCli", referencedColumnName = "NumCli", nullable = false)
    public ClientEntity getClientByNumClient() {
        return clientByNumClient;
    }

    public void setClientByNumClient(ClientEntity clientByNumClient) {
        this.clientByNumClient = clientByNumClient;
    }

    @ManyToOne
    @JoinColumn(name = "NumEmpl", referencedColumnName = "NumEmpl", nullable = false)
    public EmplacementEntity getEmplacementByNumEmplacement() {
        return emplacementByNumEmplacement;
    }

    public void setEmplacementByNumEmplacement(EmplacementEntity emplacementByNumEmplacement) {
        this.emplacementByNumEmplacement = emplacementByNumEmplacement;
    }
}
