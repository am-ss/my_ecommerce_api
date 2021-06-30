package com.alisson.ecommerceAPi.Repositories;

import com.alisson.ecommerceAPi.Models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CetegoryRepository  extends JpaRepository<Category, Long> {

    @Query(value="select * from categories where name like %:name%", nativeQuery = true)
    public List<Category> searchCategoryByName(@Param("name") String name);
}
