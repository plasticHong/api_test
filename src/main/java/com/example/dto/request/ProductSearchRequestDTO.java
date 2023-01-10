package com.example.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductSearchRequestDTO {

    private String title = "";

    private String content = "";

    private Integer basicUserNumber = 0;

    private String address = "";

    private Integer age = 0;

}
