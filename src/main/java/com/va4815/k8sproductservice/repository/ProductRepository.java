package com.va4815.k8sproductservice.repository;

import com.va4815.k8sproductservice.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    boolean existsByProductCode(String productCode);
}
