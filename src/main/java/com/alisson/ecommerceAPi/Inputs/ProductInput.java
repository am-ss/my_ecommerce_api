package com.alisson.ecommerceAPi.Inputs;
import com.alisson.ecommerceAPi.Models.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductInput {

    Long id;
    String name;
    String image;
    String price;
    int amount;
    private int categoryId;
}
