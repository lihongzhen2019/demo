package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.example.demo.controller.domain.Data;
import com.example.demo.controller.domain.ResponseJx;
import com.example.demo.domain.ResultMsg;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TiaoshiController {

    @GetMapping("/api/posts/categories/featured")
    public Object test1(){
        System.out.println("请求‘/api/posts/categories/featured’成功");
//        ResponseJx responseJx = new ResponseJx();
//        List<ResponseJx> jxList = new ArrayList<>();
//        jxList.add(responseJx);
//        jxList.add(responseJx);
//        ResultMsg resultMsg = new ResultMsg();
//        resultMsg.result = jxList;
//        System.out.println("返回JSON为："+JSON.toJSONString(resultMsg));
        Data data = new Data();
        return JSON.toJSON(data.json1);
    }
}
