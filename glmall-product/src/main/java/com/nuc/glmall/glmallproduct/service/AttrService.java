package com.nuc.glmall.glmallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nuc.common.utils.PageUtils;
import com.nuc.glmall.glmallproduct.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author limiao
 * @email lm1318473126@163.com
 * @date 2020-06-21 18:03:56
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

