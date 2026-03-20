package com.va4815.k8sproductservice.model;

public class ProductDTO {

    private Integer id;
    private String productCode;

    private String name;

    public ProductDTO() {
    }

    public ProductDTO(Integer id, String productCode, String name) {
        this.id = id;
        this.productCode = productCode;
        this.name = name;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
