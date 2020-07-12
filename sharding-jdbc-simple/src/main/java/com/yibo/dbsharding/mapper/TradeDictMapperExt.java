package com.yibo.dbsharding.mapper;

import com.yibo.dbsharding.domain.entity.TradeDict;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface TradeDictMapperExt extends Mapper<TradeDict> {

    /**
     * 新增字典表记录
     * @param tradeDict
     * @return
     */
    int addTradeDict(TradeDict tradeDict);

    /**
     * 删除字典表记录
     * @param dictId
     * @return
     */
    int deleteTradeDict(@Param("dictId") Long dictId);
}