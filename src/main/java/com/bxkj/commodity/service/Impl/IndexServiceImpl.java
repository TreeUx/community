package com.bxkj.commodity.service.Impl;

import com.bxkj.commodity.entity.BxCommodityCommon;
import com.bxkj.commodity.mapper.IndexMapper;
import com.bxkj.commodity.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description TODO
 * @Author Breach
 * @Date 2019/3/14
 * @Version V1.0
 **/
@Service
public class IndexServiceImpl implements IndexService {

    @Autowired
    IndexMapper indexMapper;
    /**
      * @Description 查询商品信息
      * @Date 2019/3/14
      * @Param
      * @return java.util.Map<java.lang.String,java.lang.Object>
      */
    @Override
    public List<BxCommodityCommon> queryCommodityInfo() {
        return indexMapper.queryCommodityInfo();
    }
}
