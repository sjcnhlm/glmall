package com.nuc.glmall.glmallproduct.dao;

import com.nuc.glmall.glmallproduct.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author limiao
 * @email lm1318473126@163.com
 * @date 2020-06-21 18:03:57
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
