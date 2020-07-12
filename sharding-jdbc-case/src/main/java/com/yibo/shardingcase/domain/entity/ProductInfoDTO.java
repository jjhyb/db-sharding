package com.yibo.shardingcase.domain.entity;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class ProductInfoDTO {

    private Long productInfoId;

    private Long storeInfoId;

    private String productName;

    private String spec;

    private String regionCode;

    private BigDecimal price;

    private String imageUrl;

    private String descript;

    private String regionName;
}
