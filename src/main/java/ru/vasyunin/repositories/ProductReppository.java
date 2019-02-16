package ru.vasyunin.repositories;

import ru.vasyunin.entities.Product;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

@Component
public class ProductReppository {
    TreeMap<Long, Product> repo;

    @PostConstruct
    public void init(){
        repo = new TreeMap<>();
        repo.put(1L, new Product(1L, "Телевизор Березка 212", 2500L));
        repo.put(2L, new Product(2L, "Электромиксер Фея 2", 500L));
        repo.put(3L, new Product(3L, "Электросамовар Пых", 1000L));
        repo.put(4L, new Product(4L, "Часы с кукушкой", 1299L));
        repo.put(5L, new Product(5L, "Шар для боулинга №13 розовый", 2999L));
    }

    public Product getProductById(Long id){
        return repo.get(id);
    }

    public List<Product> getAllProducts(){
        return new ArrayList<>(repo.values());
    }

    public Product addProduct(Product product){
        long newId = repo.lastKey()+1L;
        product.setId(newId);
        repo.put(newId, product);
        return product;
    }
}
