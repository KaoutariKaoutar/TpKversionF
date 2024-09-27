package service;

import persistence.AbonneDAO;

public class AbonneService {
    AbonneDAO abonneDAO;

    public AbonneService(AbonneDAO dao) {
        this.abonneDAO = dao;
    }

    public void addAbonne (String nom, String prenom, String email, String adresse){
        abonneDAO.addAbonne(nom, prenom, email, adresse);
    }
    public boolean verifierExistenceAbonne(String nom, String email) {
        return abonneDAO.doesAbonneExist(nom, email);
    }
}
