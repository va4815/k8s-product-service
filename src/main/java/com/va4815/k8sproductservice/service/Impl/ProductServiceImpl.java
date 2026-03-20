package com.va4815.k8sproductservice.service.Impl;

import com.va4815.k8sproductservice.entity.Product;
import com.va4815.k8sproductservice.repository.ProductRepository;
import com.va4815.k8sproductservice.model.ProductDTO;
import com.va4815.k8sproductservice.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public ProductDTO saveProduct(ProductDTO product) {
        Product productEntity = toEntity(product);
        Product savedProduct = productRepository.save(productEntity);
        return toModel(savedProduct);
    }

    @Override
    public Optional<ProductDTO> getProductById(Integer id) {
        return productRepository.findById(id)
                .map(this::toModel);
    }

    @Override
    public List<ProductDTO> getAllProducts() {
        return productRepository.findAll().stream()
                .map(this::toModel)
                .toList();
    }

    @Override
    public void deleteProduct(Integer id) {
        productRepository.deleteById(id);
    }

    private Product toEntity(ProductDTO product) {
        return new Product(
                null,
                product.getProductCode(),
                product.getName()
        );
    }

    private ProductDTO toModel(Product product) {
        return new ProductDTO(product.getId(), product.getProductCode(), product.getName());
    }
}
