package com.yibo.shardingcase.mapper;

import com.yibo.shardingcase.domain.entity.ProductDescript;
import org.apache.ibatis.annotations.Options;
import tk.mybatis.mapper.common.Mapper;

public interface ProductDescriptMapperExt extends Mapper<ProductDescript> {

    /**
     * 添加商品描述信息
     * @param productDescript
     * @return
     */
    int addProductDescript(ProductDescript productDescript);
}