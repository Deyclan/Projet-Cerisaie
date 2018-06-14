package com.epul.metier;

import javax.persistence.*;

@Entity
@Table(name = "sport", schema = "cerisaie", catalog = "")

public class SportEntity {
    private int codeSport;
    private String libelleSport;
    private String uniteTempsSport;
    private int tarifUnite;

    @Id
    @Column(name = "CodeSport")
    public int getCodeSport() {
        return codeSport;
    }

    public void setCodeSport(int codeSport) {
        this.codeSport = codeSport;
    }

    @Basic
    @Column(name = "LibelleSport")
    public String getLibelleSport() {
        return libelleSport;
    }

    public void setLibelleSport(String libelleSport) {
        this.libelleSport = libelleSport;
    }

    @Basic
    @Column(name = "UniteTpsSport")
    public String getUniteTempsSport() {
        return uniteTempsSport;
    }

    public void setUniteTempsSport(String uniteTempsSport) {
        this.uniteTempsSport = uniteTempsSport;
    }

    @Basic
    @Column(name = "TarifUnite")
    public int getTarifUnite() {
        return tarifUnite;
    }

    public void setTarifUnite(int tarifUnite) {
        this.tarifUnite = tarifUnite;
    }
}
