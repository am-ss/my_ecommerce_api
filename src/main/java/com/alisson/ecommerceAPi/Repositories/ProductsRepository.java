package com.alisson.ecommerceAPi.Repositories;

import com.alisson.ecommerceAPi.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository extends JpaRepository<Product, Long> {
}
