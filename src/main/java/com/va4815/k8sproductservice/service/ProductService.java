package com.va4815.k8sproductservice.service;

import com.va4815.k8sproductservice.model.ProductDTO;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    ProductDTO saveProduct(ProductDTO product);

    Optional<ProductDTO> getProductById(Integer id);

    List<ProductDTO> getAllProducts();

    void deleteProduct(Integer id);
}
