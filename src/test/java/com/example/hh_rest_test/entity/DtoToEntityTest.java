package com.example.hh_rest_test.entity;

import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class DtoToEntityTest {

    @Autowired
    ModelMapper modelMapper;

    @Test
    public void dtoConvertingTest() {
        com.example.hh_rest_test.dto.MemberDTO dto = new com.example.hh_rest_test.dto.MemberDTO();
        dto.setName("wee");

        MemberEntity entity = modelMapper.map(dto, MemberEntity.class);

        System.out.println("dto: "+dto);
        System.out.println("entity: "+entity);

    }

}
