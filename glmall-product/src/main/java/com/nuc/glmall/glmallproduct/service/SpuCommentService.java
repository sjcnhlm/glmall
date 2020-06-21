package com.nuc.glmall.glmallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nuc.common.utils.PageUtils;
import com.nuc.glmall.glmallproduct.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author limiao
 * @email lm1318473126@163.com
 * @date 2020-06-21 18:03:57
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

