package com.tatyanajacques.dscommerce.repositories;

import com.tatyanajacques.dscommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
