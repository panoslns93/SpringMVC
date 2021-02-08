/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emergon.service;

import emergon.entity.Product;
import emergon.repository.ProductRepo;
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
public class ProductService {

    @Autowired
    ProductRepo productRepo;
    
   

    public List<Product> getProducts() {
        List<Product> products = productRepo.findAll();
        return products;
    }

    public void addProduct(Product product) {
        productRepo.save(product);
    }

    public void deleteProduct(int id) {
        productRepo.delete(Product.class, id);
    }

    public Product getProductById(int pcode) {
        return productRepo.find(pcode);
    }

    public Product updateProduct(Product product) {//customer argument contains the new data from the form
        return productRepo.save(product);
    }
}
