package com.yibo.dbsharding.domain.entity;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Table(name = "trade_dict")
public class TradeDict {
    /**
     * 字典id
     */
    @Id
    @Column(name = "dict_id")
    private Long dictId;

    /**
     * 字典类型
     */
    private String type;

    /**
     * 字典编码
     */
    private String code;

    /**
     * 字典值
     */
    private String value;
}