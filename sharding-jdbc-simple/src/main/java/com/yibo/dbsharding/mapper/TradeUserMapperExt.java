package com.yibo.dbsharding.mapper;

import com.yibo.dbsharding.domain.entity.TradeUser;
import com.yibo.dbsharding.domain.entity.TradeUserDao;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface TradeUserMapperExt extends Mapper<TradeUser> {

    /**
     * 新增用户
     * @param tradeUser
     * @return
     */
    int addUser(TradeUser tradeUser);

    /**
     * 根据id列表查询用户列表
     * @param userIds
     * @return
     */
    List<TradeUser> selectUserByIds(@Param("userIds") List<Long> userIds);


    List<TradeUserDao> selectUserInfoByIds(@Param("userIds") List<Long> userIds);
}