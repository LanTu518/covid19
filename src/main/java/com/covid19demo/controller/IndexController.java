package com.covid19demo.controller;

import com.covid19demo.entity.NocvData;
import com.covid19demo.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private IndexService indexService;

    @RequestMapping("/query")
    @ResponseBody
    public List<NocvData> queryData(){
       List<NocvData> list = indexService.list();
       return list;
    }

}
