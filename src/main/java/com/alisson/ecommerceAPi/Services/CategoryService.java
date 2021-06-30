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
public class CategoryService {

    @Autowired
    private CetegoryRepository repository;

    public List<Category> getAllCategories(){
        return repository.findAll();
    }

    public Category getCategoryById(int id){

        return repository.getById((long)id);
    }

    public Category createCategory (Category category){
        return repository.save(category);
    }

    public Category updateCategory(int id, Category category){
        Category dBCategory = getCategoryById(id);
        BeanUtils.copyProperties(category, dBCategory);
        return createCategory(dBCategory);
    }

    public List<Category> searchCategotyByName(String name){
        return repository.searchCategoryByName(name);
    }

    public void deleteProduct(int id){
        repository.delete(getCategoryById(id));
    }

}
