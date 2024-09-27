package service;

import modele.Employe;
import persistence.Employe_DAO;

public class EmployeService {

    Employe_DAO dao= new Employe_DAO();

    public EmployeService(Employe_DAO dao) {
        this.dao = dao;
    }


    public Employe findEmployeById(int idEmploye){
        return dao.findEmployeById(idEmploye);
    }
}
