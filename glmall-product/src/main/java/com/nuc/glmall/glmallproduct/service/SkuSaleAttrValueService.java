package com.nuc.glmall.glmallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nuc.common.utils.PageUtils;
import com.nuc.glmall.glmallproduct.entity.SkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author limiao
 * @email lm1318473126@163.com
 * @date 2020-06-21 18:03:56
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

