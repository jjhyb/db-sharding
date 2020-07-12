package com.yibo.dbsharding.mapper;

import com.yibo.dbsharding.domain.entity.TradeDict;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TradeDictMapperTest {
    
    @Autowired
    private TradeDictMapperExt tradeDictMapper;
    
    @Test
    public void addTradeDictTest(){
        TradeDict tradeDict = new TradeDict();
        tradeDict.setDictId(3L);
        tradeDict.setCode("2");
        tradeDict.setType("user_type");
        tradeDict.setValue("普通用户");
        tradeDictMapper.addTradeDict(tradeDict);

        TradeDict tradeDict1 = new TradeDict();
        tradeDict1.setDictId(4L);
        tradeDict1.setCode("3");
        tradeDict1.setType("user_type");
        tradeDict1.setValue("vip用户");
        tradeDictMapper.addTradeDict(tradeDict1);
    }

    @Test
    public void deleteTradeDictTest(){
        tradeDictMapper.deleteTradeDict(3L);
    }
}
