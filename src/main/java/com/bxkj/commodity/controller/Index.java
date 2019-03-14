package com.bxkj.commodity.controller;

import com.bxkj.commodity.entity.BxCommodityCommon;
import com.bxkj.commodity.service.IndexService;
import com.bxkj.commodity.common.Constant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @Description TODO
 * @Date 2019/3/14
 * @Version V1.0
 **/
@Controller
@RequestMapping("/")
public class Index {
    //日志
    private static Logger logger = LoggerFactory.getLogger(Index.class);


    IndexService indexService;

    /**
      * @Description 首页
      * @Date 2019/3/14
      * @Param
      * @return java.lang.String
      */
    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    /**
      * @Description 查询商品信息
      * @Date 2019/3/14
      * @Param
      * @return java.util.Map<java.lang.String,java.lang.Object>
      */
    @RequestMapping("/commodity")
    @ResponseBody
    public Map<String, Object> queryCommodityInfo() {
        Map<String, Object> result = new HashMap<>();
        try {
            //查询商品信息
            List<BxCommodityCommon> CommodityInfoList = indexService.queryCommodityInfo();
            result.put("code", Constant.SUCC_CODE);
            result.put("msg", Constant.SUCC_MSG);

        } catch (Exception e) {
            result.put("code", Constant.SUCC_CODE);
            result.put("msg", Constant.SUCC_MSG);
            logger.error("[操作异常-Msg:]" + e.getMessage());
        }
        return result;
    }
}
