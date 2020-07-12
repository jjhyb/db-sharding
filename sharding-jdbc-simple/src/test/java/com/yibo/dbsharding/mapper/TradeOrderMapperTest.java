package com.yibo.dbsharding.mapper;

import com.yibo.dbsharding.ShardingJDBCApplication;
import com.yibo.dbsharding.domain.entity.TradeOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TradeOrderMapperTest {

    @Autowired
    private TradeOrderMapperExt tradeOrderMapper;

    @Test
    public void insertTradeOrderTest(){
        for (int i = 1; i <= 10; i++) {
            TradeOrder tradeOrder = new TradeOrder();
            tradeOrder.setPrice(new BigDecimal(String.valueOf(i)));
            tradeOrder.setUserId(Long.valueOf(String.valueOf(i)));
            tradeOrder.setStatus("1");
            int addResult = tradeOrderMapper.addTradeOrder(tradeOrder);
            System.out.println(addResult);
        }
    }

    @Test
    public void selectTradeOrderByIdsTest(){
        List<Long> list = new ArrayList<>();
        list.add(488754744475516928L);
        list.add(488754744584568833L);
        List<TradeOrder> tradeOrders = tradeOrderMapper.selectTradeOrderByIds(list);
        tradeOrders.forEach(System.out::println);
    }

    @Test
    public void selectTradeOrderByUserIdAndIdsTest(){
        List<Long> list = new ArrayList<>();
        list.add(488754744475516928L);
//        list.add(488754744584568833L);
        List<TradeOrder> tradeOrders = tradeOrderMapper.selectTradeOrderByUserIdAndIds(3L,list);
        tradeOrders.forEach(System.out::println);
    }
}
