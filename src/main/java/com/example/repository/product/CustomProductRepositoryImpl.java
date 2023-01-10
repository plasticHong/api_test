package com.example.repository.product;

import com.example.dto.request.ProductSearchRequestDTO;
import com.example.entity.member.QMemberEntity;
import com.example.entity.product.ProductEntity;
import com.example.entity.product.QProductEntity;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;

@Repository
public class CustomProductRepositoryImpl implements CustomProductRepository {

    QProductEntity product = new QProductEntity("q");
    private final JPAQueryFactory query;
    public CustomProductRepositoryImpl(JPAQueryFactory jpaQueryFactory) {
        this.query = jpaQueryFactory;
    }

    @Override
    public List<ProductEntity> DynamicSearchProducts(ProductSearchRequestDTO requestDTO) {
        return query
                .select(product)
                .from(product)
                .where(
                        eqTitle(requestDTO.getTitle()),
                        eqContents(requestDTO.getContent()),
                        eqAddress(requestDTO.getAddress()),
                        eqUserNumber(requestDTO.getBasicUserNumber()),
                        eqRecommendAge(requestDTO.getAge())
                        )
                .fetch();
    }

    private BooleanExpression eqRecommendAge(Integer age) {
        return Objects.isNull(age)? null:product.recommentAge.eq(String.valueOf(age));
    }

    private BooleanExpression eqUserNumber(Integer userNum) {
        return Objects.isNull(userNum)? null:product.basicUserNumber.eq(userNum);
    }

    private BooleanExpression eqAddress(String address){
        return Objects.isNull(address)? null: product.address.contains(address);
    }

    private BooleanExpression eqTitle(String title){
        return Objects.isNull(title)? null:product.title.contains(title);
    }

    private BooleanExpression eqContents(String contents){
        return Objects.isNull(contents)? null:product.programContentText.eq(contents);
    }



}
