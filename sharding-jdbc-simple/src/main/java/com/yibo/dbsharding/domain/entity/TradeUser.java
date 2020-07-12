package com.yibo.dbsharding.domain.entity;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Table(name = "trade_user")
public class TradeUser {
    /**
     * 用户id
     */
    @Id
    @Column(name = "user_id")
    private Long userId;

    /**
     * 用户名
     */
    private String username;

    /**
     * 用户类型
     */
    @Column(name = "user_type")
    private String userType;
}