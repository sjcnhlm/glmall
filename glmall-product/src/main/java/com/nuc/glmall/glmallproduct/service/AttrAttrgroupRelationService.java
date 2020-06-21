package com.nuc.glmall.glmallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nuc.common.utils.PageUtils;
import com.nuc.glmall.glmallproduct.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author limiao
 * @email lm1318473126@163.com
 * @date 2020-06-21 18:03:56
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

