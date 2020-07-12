package com.yibo.shardingcase.domain.entity;

import java.math.BigDecimal;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Table(name = "product_info_1")
public class ProductInfo {
    /**
     * id
     */
    @Id
    @Column(name = "product_info_id")
    private Long productInfoId;

    /**
     * 所属店铺id
     */
    @Column(name = "store_info_id")
    private Long storeInfoId;

    /**
     * 商品名称
     */
    @Column(name = "product_name")
    private String productName;

    /**
     * 规格
     */
    private String spec;

    /**
     * 产地
     */
    @Column(name = "region_code")
    private String regionCode;

    /**
     * 商品价格
     */
    private BigDecimal price;

    /**
     * 商品图片
     */
    @Column(name = "image_url")
    private String imageUrl;
}