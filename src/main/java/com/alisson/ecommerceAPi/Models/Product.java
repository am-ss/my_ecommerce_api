package com.alisson.ecommerceAPi.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "products")
public class Product {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "name", length = 60, nullable = false)
    String name;

    @Column(name = "image", length = 250)
    String image;

    @Column(name = "price", length = 20, nullable = false)
    String price;

    @Column(name = "amount", nullable = false)
    int amount;

    @ManyToOne
    @JoinColumn(name="id_category")
    private Category category;

}
