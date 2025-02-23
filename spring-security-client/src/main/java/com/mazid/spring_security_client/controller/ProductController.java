package com.mazid.spring_security_client.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    private record Product(int id, String name, double price) {}

    List<Product> products = new ArrayList<>(List.of(
        new Product(1, "Laptop", 10000.0),
        new Product(2, "Mobile", 5000.0)
    ));

    @GetMapping
    public List<Product> getProducts() {
        return products;
    }

    @PostMapping
    public Product saveProduct(@RequestBody Product product) {
        products.add(product);
        return product;
    }
}
