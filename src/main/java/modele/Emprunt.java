package modele;


import jakarta.persistence.*;

import java.sql.Date;

@Entity
    public class Emprunt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEmprunt;

    private Date dateEmprunt;

    private Date dateRetour;

    @ManyToOne
    @JoinColumn(name = "idLivre")
    private Livre livre;

    @ManyToOne
    @JoinColumn(name = "idAbonne")
    private Abonne abonne;

    // Constructeurs

    public Emprunt() {}

    public Emprunt(int idEmprunt, Date dateEmprunt, Date dateRetour, Livre livre, Abonne abonne) {
        this.idEmprunt = idEmprunt;
        this.dateEmprunt = dateEmprunt;
        this.dateRetour = dateRetour;
        this.livre = livre;
        this.abonne = abonne;
    }

    // Getters et Setters

    public int getIdEmprunt() {
        return idEmprunt;
    }

    public void setIdEmprunt(int idEmprunt) {
        this.idEmprunt = idEmprunt;
    }

    public Date getDateEmprunt() {
        return dateEmprunt;
    }

    public void setDateEmprunt(Date dateEmprunt) {
        this.dateEmprunt = dateEmprunt;
    }

    public Date getDateRetour() {
        return dateRetour;
    }

    public void setDateRetour(Date dateRetour) {
        this.dateRetour = dateRetour;
    }

    public Livre getLivre() {
        return livre;
    }

    public void setLivre(Livre livre) {
        this.livre = livre;
    }

    public Abonne getAbonne() {
        return abonne;
    }

    public void setAbonne(Abonne abonne) {
        this.abonne = abonne;
    }

    @Override
    public String toString() {
        return "Emprunt{" +
                "idEmprunt=" + idEmprunt +
                ", dateEmprunt=" + dateEmprunt +
                ", dateRetour=" + dateRetour +
                ", livre=" + livre +
                ", abonne=" + abonne +
                '}';
    }
}

