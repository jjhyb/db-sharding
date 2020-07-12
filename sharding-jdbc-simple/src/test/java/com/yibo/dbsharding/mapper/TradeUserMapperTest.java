package com.yibo.dbsharding.mapper;

import com.yibo.dbsharding.domain.entity.TradeUser;
import com.yibo.dbsharding.domain.entity.TradeUserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TradeUserMapperTest {

    @Autowired
    private TradeUserMapperExt tradeUserMapper;

    @Test
    public void addUserTest(){
        for (int i = 10; i < 14; i++) {
            TradeUser tradeUser = new TradeUser();
            tradeUser.setUserId(i + 1L);
            tradeUser.setUsername("姓名"+tradeUser.getUserId());
            tradeUserMapper.addUser(tradeUser);
        }
    }

    @Test
    public void selectUserByIdsTest(){
        List<Long> list = new ArrayList<>();
        list.add(1L);
        list.add(8L);
        List<TradeUser> tradeUsers = tradeUserMapper.selectUserByIds(list);
        tradeUsers.forEach(System.out::println);
    }

    @Test
    public void selectUserInfoByIdsTest(){
        List<Long> list = new ArrayList<>();
        list.add(1L);
        List<TradeUserDao> tradeUserDaos = tradeUserMapper.selectUserInfoByIds(list);
        tradeUserDaos.forEach(System.out::println);
    }
}
