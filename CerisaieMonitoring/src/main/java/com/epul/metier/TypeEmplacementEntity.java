package com.epul.metier;

import javax.persistence.*;

@Entity
@Table(name = "type_emplacement", schema = "cerisaie", catalog = "")

public class TypeEmplacementEntity {
    private int codeTypeE;
    private String libelleTypeEmplacement;
    private int tarifTypeEmplacement;

    @Id
    @Column(name = "CodeTypeE")
    public int getCodeTypeE() {
        return codeTypeE;
    }

    public void setCodeTypeE(int codeTypeE) {
        this.codeTypeE = codeTypeE;
    }

    @Basic
    @Column(name = "LIBTYPEPL")
    public String getLibelleTypeEmplacement() {
        return libelleTypeEmplacement;
    }

    public void setLibelleTypeEmplacement(String libelleTypeEmplacement) {
        this.libelleTypeEmplacement = libelleTypeEmplacement;
    }

    @Basic
    @Column(name = "TARIFTYPEPL")
    public int getTarifTypeEmplacement() {
        return tarifTypeEmplacement;
    }

    public void setTarifTypeEmplacement(int tarifTypeEmplacement) {
        this.tarifTypeEmplacement = tarifTypeEmplacement;
    }
}
