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

    public List<Product> getProductByCategory(int categoryId){
        List<Product> productList = repository.getProductsByCategoty(categoryId);
        return productList;
    }

    public List<Product> searchProductsByName(String name){
        List<Product> productList = repository.searchProductsByName(name);
        return productList;
    }


    public Product updateProduct(Long id, Product product){
        Product dBProduct = getProductById(id);
        BeanUtils.copyProperties(product, dBProduct);
        return createProduct(dBProduct);
    }

    public void deleteProduct(Long id){
        repository.delete(getProductById(id));
    }

}
