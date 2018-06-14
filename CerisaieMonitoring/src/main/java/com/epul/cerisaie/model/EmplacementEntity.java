package com.epul.cerisaie.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "emplacement", schema = "cerisaie", catalog = "")
public class EmplacementEntity {
    private int numEmpl;
    private int codeTypeE;
    private short surfaceEmpl;
    private short nbPersMaxEmpl;
    private TypeEmplacementEntity typeEmplacementByCodeTypeE;
    private Collection<SejourEntity> sejoursByNumEmpl;

    @Id
    @Column(name = "NumEmpl", nullable = false)
    public int getNumEmpl() {
        return numEmpl;
    }

    public void setNumEmpl(int numEmpl) {
        this.numEmpl = numEmpl;
    }

    @Basic
    @Column(name = "CodeTypeE", nullable = false)
    public int getCodeTypeE() {
        return codeTypeE;
    }

    public void setCodeTypeE(int codeTypeE) {
        this.codeTypeE = codeTypeE;
    }

    @Basic
    @Column(name = "SurfaceEmpl", nullable = false)
    public short getSurfaceEmpl() {
        return surfaceEmpl;
    }

    public void setSurfaceEmpl(short surfaceEmpl) {
        this.surfaceEmpl = surfaceEmpl;
    }

    @Basic
    @Column(name = "NbPersMaxEmpl", nullable = false)
    public short getNbPersMaxEmpl() {
        return nbPersMaxEmpl;
    }

    public void setNbPersMaxEmpl(short nbPersMaxEmpl) {
        this.nbPersMaxEmpl = nbPersMaxEmpl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmplacementEntity that = (EmplacementEntity) o;

        if (numEmpl != that.numEmpl) return false;
        if (codeTypeE != that.codeTypeE) return false;
        if (surfaceEmpl != that.surfaceEmpl) return false;
        if (nbPersMaxEmpl != that.nbPersMaxEmpl) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = numEmpl;
        result = 31 * result + codeTypeE;
        result = 31 * result + (int) surfaceEmpl;
        result = 31 * result + (int) nbPersMaxEmpl;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "CodeTypeE", referencedColumnName = "CodeTypeE", nullable = false, insertable = false, updatable = false)
    public TypeEmplacementEntity getTypeEmplacementByCodeTypeE() {
        return typeEmplacementByCodeTypeE;
    }

    public void setTypeEmplacementByCodeTypeE(TypeEmplacementEntity typeEmplacementByCodeTypeE) {
        this.typeEmplacementByCodeTypeE = typeEmplacementByCodeTypeE;
    }

    @OneToMany(mappedBy = "emplacementByNumEmpl")
    public Collection<SejourEntity> getSejoursByNumEmpl() {
        return sejoursByNumEmpl;
    }

    public void setSejoursByNumEmpl(Collection<SejourEntity> sejoursByNumEmpl) {
        this.sejoursByNumEmpl = sejoursByNumEmpl;
    }
}
