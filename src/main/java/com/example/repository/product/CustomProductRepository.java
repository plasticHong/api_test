package com.example.repository.product;

import com.example.dto.request.ProductSearchRequestDTO;
import com.example.entity.product.ProductEntity;

import java.util.List;

public interface CustomProductRepository {

    List<ProductEntity> DynamicSearchProducts(ProductSearchRequestDTO requestDTO);

}
