package com.alisson.ecommerceAPi.Services;

import com.alisson.ecommerceAPi.Models.Category;
import com.alisson.ecommerceAPi.Models.Product;
import com.alisson.ecommerceAPi.Repositories.CetegoryRepository;
import com.alisson.ecommerceAPi.Repositories.ProductsRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CetogoryService {

    @Autowired
    private CetegoryRepository repository;

    public List<Category> getAllProducts(){
        return repository.findAll();
    }

    public Category getProductById(Long id){
        return repository.getById(id);
    }

    public Category createProduct (Category category){
        return repository.save(category);
    }

    public Category updateProduct(Long id, Category category){
        Category dBCategory = getProductById(id);
        BeanUtils.copyProperties(category, dBCategory);
        return createProduct(dBCategory);
    }

    public void deleteProduct(Long id){
        repository.delete(getProductById(id));
    }

}
