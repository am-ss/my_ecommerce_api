package com.alisson.ecommerceAPi.Services;


import com.alisson.ecommerceAPi.Models.Category;
import com.alisson.ecommerceAPi.Models.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.List;

@SpringBootTest
public class ProductServiceTest {

    @Autowired
    public ProductsService service;


    @Test
    public void isGettingDataTest(){
        Product product = service.getProductById(1L);
        Assert.notNull(product, "Data is not getted");
    }

    @Test
    public void getAllProductsTest(){
        List<Product> products = service.getAllProducts();
        Assert.isTrue(products.size() >= 0, "The product list size is not bigger then 0");
    }

    
}
