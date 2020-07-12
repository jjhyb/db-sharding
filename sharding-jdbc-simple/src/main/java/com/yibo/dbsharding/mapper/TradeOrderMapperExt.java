package com.yibo.dbsharding.mapper;

import com.yibo.dbsharding.domain.entity.TradeOrder;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface TradeOrderMapperExt extends Mapper<TradeOrder> {

    /**
     * 新增订单
     * @param tradeOrder
     * @return
     */
    int addTradeOrder(TradeOrder tradeOrder);

    /**
     * 根据id列表查询订单
     * @param orderIds
     * @return
     */
    List<TradeOrder> selectTradeOrderByIds(@Param("orderIds") List<Long> orderIds);

    /**
     * 根据和用户id和id列表查询订单
     * @param orderIds
     * @return
     */
    List<TradeOrder> selectTradeOrderByUserIdAndIds(@Param("userId") Long userId, @Param("orderIds") List<Long> orderIds);
}