package com.example.sbservlet.controller;

import com.example.sbservlet.listener.MyListener;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class MyController {

    @RequestMapping(value = "/hello")
    @ResponseBody
    public String hello(HttpServletRequest request){
        request.getSession(true);
        return "sp";
    }

    @RequestMapping("/count")
    @ResponseBody
    public String current(){
        return "当前在线人数"+ MyListener.count;
    }


    @RequestMapping("/thy")
    public String hello(Model model){
        model.addAttribute("msg","Hello");
        //classpath:/templates/hello.html
        return "thy";
    }

    @RequestMapping("thymeleaf")
    public String thymeleaf(ModelMap map){

        map.put("thText","th:text设置文本内容 <b>加粗</b>");
        map.put("thUText","th:utext 设置文本内容 <b>加粗</b>");
        map.put("thValue","thValue 设置当前元素的value值");
        map.put("thEach","Arrays.asList(\"th:each\", \"遍历列表\")");
        map.put("thIf","msg is not null");
//        map.put("thObject",new Person("zhangsan",12,"男"));
        return "thymeleaf";
    }


}
