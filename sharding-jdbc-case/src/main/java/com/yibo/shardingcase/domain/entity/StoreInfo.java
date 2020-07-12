package com.yibo.shardingcase.domain.entity;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Table(name = "store_info")
public class StoreInfo {
    /**
     * id
     */
    @Id
    private Long id;

    /**
     * 店铺名称
     */
    @Column(name = "store_name")
    private String storeName;

    /**
     * 信誉等级
     */
    private Integer reputation;

    /**
     * 店铺所在地
     */
    @Column(name = "region_code")
    private String regionCode;
}