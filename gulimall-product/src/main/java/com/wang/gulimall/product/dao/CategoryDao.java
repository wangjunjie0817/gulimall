package com.wang.gulimall.product.dao;

import com.wang.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author wang
 * @email 1916622321@qq.com
 * @date 2020-11-02 10:43:36
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
