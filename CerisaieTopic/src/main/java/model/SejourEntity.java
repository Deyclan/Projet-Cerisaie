package model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;

@Entity
@Table(name = "sejour", schema = "cerisaie", catalog = "")
public class SejourEntity {
    private int numSej;
    private int numCli;
    private int numEmpl;
    private Date datedebSej;
    private Date dateFinSej;
    private int nbPersonnes;
    private Collection<ActiviteEntity> activitesByNumSej;
    private ClientEntity clientByNumCli;
    private EmplacementEntity emplacementByNumEmpl;

    @Id
    @Column(name = "NumSej", nullable = false)
    public int getNumSej() {
        return numSej;
    }

    public void setNumSej(int numSej) {
        this.numSej = numSej;
    }

    @Basic
    @Column(name = "NumCli", nullable = false)
    public int getNumCli() {
        return numCli;
    }

    public void setNumCli(int numCli) {
        this.numCli = numCli;
    }

    @Basic
    @Column(name = "NumEmpl", nullable = false)
    public int getNumEmpl() {
        return numEmpl;
    }

    public void setNumEmpl(int numEmpl) {
        this.numEmpl = numEmpl;
    }

    @Basic
    @Column(name = "DatedebSej", nullable = false)
    public Date getDatedebSej() {
        return datedebSej;
    }

    public void setDatedebSej(Date datedebSej) {
        this.datedebSej = datedebSej;
    }

    @Basic
    @Column(name = "DateFinSej", nullable = true)
    public Date getDateFinSej() {
        return dateFinSej;
    }

    public void setDateFinSej(Date dateFinSej) {
        this.dateFinSej = dateFinSej;
    }

    @Basic
    @Column(name = "NbPersonnes", nullable = false)
    public int getNbPersonnes() {
        return nbPersonnes;
    }

    public void setNbPersonnes(int nbPersonnes) {
        this.nbPersonnes = nbPersonnes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SejourEntity that = (SejourEntity) o;

        if (numSej != that.numSej) return false;
        if (numCli != that.numCli) return false;
        if (numEmpl != that.numEmpl) return false;
        if (nbPersonnes != that.nbPersonnes) return false;
        if (datedebSej != null ? !datedebSej.equals(that.datedebSej) : that.datedebSej != null) return false;
        if (dateFinSej != null ? !dateFinSej.equals(that.dateFinSej) : that.dateFinSej != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = numSej;
        result = 31 * result + numCli;
        result = 31 * result + numEmpl;
        result = 31 * result + (datedebSej != null ? datedebSej.hashCode() : 0);
        result = 31 * result + (dateFinSej != null ? dateFinSej.hashCode() : 0);
        result = 31 * result + nbPersonnes;
        return result;
    }

    @OneToMany(mappedBy = "sejourByNumSej")
    public Collection<ActiviteEntity> getActivitesByNumSej() {
        return activitesByNumSej;
    }

    public void setActivitesByNumSej(Collection<ActiviteEntity> activitesByNumSej) {
        this.activitesByNumSej = activitesByNumSej;
    }

    @ManyToOne
    @JoinColumn(name = "NumCli", referencedColumnName = "NumCli", nullable = false)
    public ClientEntity getClientByNumCli() {
        return clientByNumCli;
    }

    public void setClientByNumCli(ClientEntity clientByNumCli) {
        this.clientByNumCli = clientByNumCli;
    }

    @ManyToOne
    @JoinColumn(name = "NumEmpl", referencedColumnName = "NumEmpl", nullable = false)
    public EmplacementEntity getEmplacementByNumEmpl() {
        return emplacementByNumEmpl;
    }

    public void setEmplacementByNumEmpl(EmplacementEntity emplacementByNumEmpl) {
        this.emplacementByNumEmpl = emplacementByNumEmpl;
    }
}
