package com.example.controller;


import com.example.dto.request.ProductSearchRequestDTO;
import com.example.entity.product.ProductEntity;
import com.example.service.SearchService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "search", description = "검색")
@RestController
@RequestMapping(value = "/search")
@AllArgsConstructor
public class SearchController {

    SearchService searchService;


    @Operation(summary = "상품 검색 test", description = "상품 검색 조건 테스트")

    @RequestMapping(method = RequestMethod.POST,value = "/product")
    public ResponseEntity<?> search(ProductSearchRequestDTO requestDTO){

        List<ProductEntity> productEntities = searchService.search(requestDTO);

        return new ResponseEntity<>(productEntities,HttpStatus.OK);
    }


}
