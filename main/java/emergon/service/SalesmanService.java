/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emergon.service;

import emergon.entity.Salesman;
import emergon.repository.SalesmanRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Panos
 */
@Transactional
@Service
public class SalesmanService {

    @Autowired
    SalesmanRepo salesmanRepo;
    
    

    public List<Salesman> getSalesmen() {
        List<Salesman> salesmans = salesmanRepo.findAll();
        return salesmans;
    }

    public void addSalesman(Salesman salesman) {
        salesmanRepo.save(salesman);
    }

    public void deleteSalesman(int id) {
        salesmanRepo.delete(Salesman.class, id);
    }

    public Salesman getSalesmanById(int scode) {
         return salesmanRepo.findById(scode);
    }

    public Salesman updateSalesman(Salesman salesman) {//salesman argument contains the new data from the form
        return salesmanRepo.save(salesman);
    }
}
