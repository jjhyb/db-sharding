package com.yibo.shardingcase.domain.entity;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Table(name = "product_descript_1")
public class ProductDescript {
    /**
     * id
     */
    @Id
    private Long id;

    /**
     * 所属商品id
     */
    @Column(name = "product_info_id")
    private Long productInfoId;

    /**
     * 所属店铺id
     */
    @Column(name = "store_info_id")
    private Long storeInfoId;

    /**
     * 商品描述
     */
    private String descript;
}