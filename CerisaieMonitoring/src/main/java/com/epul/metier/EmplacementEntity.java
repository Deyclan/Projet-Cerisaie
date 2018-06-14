package com.epul.metier;

import javax.persistence.*;

@Entity
@Table(name = "emplacement", schema = "cerisaie", catalog = "")

public class EmplacementEntity {

    private int numEmplacement;
    private int surfaceEmplacement;
    private int nbPersonneMaxEmplacement;
    private TypeEmplacementEntity emplacementByCodeTypeE;

    @Id
    @Column(name = "NumEmpl")
    public Integer getNumEmplacement() {
        return numEmplacement;
    }

    public void setNumEmplacement(int numEmplacement) {
        this.numEmplacement = numEmplacement;
    }

    @Basic
    @Column(name = "SurfaceEmpl")
    public int getSurfaceEmplacement() {
        return surfaceEmplacement;
    }

    public void setSurfaceEmplacement(int surfaceEmplacement) {
        this.surfaceEmplacement = surfaceEmplacement;
    }

    @Basic
    @Column(name = "NbPersMaxEmpl")
    public int getNbPersonneMaxEmplacement() {
        return nbPersonneMaxEmplacement;
    }

    public void setNbPersonneMaxEmplacement(int nbPersonneMaxEmplacement) {
        this.nbPersonneMaxEmplacement = nbPersonneMaxEmplacement;
    }

    @ManyToOne
    @JoinColumn(name = "CodeTypeE", referencedColumnName = "CodeTypeE", nullable = false)
    public TypeEmplacementEntity getEmplacementByCodeTypeE() {
        return emplacementByCodeTypeE;
    }

    public void setEmplacementByCodeTypeE(TypeEmplacementEntity emplacementByCodeTypeE) {
        this.emplacementByCodeTypeE = emplacementByCodeTypeE;
    }
}
