package com.ecom.catalog.controller;

import com.ecom.catalog.dao.Product;
import com.ecom.catalog.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping(value = "/createProduct")
    public ResponseEntity<Product> createOrGetProduct(@RequestBody Product product)
            {
                Product product1 = productService.createProduct(product);
        return new ResponseEntity<Product>(product1, new HttpHeaders(), HttpStatus.OK);
    }

    @PostMapping(value = "/sortProducts")
    public ResponseEntity<Product> sortProducts(@RequestBody Product product)
    {
        Product product1 = productService.createProduct(product);
        return new ResponseEntity<Product>(product1, new HttpHeaders(), HttpStatus.OK);
    }

}
