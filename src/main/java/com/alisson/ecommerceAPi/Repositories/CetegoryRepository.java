package com.alisson.ecommerceAPi.Repositories;

import com.alisson.ecommerceAPi.Models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CetegoryRepository  extends JpaRepository<Category, Long> {
}
