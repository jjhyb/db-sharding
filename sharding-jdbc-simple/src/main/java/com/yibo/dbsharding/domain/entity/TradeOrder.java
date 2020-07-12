package com.yibo.dbsharding.domain.entity;

import java.math.BigDecimal;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Table(name = "trade_order_1")
public class TradeOrder {
    /**
     * 订单id
     */
    @Id
    @Column(name = "order_id")
    private Long orderId;

    /**
     * 订单价格
     */
    private BigDecimal price;

    /**
     * 下单用户id
     */
    private Long userId;

    /**
     * 订单状态
     */
    private String status;
}