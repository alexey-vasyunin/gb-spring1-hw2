package ru.vasyunin.services;

import ru.vasyunin.entities.Product;
import ru.vasyunin.repositories.ProductReppository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private ProductReppository repo;

    @Autowired
    public void setRepo(ProductReppository repo) {
        this.repo = repo;
    }

    public Product getProductById(Long id){
        return repo.getProductById(id);
    }

    public List<Product> getAllProducts(){
        return repo.getAllProducts();
    }

    public Product addProduct(Product product) {
        return repo.addProduct(product);
    }
}
