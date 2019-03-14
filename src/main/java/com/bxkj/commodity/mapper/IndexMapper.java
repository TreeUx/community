package com.bxkj.commodity.mapper;

import com.bxkj.commodity.entity.BxCommodityCommon;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface IndexMapper {
    List<BxCommodityCommon> queryCommodityInfo();
}
