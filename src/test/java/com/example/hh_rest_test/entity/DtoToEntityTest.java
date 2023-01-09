package com.example.hh_rest_test.entity;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.FactoryBasedNavigableListAssert.assertThat;


@SpringBootTest
public class DtoToEntityTest {

    @Autowired
    ModelMapper modelMapper;

    @Test
    public void dtoConvertingTest() {

        String message = new String("hi");
        String message2 = new String("hi");

//        Assertions.assertThat(message).isEqualTo(message2);
        Assertions.assertThat(message.equals(message2)).isTrue();

    }

}
