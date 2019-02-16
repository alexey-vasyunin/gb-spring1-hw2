package com.geekbrains.controllers;

import com.geekbrains.entities.Product;
import com.geekbrains.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.jws.WebParam;

@Controller
@RequestMapping("/products")
public class ProductController {
    private ProductService service;
    @Autowired
    public void setService(ProductService service) {
        this.service = service;
    }

    @RequestMapping(path = "/details/{id}", method = RequestMethod.GET)
    public String getProductById(@PathVariable("id") Long id, Model model){
        model.addAttribute("product", service.getProductById(id));
        return "product";
    }

    @RequestMapping(path = "/")
    public String showAll(Model model){
        model.addAttribute("products", service.getAllProducts());
        return "all-products";
    }

    @RequestMapping(path = "/add")
    public String addProductForm(Model model){
        model.addAttribute("product", new Product());
        return "add-product-form";
    }

    @RequestMapping(path = "/add-new-one")
    public String addProduct(@ModelAttribute("student")Product product, Model model){
        model.addAttribute("product", service.addProduct(product));
        return "added-product";
    }

}
