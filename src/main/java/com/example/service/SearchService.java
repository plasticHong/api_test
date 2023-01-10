package com.example.service;

import com.example.dto.request.ProductSearchRequestDTO;
import com.example.entity.product.ProductEntity;
import com.example.repository.product.CustomProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class SearchService {

    CustomProductRepository repository;


    public List<ProductEntity> search(ProductSearchRequestDTO requestDTO){
        List<ProductEntity> productEntities = repository.DynamicSearchProducts(requestDTO);

        System.out.println("search result size: "+productEntities.size());

        for (ProductEntity p : productEntities
             ) {
            System.out.println(p.toString());
        }


        return productEntities;
    }


}
