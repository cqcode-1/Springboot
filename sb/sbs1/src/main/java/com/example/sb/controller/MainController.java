package com.example.sb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;


@Controller
@RequestMapping("/rot")
public class MainController {

    @RequestMapping("/list")
//    @ResponseBody
    public String list(){
        return "hello";
    }


    @RequestMapping("/mapt")
    @ResponseBody
    public Map mapT(){
        final HashMap<String, String> map = new HashMap<>();
        map.put("v1", "vv1");
        map.put("v2", "vvw22");
        map.put("v3", "vvw232");
        return map;
    }
}
