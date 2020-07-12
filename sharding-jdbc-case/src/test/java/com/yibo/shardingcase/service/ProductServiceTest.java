package com.yibo.shardingcase.service;

import com.yibo.shardingcase.domain.entity.ProductInfo;
import com.yibo.shardingcase.domain.entity.ProductInfoDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceTest {

    @Autowired
    private ProductService productService;

    @Test
    public void addProductTest(){
        for (int i = 0; i < 8; i++) {
            ProductInfo productInfo = new ProductInfo();
            productInfo.setStoreInfoId(2L);
            productInfo.setProductName("SpringBoot源码解析"+i);
            productInfo.setSpec("大号");
            productInfo.setRegionCode("110000");
            productInfo.setPrice(new BigDecimal("60"));
            productService.addProduct(productInfo);
        }
    }

    @Test
    public void selectProductListTest(){
        List<ProductInfoDTO> productInfoDTOS = productService.selectProductList(2, 10);
        productInfoDTOS.forEach(System.out::println);
    }

    @Test
    public void selectCountTest(){
        int count = productService.selectCount();
        System.out.println(count);
    }

    @Test
    public void selectProductGroupListTest(){
        List<Map> list = productService.selectProductGroupList();
        list.forEach(System.out::println);
    }
}
