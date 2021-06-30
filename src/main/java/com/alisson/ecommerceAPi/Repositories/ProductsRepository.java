package com.alisson.ecommerceAPi.Repositories;

import com.alisson.ecommerceAPi.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductsRepository extends JpaRepository<Product, Long> {

    @Query(value = "select * from products where id_category = :categoryId", nativeQuery = true)
    public List<Product> getProductsByCategoty(@Param("categoryId") int categoryId);

    @Query(value="select * from products where name like %:name%", nativeQuery = true)
    public List<Product> searchProductsByName(@Param("name") String name);


}
