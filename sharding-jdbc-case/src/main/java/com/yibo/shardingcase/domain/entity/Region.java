package com.yibo.shardingcase.domain.entity;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Table(name = "region")
public class Region {
    /**
     * id
     */
    @Id
    private Long id;

    /**
     * 地理区域编码
     */
    @Column(name = "region_code")
    private String regionCode;

    /**
     * 地理区域名称
     */
    @Column(name = "region_name")
    private String regionName;

    /**
     * 地理
     */
    private Boolean level;

    /**
     * 上级地理区域编码
     */
    @Column(name = "parent_region_code")
    private String parentRegionCode;
}