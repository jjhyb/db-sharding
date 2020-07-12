package com.yibo.shardingcase.mapper;

import com.yibo.shardingcase.domain.entity.ProductInfo;
import com.yibo.shardingcase.domain.entity.ProductInfoDTO;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

public interface ProductInfoMapperExt extends Mapper<ProductInfo> {

    /**
     * 添加商品基本信息
     * @param productInfo
     * @return
     */
    int addProductInfo(ProductInfo productInfo);

    /**
     * 分页查询商品信息
     * @param pageNum
     * @param pageSize
     * @return
     */
    List<ProductInfoDTO> selectProductList(@Param("pageNum") Integer pageNum, @Param("pageSize")Integer pageSize);

    /**
     * 商品总数
     * @return
     */
    int selectProductCount();

    /**
     * 商品分组统计
     * @return
     */
    List<Map> selectProductGroupList();
}