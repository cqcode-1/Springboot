package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class JDBCController {

    @Autowired
    JdbcTemplate jdbcTemplate;
    private String sql;

    @RequestMapping("selectAll")
    public List<Map<String, Object>> selectAll(){
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from fc_building");
        return maps;
    }

    @RequestMapping("/add")
    public String addEmp(String escode, String bcode, String name){
        sql = "insert into fc_building(estate_code, building_code, building_name) values(?, ?, ?)";
        int update = jdbcTemplate.update(sql, escode, bcode, name);
        System.out.println(update);
        return update+"";
    }

    @RequestMapping("/delete/{code}")
    public String delete(@PathVariable("code")String fc_code){
        String sql = "delete from fc_building where building_code = "+ fc_code;
        jdbcTemplate.execute(sql);
        return "successfully";
    }
}
