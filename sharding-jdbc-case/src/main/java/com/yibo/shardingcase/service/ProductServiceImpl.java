package com.yibo.shardingcase.service;

import com.yibo.shardingcase.domain.entity.ProductDescript;
import com.yibo.shardingcase.domain.entity.ProductInfo;
import com.yibo.shardingcase.domain.entity.ProductInfoDTO;
import com.yibo.shardingcase.mapper.ProductDescriptMapperExt;
import com.yibo.shardingcase.mapper.ProductInfoMapperExt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductInfoMapperExt productInfoMapper;

    @Autowired
    private ProductDescriptMapperExt productDescriptMapper;

    @Override
    @Transactional
    public void addProduct(ProductInfo productInfo) {
        //新增商品基本信息
        productInfoMapper.addProductInfo(productInfo);
        System.out.println("productInfoId: " + productInfo.getProductInfoId());
        ProductDescript productDescript = new ProductDescript();
        productDescript.setProductInfoId(productInfo.getProductInfoId());
        productDescript.setStoreInfoId(productInfo.getStoreInfoId());
        productDescript.setDescript("这是一件好商品");
        //新增商品描述信息
        productDescriptMapper.addProductDescript(productDescript);
    }

    @Override
    public List<ProductInfoDTO> selectProductList(Integer pageNum, Integer pageSize) {
        pageNum = (pageNum - 1) * pageSize;

        return productInfoMapper.selectProductList(pageNum,pageSize);
    }

    @Override
    public int selectCount() {
        return productInfoMapper.selectProductCount();
    }

    @Override
    public List<Map> selectProductGroupList() {
        return productInfoMapper.selectProductGroupList();
    }
}
