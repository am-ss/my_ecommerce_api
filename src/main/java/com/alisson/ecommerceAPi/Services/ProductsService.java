package com.alisson.ecommerceAPi.Services;

import com.alisson.ecommerceAPi.Models.Product;
import com.alisson.ecommerceAPi.Repositories.ProductsRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsService {

    @Autowired
    private ProductsRepository repository;

    public List<Product> getAllProducts(){
        return repository.findAll();
    }

    public Product getProductById(Long id){
        return repository.getById(id);
    }

    public Product createProduct (Product product){
        return repository.save(product);
    }

    public Product updateProduct(Long id, Product product){
        Product dBProduct = getProductById(id);
        BeanUtils.copyProperties(product, dBProduct);
        return createProduct(dBProduct);
    }

    public void teste(){
        System.out.println("teste");
    }


    public void deleteProduct(Long id){
        repository.delete(getProductById(id));
    }

}
