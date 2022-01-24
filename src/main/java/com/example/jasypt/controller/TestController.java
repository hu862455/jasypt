package com.example.jasypt.controller;

import com.alibaba.fastjson.JSON;
import com.example.jasypt.vo.ASRExtractDTO;
import com.example.jasypt.vo.OriginData;
import com.example.jasypt.vo.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author shuaihu4
 * @date 2022年01月24日 14:05
 */
@Controller
@Slf4j
public class TestController {

    @RequestMapping(value = "/asrim/push",method = RequestMethod.POST)
    @ResponseBody
    public Result pushRealtimeMsg(@RequestBody OriginData realTimeVo){
      log.info("接收到的实时消息: "+ JSON.toJSONString(realTimeVo));
      return new Result(200,"ok");
    }

    @RequestMapping(value = "/asrim/push/extract",method = RequestMethod.POST)
    @ResponseBody
    public Result pushElementMsg(@RequestBody List<ASRExtractDTO> elementMsgList){
        log.info("接收到的实时要素: "+ JSON.toJSONString(elementMsgList));
        return new Result(200,"ok");
    }
}
