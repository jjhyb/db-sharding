package com.yibo.shardingcase.service;

import com.yibo.shardingcase.domain.entity.ProductInfo;
import com.yibo.shardingcase.domain.entity.ProductInfoDTO;

import java.util.List;
import java.util.Map;

public interface ProductService {

    /**
     * 新增商品
     * @param productInfo
     */
    void addProduct(ProductInfo productInfo);

    /**
     * 分页查询商品
     * @param pageNum
     * @param pageSize
     * @return
     */
    List<ProductInfoDTO> selectProductList(Integer pageNum, Integer pageSize);

    /**
     * 商品总数
     * @return
     */
    int selectCount();

    /**
     * 商品分组统计
     * @return
     */
    List<Map> selectProductGroupList();
}
