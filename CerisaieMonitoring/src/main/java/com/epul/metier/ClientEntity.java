package com.epul.metier;

import javax.persistence.*;

@Entity
@Table(name = "client", schema = "cerisaie", catalog = "")

public class ClientEntity {
    private int numeroClient;
    private String nomClient;
    private String adresseRueClient;
    private int codePostalClient;
    private String villeClient;
    private String pieceClient;
    private int numeroPieceClient;

    @Id
    @Column(name = "NumCli")
    public int getNumeroClient() {
        return numeroClient;
    }

    public void setNumeroClient(int numeroClient) {
        this.numeroClient = numeroClient;
    }

    @Basic
    @Column(name = "NomCli")
    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    @Basic
    @Column(name = "AdrRueCli")
    public String getAdresseRueClient() {
        return adresseRueClient;
    }

    public void setAdresseRueClient(String adresseRueClient) {
        this.adresseRueClient = adresseRueClient;
    }

    @Basic
    @Column(name = "CpCli")
    public int getCodePostalClient() {
        return codePostalClient;
    }

    public void setCodePostalClient(int codePostalClient) {
        this.codePostalClient = codePostalClient;
    }

    @Basic
    @Column(name = "VilleCli")
    public String getVilleClient() {
        return villeClient;
    }

    public void setVilleClient(String villeClient) {
        this.villeClient = villeClient;
    }

    @Basic
    @Column(name = "PieceCli")
    public String getPieceClient() {
        return pieceClient;
    }

    public void setPieceClient(String pieceClient) {
        this.pieceClient = pieceClient;
    }

    @Basic
    @Column(name = "NumPieceCli")
    public int getNumeroPieceClient() {
        return numeroPieceClient;
    }

    public void setNumeroPieceClient(int numeroPieceClient) {
        this.numeroPieceClient = numeroPieceClient;
    }
}
