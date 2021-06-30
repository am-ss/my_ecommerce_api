package com.alisson.ecommerceAPi.Controllers;

import com.alisson.ecommerceAPi.Inputs.ProductInput;
import com.alisson.ecommerceAPi.Models.Product;
import com.alisson.ecommerceAPi.Services.CategoryService;
import com.alisson.ecommerceAPi.Services.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@Component
@RestController
@RequestMapping("/products")
public class ProductsController {

    @Autowired
    private ProductsService service;



    @GetMapping
    public ResponseEntity<?> getAllProducts(){
        var respose = service.getAllProducts();
        return ResponseEntity.ok(respose);
    }

    @PostMapping
    public ResponseEntity<?> registerProduct(@RequestBody ProductInput product){
        var respose = service.createProduct(product);
        return ResponseEntity.ok(respose);
    }


}
